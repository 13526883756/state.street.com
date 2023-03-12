package org.example;

import java.util.function.Function;
import java.util.function.IntPredicate;

public class LambdaDemo01 {

/*
* lambda表达式  方法名（（参数）->{
* 方法体
* }）；
*
* 参数类型可以省略
* 方法体只有一句代码时大括号return和唯一一句代码的分号可以省略
* 方法只有一个参数时小括号可以省略
*
* */
 public static void    printNum(IntPredicate predicate) {
     int[] arr = {1, 2, 3, 4, 5, 6};
     for (int i:arr) {
     if (predicate.test(i)){
         System.out.println(i);
     }
     }
 }

 public static <R>R typeConver(Function<String,R> function) {
     String str = "1234";
     R result = function.apply(str);
     return result;

 }
    public static void main(String[] args) {
        printNum(value-> value%2==0);
        int reult=typeConver((String s)->{
            return Integer.valueOf(s);
        });


        System.out.println(reult);
        typeConver(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {

                return Integer.valueOf(s);
            }
        });
        printNum(new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value%2==0;
            }
        });
    }
}
