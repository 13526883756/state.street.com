package study.hshp;

public class ConstructorDetail {
    public static void main(String[] args) {
        Person02 p1=new Person02("smith",11);
        Person02 p2=new Person02("smith");

    }
}
class Person02{
    String name;
    int age;
    //第一个构造器
    public Person02(String pName,int pAge){
        System.out.println("构造器被调用~~~~~~完成对象初始化");
        name=pName;
        age=pAge;
    }
    public Person02(String pName){
        System.out.println("第2个构造器");
        name=pName;
    }

}

