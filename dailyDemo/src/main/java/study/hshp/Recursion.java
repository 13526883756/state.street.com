package study.hshp;

public class Recursion {


    public static void main(String[] args) {
        T t1=new T();
        int n = 7;
        int fibonacciNum = t1.fibonacci(n);
        System.out.println("当n="+n+"fibonacciNum is \t"+fibonacciNum);
        int day = 9;
        int peachNum = t1.peach(day);
        if (peachNum != -1) {
            System.out.println("第" + day + "天有" + peachNum + "个桃子");
        }

    }
}


class T {
    /*
     * 斐波那契数列（Fibonacci sequence），又称黄金分割数列，因数学家莱昂纳多·斐波那契（Leonardo Fibonacci）
     * 以兔子繁殖为例子而引入，故又称为“兔子数列”。
     *【兔子繁殖问题】
     *一般而言，兔子在出生两个月后，就有繁殖能力，一对兔子每个月能生出一对小兔子来。
     * 如果所有兔子都不死，那么一年以后可以繁殖多少对兔子？
     *
     * */

    public int fibonacci(int n) {

        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;

            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("输入有误 n必须大于1");
            return -1;
        }
    }





    /*
     * 猴子吃桃
     * 猴子第一天摘了若干个桃子，当即吃了一半，还不解馋，又多吃了一个；
     * 第二天，吃剩下的桃子的一半，还不过瘾，又多吃了一个；
     * 以后每天都吃前一天剩下的一半多一个，到第10天想再吃时，只剩下一个桃子了。
     * 问第一天共摘了多少个桃子？
     *
     * 规律：前一天的桃子=（后一天的桃子+1）*2
     * */


    public int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("day 在1-10");
            return -1;
        }
    }

}


