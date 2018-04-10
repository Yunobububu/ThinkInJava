package com.lvjinke.bit.innerclasses;

/*嵌套类可以用来代码测试,运行TestBed$Tester.class即可
  *找不到加载类解决办法：
  * 1:先cd到文件所在包进行编译 javac TestBed
  * 2:cd 到包的根路径 cd ../ 直到src
  * 3：java -cp . package.TestBed\$Tester(*nix需要对$转义)
  * https://blog.csdn.net/abcde474524573/article/details/53581187
  *

 */

public class TestBed {
    public void f(){System.out.println("f()");}
    //测试该类
        static  class Tester{
        public static void main(String[] args){
        TestBed test = new TestBed();
        test.f();
        }

    }
}
