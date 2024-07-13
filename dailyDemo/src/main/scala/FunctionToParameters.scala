object FunctionToParameters {
  def add(a:Int,b:Int) = a+b

  def main(args: Array[String]): Unit = {


    val b =add _
    val sum=b(10,11)
    print("sum="+sum)
    val c=11+12
    print(c)
  }
}
