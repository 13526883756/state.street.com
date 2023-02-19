package streaming

import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.{Seconds, StreamingContext}

object SparkStreamingWC {
  def main(args: Array[String]): Unit = {
    //StramingContext 对象入口

    val conf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("SparkStreamingWordCount")
    // val ssc=new StreamingContext().sparkContext

    val stc = new StreamingContext(conf = conf, batchDuration = Seconds(((5))))
    val value = stc.socketTextStream(args(0),args(1).toInt, StorageLevel.MEMORY_AND_DISK_SER)
    val words = value.flatMap(_.split(" "))
    val wordCount = words.map(x => (x, 1)).reduceByKey(_ + _)
    wordCount.print()
    stc.start()
    stc.awaitTermination()
  }

}
