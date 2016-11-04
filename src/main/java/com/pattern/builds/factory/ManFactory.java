package com.pattern.builds.factory;

import com.pattern.builds.factory.products.Man;
import com.pattern.builds.factory.products.Person;

/**
 * Created by liuguo on 2016/11/4.
 */
public class ManFactory implements PersonFactory{
    public Person createPerson() {
        return new Man();
    }
}
