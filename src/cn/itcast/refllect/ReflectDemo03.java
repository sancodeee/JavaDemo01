package cn.itcast.refllect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

         //私有构造方法创建对象实例的方法：

public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("cn.itcast.domain.Person");//获取Class对象

        Constructor<?> con = c.getDeclaredConstructor(String.class);//创建结构体对象con

        //暴力反射
//        public void setAccessible(boolean flag):值为true，表示取消访问检查
//        因为address构造方法是被private修饰，属于私有方法，因此无法创建该构造方法的对象，所以要采用setAccessible()方法取消访问检查
        con.setAccessible(true);//取消检查访问

        Object obj = con.newInstance("北京");
        System.out.println(obj);





    }
}
