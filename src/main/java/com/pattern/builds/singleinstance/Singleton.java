package com.pattern.builds.singleinstance;

/**
 * 饿汉式加载单例.
 * 这种方式没有像SingleInstance3那样使用静态内部类处理.
 * 主要的缺点就是当外部使用Singleton的其他任何一个静态实例都会造成singleton的初始化,
 * 而实际上可能并没有使用到singleton,造成内存的浪费.
 *
 *不过在有些时候，直接初始化单例的实例也无伤大雅，对项目几乎没什么影响，比如我们在应用启动时就需要加载的配置文件等，就可以采取这种方式去保证单例.
 * @see SingleInstance3
 * Created by liuguo on 2016/11/2.
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton(){
        return singleton;
    }
}
