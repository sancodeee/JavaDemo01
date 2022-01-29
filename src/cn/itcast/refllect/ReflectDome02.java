package cn.itcast.refllect;

import cn.itcast.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDome02 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
            //利用反射创建对象的两种方法
        //方法一：
        Class<Person> c = Person.class;//获取Class类的对象c

        Person p = c.newInstance();//通过Class类的对象c的newInstance()方法创建Person类的对象
        System.out.println(p);
        System.out.println("---------------");
        /*
        * 方法二：通过class对象的getDeclaredConstructors()方法
        *        创建构造方法对象con，再通过构造方法对象创建该Person类的对象
        * */
        Constructor<?>[] con = c.getDeclaredConstructors();//通过class对象c创建了构造方法对象con
        for(Constructor cons : con){
            System.out.println(cons);
        }//打印出所有的构造方法

        Constructor<Person> con2 = c.getConstructor();//通过class对象c去创建无参构造方法对象con2
        Person p2 = con2.newInstance();//通过构造方法对象con2调用construct类的newInstance()方法创建Person对象

    }
}
