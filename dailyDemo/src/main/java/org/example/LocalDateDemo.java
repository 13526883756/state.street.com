package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        /*
        * 扩展信息
          标准时间格式字符：yyyy 表示年 必须小写
          MM 表示月 必须大写，小写表示月份
          dd 表示天 必须小写
          HH/hh 表示小时 大小写均可
          mm 表示分钟，必须小写，大写表示月份
          ss 表示秒 必须小写 大写表示毫秒
          SS 表示毫秒 必须大写 小写表示秒
        *
        * */
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd-MM-YYYY");

//        SimpleDateFormat format = new SimpleDateFormat("DD-MM-YYYY HH:mm:ss");
        String localDateStr = localDate.format(dateTimeFormatter1);
        System.out.println(localDateStr);

    }
}
