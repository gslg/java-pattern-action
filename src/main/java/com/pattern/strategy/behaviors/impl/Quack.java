package com.pattern.strategy.behaviors.impl;

import com.pattern.strategy.behaviors.QuackBehavior;

/**
 * Created by sclg1 on 2016/11/22.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("呱呱叫.......");
    }
}
