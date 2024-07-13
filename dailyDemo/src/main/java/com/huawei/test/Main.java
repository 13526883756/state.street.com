package com.huawei.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        Scanner sn = new Scanner(System.in);
        while (sn.hasNextInt()) {
            int a = sn.nextInt();
            int b = sn.nextInt();
            System.out.println(a+b);
*/
        System.out.println();
        System.out.println(longestPalindrome());

        }



    public static int longestPalindrome() {
        int [] count= new int [128] ;
        String s="aaasss";
        int length=s.length();
        for(int i=0;i<length;++i){
             System.out.println(i);
            char c= s.charAt(i);
            count[c]++;
        }
        int ans=0;
        for(int v: count){
            ans+=v/2*2;
            if (v%2 ==1 && ans%2==0){
                ans++;
            }


        }
        return ans;

    }
}