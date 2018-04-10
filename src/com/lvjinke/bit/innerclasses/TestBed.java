package com.lvjinke.bit.innerclasses;

/*嵌套类可以用来代码测试,运行TestBed$Tester.class即可
  *找不到加载类解决办法：
  * https://blog.csdn.net/abcde474524573/article/details/53581187
  *

 */

public class TestBed {
    public void f(){System.out.println("f()");}

    public static  class Tester{
        public static void main(String[] args){
        TestBed test = new TestBed();
        test.f();
        }

    }
}
