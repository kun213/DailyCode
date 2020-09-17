package com.lk.day02.polymorphism07;

public class PingPangSport extends Sport implements English{
    @Override
    public void sport() {
        System.out.println("乒乓球运动员打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语!");
    }
}
