package com.pattern.strategy.domian.impl;

import com.pattern.strategy.behaviors.impl.FlyWithWings;
import com.pattern.strategy.behaviors.impl.Quack;
import com.pattern.strategy.domian.Duck;

/**
 * Created by sclg1 on 2016/11/22.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    public void display() {
        System.out.println("我是一只Mallard Duck...");
    }
}
