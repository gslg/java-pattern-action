package com.pattern.builds.factory;

import com.pattern.builds.factory.products.Person;

/**
 * 定义：工厂方法(Factory Method)模式的意义是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类当中。
 * 核心工厂类不再负责产品的创建，这样核心类成为一个抽象工厂角色，仅负责具体工厂子类必须实现的接口，
 * 这样进一步抽象化的好处是使得工厂方法模式可以使系统在不修改具体工厂角色的情况下引进新的产品。
 *
 * 优点:从类关系上来说，它可以让客户端与具体的工厂与产品解耦，从业务角度来说，它让客户端与具体的产品解耦。
 * 适用的场景就是我们需要一个产品帮我们完成一项任务，但是这个产品有可能有很多品牌（像这里的mysql，oracle），
 * 为了保持我们对产品操作的一致性，我们就可能要用到工厂方法模式。
 *
 * 缺点:假设产品数量巨多，而且需要我们亲手去逐个实现的时候，工厂方法模式就会增加系统的复杂性，到处都是工厂类和产品类，
 * 而且这里所说的工厂类和产品类只是概念上的，真正的产品可能不是一两个类就能搞定，否则mysql和oracle的驱动包为啥要那么多类，
 * 而不是就一个Driver和一个Connection
 *
 * Created by liuguo on 2016/11/4.
 */
public interface PersonFactory {
    Person createPerson();
}
