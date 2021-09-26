package com.lhm.reflect4train;

public class TestAll {
    /**
     * 1.回顾反射机制
     *      反射机制：可以操作字节码文件爱呢
     *      作用：让程序更加灵活
     *      java.lang.reflect
     *
     *      1.2 java中获取class的三种方式
     *          第一种：
     *              Class c=Class。forName(“完整类名”);
     *          第二种：class c=对象.getClass();
     *          第三种：
     *              class c=int.class;
     *              Class  c =String.class;
     *      1.5.    获取了Class后，可以调用无参构造方法来实例化对象
     *          Class c= Class.forNames(""java.util.Data);
     *          Object obj=o.newInstance();
     *          newInstance,底层调用了该类的无参构造方法，所以要保证该类有无参构造方法
     *
     *      1.6. 如果你只想让一个类的静态代码块执行，要怎么做
     *          Class.forName("该类的类名");
     *          这样类酒家在，类加载的时候，静态代码块执行
     *
     *      1.7,关于路径问题：
     *          获取文件绝对路径，但是该文件要求放在src下
     *          String Path=Thread.currentThread().
     *              getContextClassLoader.getResource("写相对路径，但是这个相对路径从src出发开始找").getPath();
     *          String Path=Thread.currentThread().
     *                getContextClassLoader.getResource(“a/bc”).getPath();
     *                //必须保证src下有a目录，a目录下有bc文件
     *
     *          InputStream in= Thread.currentThread().
     *                  getContextClassLoader.getResourceAsStream("com/lhm/xxx.properties");
     *
     *
     *       这种方式是为了获取一个文件的绝对路径，不受环境移植的影响，但是该文件要求放在类路径下，，也就是src/com/lhm。。。
     *       src下是类的跟路径
     *
     *       1.8 IO+Properties,怎么快速绑定属性资源文件？
     *       //要求 ，这个文件比在类路径下
     *          这个文件必须是以。properties结尾
     *
     *          ResourceBundle bundle=ResourceBundle.getBundle("com/lhm/xxx");
     *          String value=bundle.getString(key);
     *
     *
     */
}
