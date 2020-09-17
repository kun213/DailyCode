## day02面向对象【接口，多态】-2020.9.17

### 接口

接口: 在Java中是一种标准规则

在成员中全部定义抽象方法

当一个类中,所有的方法全是抽象方法的时候,将这个类定义为一个更加

贴切的定义,称为他接口. 理解为: 全部是抽象方法的类 (特殊的抽象类)

接口: 定义的关键字 interface

定义类class,编译完成是.class文件

定义接口interface,编译完成后是.class文件

------

**JDK1.7及以前版本的接口定义**

接口成员:

成员变量 : 固定修饰符  public static final  数据类型 变量名 = 值; (常量)

成员方法 : 固定修饰符  public abstract 返回值 方法名(参数列表);

接口中成员固定修饰符, 可以不写,但是你写和不写没有区别

javac编译,检测成员修饰符,如果不写, javac帮你写

```java
public interface MyInterface {
    public static final int A = 1;
    public abstract void show();
}
```

**接口的使用方式:**

1. 接口不能实例化对象,不能new对象

2. 需要定义类实现接口 (继承)  实现接口的关键字 implements

3. 重写接口中的抽象方法

4. 创建实现类的对象

------

类和类之间是继承关系,单继承

类和接口之间是实现关系,多实现

接口和接口之间是继承关系,接口支持多继承

一个接口,可以同时继承多个接口

```java
public class InterfaceDemo {
    public static void main(String[] args) {
        D d = new D();
        d.a();
        d.b();
        d.c();
    }
}
```

```java
package com.lk.day02.interface04;
/**
 * D类实现C接口,重写C接口,和C的父接口中的所有抽象方法
 */
public class D implements C {
    public void a(){
        System.out.println("a的重写方法");
    }
    public void b(){
        System.out.println("b的重写方法");
    }
    public void c(){
        System.out.println("c的重写方法");
    }
}
```

### 多态

多态的概念:（polymorphism01）

多态生活中,一个事物具备的多种形态

人: 张三  8岁上学(学生)  28岁工作(打工) 38岁作为父亲(有孩子) 58岁创业(老板)

蚊子:  卵  幼虫(孑孓)  蛹  成虫(吸血)  全变态昆虫

程序中的多态,对象的多态性

前提:

1: 要有继承或者是接口实现

2: 要有方法的重写

3: 建立对象

父类或者接口 变量 = new 子类或者实现类对象();

特点: 执行子类的方法重写

------

```java
package com.lk.day02.polymorphism02;
/**
 * 多态程序的实现细节:
 *   1: 成员变量特点
 *     编译: 看父类中是否有这个变量,如果有编译成功,否则编译失败
 *     运行: 运行父类中的变量
 *   2: 成员方法特点
 *     编译: 看父类中是否有这个方法,如果有编译成功,否则编译失败
 *     运行: 运行子类的方法重写
 *   小结论:
 *      变量,编译运行都是父类
 *      方法,编译父类,运行子类
 *
 *      编译看左边,运行看右边,代码中的等于号
 */
public class PolymorphismDemo {
    public static void main(String[] args) {
        Fu fu = new Zi();
        System.out.println(fu.a);
        fu.show();
    }
}
```

------

```java
package com.lk.day02.polymorphism03;
/**
 * 多态扩展性的体现
 *   父类 = new 子类()
 *  扩展性: 父类 = new 子类可以随意变换();
 *  调用方法,执行子类的方法重写
 */
public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        animal = new Dog();
        animal.eat(); }}
```

