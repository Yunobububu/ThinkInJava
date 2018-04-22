### Review
#### [Java的安装与运行][1]
* 安装JDK
* 设置环境变量(JAVAHOME;CLASSPATH;PATH)
* javac filename.java
* java filename

#### JDK 与 JRE
* JDK java development kit(开发)
* JRE java runtime environment(运行)
#### Java 基本数据类型

| 基本数据类型 | 长度 | 包装类|
| :-----:|:---------:| :------------:|
|boolean|-|Boolean|
|byte|1byte(8-bits)|Byte
|char|2byte(16-bits)|Character
|short|2byte(16-bits)|Short
|int|4byte(32-bits)|Integer
|float|4byte(32-bits)|Float
|long|8byte(64-bits)|Long
|double|8byte(64-bits)|Double

#### 类
* 包括字段(Field)和方法(Method)
* 字段：
* 类中的成员,可用的修饰符有private，public,protected,default,static,final;
#### Java中常用的关键字
* 修饰符private,protected,public
* static,final,violate,synchronized,this,super,
extends,implements,throw,throws,enum,try/catch/finally;
* private: 可用来修饰类,字段,方法;只能在类内部可见。
* protected: 可用来修饰字段和方法;在基类及其子类可见;
* public: 都可见
#### final 关键字
* final 修饰类,字段,方法
* 修饰类：类不可被继承。
* 修饰字段:
* 修饰方法：
* 修饰参数：
* default: 包内部可见
* static 可用来修饰类,字段,方法,内部块,enum,可直接使用ClassName.Field来调动。修饰方法  
可直接用ClassName.Method调用;
* 继承、封装、多态
##### 封装(类的可见性)
* public
* private
* default


#### Object
* 所有类的基类
* 包含方法：
* equals()：

```
/**
 *自反性:x.equals(x) return true;
 *传递性:if x.equals(y) return true && y.equals(z) return true,then x.equals.(z) return true;
 *对称性:if x.equals(y) return true ,then y.equals.(x) return true;
 *一致性:只要equals方法没被改变，调用多少次结果都应该一样。
 */
public boolean equals(Object obj){
    return (this == obj);
}
```

* hashCode()
* toString():
```
return getClass().getName() + "@" + Integer.toHexString(hashCode());
```

* wait()/wait(long timeout)/wait(long timeout,int nanos)
```
/**
 *线程将进入阻塞状态并且释放(relinquish any synchoroniziton claims)当前对象上的锁。这是
 *和sleep()不同之处。当等待时间到,notify()/notifyAll()或者Interrupted()
 *线程将继续运行。
 *@throws InllegalMonitorsExcetpion 如果当前线程没有当前对象的监视器(Monitor)。 
 *@throws InterruptedException 如果当前线程被其他线程中断；
 */
 
```
* notify()

```
/**
 *线程只有释放当前对象的锁之后才可以运行。
 *@throws IllegalMonitorsException 如果当前线程没有对象的锁。
 */
```

* notifyAll()
* getClass()
```
/*
 *Class<?> getClass()
 */
```
* clone()
```
/*
 *clone()语义:
 *x.clone() == x false;
 *x.clone().equals(s) true;
 *x.clone().getClass() == x.getClass();
 *@throws CloneUnsupportedException 如果没实现Cloneable接口
 /
```







[1]:https://www.cnblogs.com/xqx-qyy/p/7659805.html
