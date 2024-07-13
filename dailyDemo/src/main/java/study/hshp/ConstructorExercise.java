package study.hshp;

public class ConstructorExercise {
    public static void main(String[] args) {
        Person03 p1=new Person03();
        System.out.println("p1.age= "+p1.age+"  p1.name= "+p1.name);

        Person03 p2=new Person03("smitch",11);
        System.out.println("p2.age= "+p2.age+"  p2.name= "+p2.name);

    }
}
class Person03{
    String name;
    int age;
    //第一个构造器
    public Person03(){
        System.out.println("构造器被调用~~~~~~完成对象初始化");
        age=18;
    }
    public Person03(String pName,int pAge){
        System.out.println("第2个构造器");
        name=pName;
        age=pAge;
    }

}

