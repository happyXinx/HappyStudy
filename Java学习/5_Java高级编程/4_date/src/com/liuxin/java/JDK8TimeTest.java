package com.liuxin.java;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JDK8TimeTest {

    @Test
    public void testDate(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of 设置指定的年、月、日、时、分、秒
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 8,12,12,12);
        System.out.println(localDateTime1);

        //体现了不可变性
        //withXXX 设置相关的属性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        //加减操作
        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

    }

    /**
     * Instant的使用
     * 类似于java.util.Date类
      */

    @Test
    public void test2(){

        //now():获取本初子午线的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);

        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        //获取自1970年1月1日0时0分0秒开始的毫秒数
        long milli = instant.toEpochMilli();
        System.out.println(milli);


        //通过给定的毫秒数，获取instant实例--》Date()
        Instant instant1 = Instant.ofEpochMilli(1623670140296L);
        System.out.println(instant1);
    }

    /*
    DateTimeFormatter: 格式化或解析日期、时间
    类似于SimpleDateFormat
     */
    @Test
    public void test3(){
        //方式1：预定义的标准格式。如 ISO_LOCAL_DATE_TIME;

        //方式2：本地化相关的格式。如：ofLocalizedDateTime()
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String str3 = formatter2.format(LocalDate.now());
        System.out.println(str3);

        //方式3：自定义的格式。如ofPattern("yyyy-MM-dd hh:mm:ss E")
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);

    }

}
