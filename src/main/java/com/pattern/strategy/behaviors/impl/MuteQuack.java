package com.pattern.strategy.behaviors.impl;

import com.pattern.strategy.behaviors.QuackBehavior;

/**
 * Created by sclg1 on 2016/11/22.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("做一个安静的美鸭子........");
    }
}
