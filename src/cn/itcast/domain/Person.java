package cn.itcast.domain;

public class Person {
    private String name;
    private int age;
    public String address;

    public Person(){     //无参构造方法 系统默认存在
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private Person(String address){  //私有有参构造方法
        this.address = address;
    }

    public Person(String name, int age,String address) {  //有参构造方法
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
