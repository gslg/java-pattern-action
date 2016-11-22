package com.pattern.strategy.behaviors.impl;

import com.pattern.strategy.behaviors.FlyBehavior;

/**
 * Created by sclg1 on 2016/11/22.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Can not Fly..........");
    }
}
