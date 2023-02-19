import org.apache.spark.{SparkConf, SparkContext}

object WordCount {

  def main(args: Array[String]): Unit = {
    val strList = List(
      "java scala",
      "hello java",
      "hello scala from java",
      "hello spark from scala",
      "hello world"
    )
    val sparkConf = new SparkConf().setAppName("WordCount")
      .setMaster("local")


    //通过传入的SparkConf配置对象实例化一个SparkContext
    val ss = new SparkContext(sparkConf)
    //从本地文件加载数据产生RDD
    val linesRdd = ss.makeRDD(strList)
    //将每一行的记录通过指定分隔符分隔
    val wordsRdd = linesRdd.flatMap {
      _.split(" ")
    }
    //将每一个单词设置为1  形成key-value
    /*wordsRdd.map((_, 1))
    (scala,3)
    (spark,1)
    (hello,4)
    (java,3)
    (from,2)
    (world,1)
    */
    val pairRdd = wordsRdd.map((_, 1))
    //相同的key的value进行聚合
    val resultRdd = pairRdd.reduceByKey(_ + _)
    //触发Job
    resultRdd.collect().foreach(println)
    println("========")
    val results = resultRdd.collect()
    for (result <- results) {
      println(result)
    }
    ss.stop()
  }


}
