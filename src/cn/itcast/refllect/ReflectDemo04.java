package cn.itcast.refllect;
//

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

//反射获取成员变量并使用
public class ReflectDemo04 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> c = Class.forName("cn.itcast.domain.Person");//获取Class对象

        Field[] fields = c.getDeclaredFields();  //获取成员变量

        for(Field field: fields){
            System.out.println(field);
        }
        System.out.println("----------");

        //获取公共类型成员变量

        Field addressField = c.getField("address");


        //获取无参构造方法创建对象
        Constructor<?>[] con = c.getConstructors();
        Object obj = c.newInstance();

        //设置obj对象中address的值为 北京
        addressField.set(obj,"北京");
        System.out.println(obj);
        System.out.println("象征性的修改一下看看");

    }
}