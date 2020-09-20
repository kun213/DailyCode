package com.lk.day03.noname01;

public interface Myinterface {
    public abstract void show();

}
class  MyinterfaceImpl implements Myinterface{
    @Override
    public void show() {
        System.out.println("实现类重写方法");
    }
}
