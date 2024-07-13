package study.hshp;

public class PropertiesDetail {
    public static void main(String[] args) {

        //创建对Person对象
        //p1 是对象名（对象引用）
        Person p1 =new Person();
        //对象属性默认值
        System.out.println("\n当前这个人信息");
        System.out.println("age:"+p1.age+"\r name"+p1.name);


    }



}
class Person{
    //四个属性
    int age;
    String name;
    double sal;
    boolean isPass;
}