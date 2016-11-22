package com.pattern.strategy.test;

import com.pattern.strategy.behaviors.impl.FlyNoWay;
import com.pattern.strategy.behaviors.impl.MuteQuack;
import com.pattern.strategy.domian.Duck;
import com.pattern.strategy.domian.impl.MallardDuck;
import org.junit.Test;

/**
 * Created by sclg1 on 2016/11/22.
 */
public class StrategyTest {
    @Test
    public void testStrategy(){
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new MuteQuack());
        duck.performFly();
        duck.performQuack();
    }
}
