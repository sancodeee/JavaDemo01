package cn.itcast.refllect;

import cn.itcast.domain.Person;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ReflectDemo1 {
    /*
        * 获取Class的三种方式：
         * 1.Class.forName("全类名"),将字节码文件夹加载进内存，返回Class对象
         * 2.类名.class,通过类名的属性class获取
           3.对象.getClass()：getClass()方法在Object类中定义着
    * */
    public static void main(String[] args) throws Exception{
        //1.Class.forName("全类名")
        Class cls1 = Class.forName("cn.itcast.domain.Person");
        System.out.println(cls1);
        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);

        //3,对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);



        //比较三种对象
        System.out.println();
    }
}
