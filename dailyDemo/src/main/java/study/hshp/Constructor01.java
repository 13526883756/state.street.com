package study.hshp;

public class Constructor01 {
    public static void main(String[] args) {
        Person01 p1=new Person01("Smith",90);
        System.out.println("p1.name="+p1.name);
        System.out.println("p1.age="+p1.age);
    }
}
class Person01{
    String name;
    int age;


    /*构造器
    * 1：构造器没有返回值也不能写void
    * 2：构造器的名称和类person一样
    * 3：（String pName,int  pAge）是构造器形参列表  规则和成员方法一样
    * */
    public Person01(String pName,int pAge){
        System.out.println("构造器被调用~~~~~~完成对象初始化");
        name=pName;
        age=pAge;
    }
}
