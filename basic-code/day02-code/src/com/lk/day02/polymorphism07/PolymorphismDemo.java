package com.lk.day02.polymorphism07;

public class PolymorphismDemo {
    public static void main(String[] args) {
      PingPangSport pingPangSport = new PingPangSport(); {
            pingPangSport.setName("张继科");
            pingPangSport.setAge(35);
            pingPangSport.sport();
          System.out.println(pingPangSport.getName()+pingPangSport.getAge());
          pingPangSport.speakEnglish();

          PingPangCoash pingPangCoash = new PingPangCoash();
          pingPangCoash.setName("刘国梁");
          pingPangCoash.setAge(55);
            System.out.println(pingPangCoash.getName()+pingPangCoash.getAge());
          pingPangCoash.coash();
          pingPangCoash.speakEnglish();
        }
    }
}
