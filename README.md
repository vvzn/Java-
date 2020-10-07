# Java-
experiment1

# 一、阅读程序（代码）
``` 
<br>Test.java:
package experiment;
import experiment.*;
public class Test {
	public static void main(String args[]) {
		CPU cpu=new CPU();
		HardDisk disk=new HardDisk();
		PC pc=new PC();
		cpu.setSpeed(2200);
		disk.setAmount(200);
		cpu.setPrice(4000);
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
}

<br>PC.java:
package experiment;
public class PC {
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU cpu) {
		this.cpu=cpu;
	    }
	void setHardDisk(HardDisk HD) {
		this.HD=HD;
	    }
	void show() {
		System.out.println("CPU的速度为"+ cpu.getSpeed());
		System.out.println("硬盘的容量为"+ HD.getAmount());
		System.out.println("CPU的价格为"+ cpu.getPrice());
	}
}

<br>CPU.java:
package experiment;
public class CPU {
 int speed;
 int price;
 void setSpeed(int speed) {
  this.speed=speed;
 }
 int getSpeed() {
  return speed;
 }
 void setPrice(int price) {
  this.price=price;
 }
 int getPrice() {
  return price;
 }
} 

<br>HardDisk.java:
package experiment;
public class HardDisk {
	int amount;
	void setAmount(int amount) {
		this.amount=amount;
	}
	int getAmount() {
		return amount;
	}
}

``` 

## 二、实验要求
<br>1.用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类。其中，CPU类要求getSpeed()返回speed的值，要求 setSpeed(int m)方法将参数m的值赋值给speed；HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount；PC类要求setCPU（CPU c）将参数c的值赋值给cpu，要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD，要求show()方法能显示cpu的速度和硬盘的容量。
<br>2.主类Test的要求:
<br>(1) main方法中创建一个CPU对象cpu,cpu将自己的speed设置为200。
<br>(2) main方法中创建一个HardDisk对象disk，disk将自己的amount 设置为200。
<br>(3) main方法中创建一个PC对象pc。
<br>(4) pc调用setCPU(CPU c)方法，调用时实参是cpu。
<br>(5) pc调用心setHardDisk(HardDisk h)方法，调用时实参是disk。
<br>(6) pc调用show()方法。

## 三、实验目的
<br>通过练习较为简单的编程题入手,感受如何使用Java编程,多多理解怎么调用函数,又该如何把结果运行出来。

## 四、实验过程
<br>第一步:先新建一个package,叫做experiment,在包里面再建4个class,分别为CPU.java\HardDisk.java\PC.java\Test.java。
<br>第二步:在PC类中建一个公共类PC,里面有变量cpu和HD,返回值变量为空,最后输出在Test里面设置好的速度,容量以及价格。
<br>第三步:在CPU中建一个公共类CPU,里面定义整型变量speed和price,并在最后返回这两个变量。
<br>第四步：在HarDisk中建一个公共类HardDisk，里面定义变量amount，并在最后返回amount。
<br>第五步：在Test中建一个公共类Test，里面把其他几个class里面的变量都赋好值,并在PC里面输出结果。

## 五、核心方法
<br>1.每一个class里面都需要建立一个公共类，在公共类里面定义变量。
<br>2.int 变量x,void set变量x(int 变量x){this.变量x=变量x}特别的关键。

## 六、实验结果


## 七、实验感想
<br>通过这次实验，我觉得我多少对Java编程有了更多的理解,知道了this的用法,还有如何调用main函数,怎么将结果输出。只有真正实践,才能有更深的体会和感悟,才能更好和更快地进步。
