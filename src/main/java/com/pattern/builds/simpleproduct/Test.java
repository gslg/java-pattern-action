package com.pattern.builds.simpleproduct;

/**
 * Created by liuguo on 2016/11/3.
 */
public class Test {
    public static void main(String[] args) {
        Person man = PersonFactory.createPerson("man");
        man.walk();
        Person women = PersonFactory.createPerson("women");
        women.walk();
    }
}
