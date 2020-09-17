package com.lk.day02.polymorphism07;

public class PingPangCoash extends Coash implements English{
    @Override
    public void coash() {
        System.out.println("乒乓球教练教打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练学习英语");
    }
}
