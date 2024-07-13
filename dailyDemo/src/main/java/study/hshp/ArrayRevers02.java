package study.hshp;

import java.util.Arrays;

public class ArrayRevers02 {
    public static void main(String[] args) {

        //定义一个数组
        int[]arr={11,22,33,44,55,66,77,88,99,00};
        System.out.println(arr.length);
        int[]arr2=new int[arr.length];
        for (int i=arr.length-1,j=0;i>0;i--,j++){

            arr2[j]=arr[i];

        }
        arr= arr2;
        Arrays.stream(arr).forEach(System.out::println);
        //使用逆序赋值方式
        //1: 创建一个新的数组 arr2 大小 arr.lentgh
        //2： 逆序遍历arr 将每个数组中的元素拷贝到arr2的元素中（顺序拷贝）
    }

}
