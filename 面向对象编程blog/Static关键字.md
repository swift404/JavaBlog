###  基本概念

​	使用static关键字修饰成员变量表示静态的含义，此时成员变量由对象层级提升为类层级，也就是整个类只有一份并被所有对象共享，该成员变量随着类的加载准备就绪，与是否创造对象无关。

### 使用方式

​	1.在非静态成员方法中既能访问非静态的成员又能访问静态的成员。（成员：成员变量+成员方法 ，静态成员被所有对象共享）

`错误:(15, 37) java: 无法从静态上下文中引用非静态 变量 this`

 	2.在静态成员方法中只能访问静态成员不能访问非晶态成员（成员：成员变量+成员方法，因此此时可能还没有创建对象）

​	3.在以后的开发中只有隶属于类层级并被所有对象共享的内容才可以使用static关键字修饰（不能滥用static关键字）

代码部分在（People、PeopleTest、Static）

### 构造块和静态代码块（熟悉）

​	1.构造块： 在类体中直接使用{}括起来的代码块

​	2.每创建一个对象都会执行一次构造块

​	3.静态代码块：使用static关键字修饰的构造块

​	4.静态代码块会随着类加载时执行一次

### 又见main方法

​	1.语法格式：

​				public static void main(String[] args){}

​	代码；MainTest

#### 案例题目（重点）

​	1.编程实现Singleton类的封装

​	2.编程实现SingletonTest类对Singleton类进行测试，要求main方法中能得到且只能得到该类的一个对象。

​	3.代码：Singleton 、SingletonTest

```
错误:(7, 24) java: Singleton() 在 Static关键字.Singleton 中是 private 访问控制
```

### 单例设计模式的概念

1. 在某些特殊场合中，一个类对外提供且只提供一个对象时，这样的累叫做单例类，而设计单例类的流程和思想叫做单例设计模式。

### 单例设计模式实现流程及实现方式

​	1. 私有化构造方法，使用private关键字修饰。

	2. 声明本类类型的引用指向本类类型的对象，并使用priva static关键字共同修饰。
 	3. 提供公有的get方法负责将对象返回出去，并使用public staitc关键字共同修饰
 	4. 实现方式：单例设计模式的实现方式有两种：饿汉式和懒汉式，推荐饿汉式

```
public class Singleton {
    //2.声明本类类型的引用指向本类类型的对象，使用private static 关键字共同修饰
   // private static Singleton sin = new Singleton(); //恶汉式
    private static Singleton sin = null;//懒汉式
    //1.私有化构造方法，使用private关键字修饰
    private Singleton(){}
        //3.提供公有的get方法负责将对象返回出去,使用public static关键字共同修饰
    public static Singleton getInstance(){
        //return sin;
        if(null == sin){
            sin = new Singleton();
        }
        return sin;
    }
```

