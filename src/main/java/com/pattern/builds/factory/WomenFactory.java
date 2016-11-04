package com.pattern.builds.factory;

import com.pattern.builds.factory.products.Person;
import com.pattern.builds.factory.products.Women;

/**
 * Created by liuguo on 2016/11/4.
 */
public class WomenFactory implements PersonFactory {
    public Person createPerson() {
        return new Women();
    }
}
