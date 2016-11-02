package com.pattern.builds.singleinstance;

/**
 * 双重锁在并发考虑下是没有问题的.
 * 如果我们深入到JVM中去探索上面这段代码，它就有可能（注意，只是有可能）是有问题的。

 *因为虚拟机在执行创建实例的这一步操作的时候，其实是分了好几步去进行的，也就是说创建一个新的对象并非是原子性操作。
 * 在有些JVM中上述做法是没有问题的，但是有些情况下是会造成莫名的错误。

 *首先要明白在JVM创建新的对象时，主要要经过三步。

 *1.分配内存

 *2.初始化构造器

 *3.将对象指向分配的内存的地址

 *这种顺序在上述双重加锁的方式是没有问题的，因为这种情况下JVM是完成了整个对象的构造才将内存的地址交给了对象。
 * 但是如果2和3步骤是相反的（2和3可能是相反的是因为JVM会针对字节码进行调优，而其中的一项调优便是调整指令的执行顺序），就会出现问题了。

 *因为这时将会先将内存地址赋给对象，针对上述的双重加锁，就是说先将分配好的内存地址指给instance，然后再进行初始化构造器，
 * 这时候后面的线程去请求getInstance方法时，会认为instance对象已经实例化了，直接返回一个引用。
 * 如果在初始化构造器之前，这个线程使用了instance，就会产生莫名的错误
 *
 * @see SingleInstance3 使用静态内部类+静态实例域解决上述问题
 *
 * 如果使用JDK1.5以上版本,可以给 静态的实例属性加上关键字volatile.
 * volatile变量标识该属性不需要优化，也就是说禁止JVM指令重排序，并且强行保证线程中对变量所做的任何写入操作对其他线程都是即时可见的.
 * 总之volatile会强行将对该变量的所有读和取操作绑定成一个不可拆分的动作.
 * Created by liuguo on 2016/10/31.
 */
public class SingleInstance2 {
    private static  SingleInstance2 instance = null;
    private SingleInstance2(){}

    public SingleInstance2 getInstance(){
        //双重锁检查
        if(instance == null){
            synchronized (SingleInstance2.class) {
                if(instance == null){
                    instance = new SingleInstance2();
                }
            }
        }
        return instance;
    }
}
