package com.liuxin.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest {


    @Test
    public void testSimpleDateFormat() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat();

        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        // 按照指定的方式进行格式化和解析：调用带参数的构造器
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);

        String dateStr = "2021-06-14 06:29:35";
        Date date2 = sdf1.parse(dateStr);
        System.out.println(date2);

    }

    /**
     * 练习：将字符串“2020-09-08”转换成java.sql.date
     */

    @Test
    public void testExer() throws ParseException {
        String birth = "2020-09-08";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(birth);

        java.sql.Date date1 = new java.sql.Date(date.getTime());

        System.out.println(date1);
    }

}
