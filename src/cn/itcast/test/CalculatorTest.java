package cn.itcast.test;

import cn.itcast.junit.Calculator;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {  //测试类
  /*
  * 资源申请方法
  * 在所有测试方法执行之前，都会自动执行该方法
  *修饰的方法在测试之前执行
  * */
  @Before
    public void init(){
      System.out.println("init...1111最开始执行");
    }

  /*
  * 资源释放的方法
  * 在所有资源执行之后，都会自动执行该方法
  *修饰的方法在测试之后执行
  * */
  @After
    public void close(){
      System.out.println("close...2222222最后执行");
    }



/*
* 测试add方法
* */
  @Test
  public void testAdd() {
        //创建对象
      Calculator c = new Calculator();
//      调用add方法测试
      int result = c.add(1,2);
//      System.out.println(result);
    Assert.assertEquals(3,result);

  }
  @Test
  public void testSub(){

    Calculator c = new Calculator();
    int result = c.sub(2,1);
    Assert.assertEquals(1,result);
    System.out.println("测试方法执行了");
  }
}
