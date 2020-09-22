package com.lk.day04.date;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        //随机输入年份
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        cal.set(year,2,1);
        cal.add(Calendar.DAY_OF_MONTH,-1);
        int date = cal.get(Calendar.DATE);
        System.out.println(year+"年的2月有"+date+"天");
    }
}
