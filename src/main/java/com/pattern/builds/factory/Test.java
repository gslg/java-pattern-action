package com.pattern.builds.factory;

import com.pattern.builds.factory.products.Person;

/**
 * 我们使用可以随意的在具体的工厂和产品之间切换，并且不需要修改任何代码，就可以让原来的程序正常运行，
 * 这也是工厂方法模式对扩展开放的表现，另外工厂方法模式弥补了简单工厂模式不满足开闭原则的诟病，
 * 当我们需要增加产品时，只需要增加相应的产品和工厂类，而不需要修改现有的代码。
 *
 * Created by liuguo on 2016/11/4.
 */
public class Test {
    public static void main(String[] args) {
        PersonFactory factory = new WomenFactory();
        Person person = factory.createPerson();
        person.walk();

        factory = new ManFactory();
        person = factory.createPerson();
        person.walk();

    }
}
