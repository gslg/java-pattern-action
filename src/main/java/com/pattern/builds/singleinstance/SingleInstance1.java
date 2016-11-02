package com.pattern.builds.singleinstance;

/**
 * 单例模式
 * 以下示例是最基本的.在并发模式下可能产生多个实例.
 * @see SingleInstance2
 * Created by liuguo on 2016/10/31.
 */
public class SingleInstance1 {

    //一个静态的实例
    private static SingleInstance1 instance = null;

    //私有化构造器，防止初始化
    private SingleInstance1(){}

    //获取实例
    public static SingleInstance1 instance(){
        if(instance == null){
            instance = new SingleInstance1();
        }
        return instance;
    }
}

