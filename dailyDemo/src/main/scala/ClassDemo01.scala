object ClassDemo01 {
/*
* 伴生对象和半生类必须要有一样的名称
* 伴生对象和伴生类在同一个Scala源文件中
* 伴生对象和伴生类可以互相访问private属性
*
* */

  //定义一个伴生Class
  class Generals{
    //里面写的内容都是非静态的
    //定义一个toWar（）方法表示打仗
    def toWar()=print(s"武将拿着${Generals.armsName}武器,上阵上敌")

  }

  //定义伴生对象
  object Generals{
    private val armsName="青龙偃月刀"
  }
  def main(args: Array[String]): Unit = {
    //创建伴生类对象
    val c=new Generals
    c.toWar()
  }

}
