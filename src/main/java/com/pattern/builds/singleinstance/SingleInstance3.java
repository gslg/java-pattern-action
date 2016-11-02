package com.pattern.builds.singleinstance;

/**
 * 静态内部类+静态实例域保证单例
 * 这种方式为何会避免了SingleInstace2产生的莫名的错误，主要是因为一个类的静态属性只会在第一次加载类时初始化，
 * 这是JVM帮我们保证的，所以我们无需担心并发访问的问题。
 * 所以在初始化进行一半的时候，别的线程是无法使用的，因为JVM会帮我们强行同步这个过程。
 * 另外由于静态变量只初始化一次，所以SingleInstance3仍然是单例的
 *
 * @see SingleInstance2
 * @see Singleton 饿汉式加载
 * Created by liuguo on 2016/11/2.
 */
public class SingleInstance3 {

    private SingleInstance3(){}

    public static SingleInstance3 getInstance(){
        return Single.instance;
    }

    public static void test(){
        System.out.println("test");
    }

    private static class Single{
        static SingleInstance3 instance = new SingleInstance3();
    }
}
