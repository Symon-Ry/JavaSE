# day07_课后练习

# 基础练习

## 第1题

知识点：可变参数

案例：

​	在Count类中，声明如下方法：

1、public long  sum(int...  nums)：求0~n个整数的累加和，如果没有传参，就返回0

2、public int max(int a, int... others)：求1~n个整数中的最大值

3、public String concat(String...  strings)：求0~n个字符串的拼接结果

4、public boolean isEven(int... nums)：判断0~n个整数是否都是偶数，如果都是偶数，返回true，否则返回false

​	声明一个Test01测试类，并在main方法中调用测试

## 第2题

知识点：方法的声明与调用、方法的重载

案例：

​	声明一个图形工具类GraphicTools，包含如下方法：

1、void printRectangle()：该方法打印5行5列*矩形

2、void printRectangle(int line, int column, String sign)：该方法打印line行colomn列由sign组成的矩形

3、double getTriangleArea(double base, double height)：根据底边和底边对应的高求三角形面积

4、double getTriangleArea(double a, double b, double c)：根据三角形的三条边求三角形面积，如果a,b,c不能组成三角形，打印不能组成三角形，并返回0.0

​	声明Test02测试类，并在main方法中调用测试

## 第3题

知识点：方法的重载

案例：

​	声明一个数组工具类MyArrays，包含如下方法：

1、int  binarySearch(int[]  arr,  int  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确

2、int  binarySearch(char[]  arr,  char  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确

3、int  binarySearch(double[]  arr,  double  value)：使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确

4、int[]  copy(int[] arr , int length)：从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。

5、double[]  copy(double[] arr , int length)：从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。

6、char[]  copy(char[] arr , int length)：从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。

7、void sort(int[] arr)：可以给arr数组从小到大排序，用冒泡排序实现

8、void sort(char[] arr)：可以给arr数组从小到大排序，用冒泡排序实现

9、void sort(double[] arr)：可以给arr数组从小到大排序，用冒泡排序实现

​	声明Test03测试类，并在main方法中调用测试

## 第4题

知识点：方法的参数传递机制

案例：

​	声明圆Circle类，包含radius属性（本题属性不私有化）

​	在PassParamDemo类中，声明如下方法，并体会方法的参数传递机制：

1、public void  doubleNumber(int num)：尝试将num变为原来的2倍大，看是否可以将给num赋值的实参变量值也扩大2倍，如果不能，请画图说明为什么？

2、public void toUpperCase(char letter)：尝试将letter的小写字母转为大写字母，看是否可以将给letter赋值的实参变量值也转为大写，如果不能，请画图说明为什么？

3、public void expandCircle(Circle  c，double times)：尝试将Circle的c对象的半径扩大为原来的times倍，看是否可以将给c赋值的实参对象的半径也扩大times倍，如果可以，请画图说明为什么？

4、public void sort(int[] arr)：尝试对arr数组实现从小到大排序，看是否可以将给arr赋值的实参数组也排序，如果可以，请画图说明为什么？

​	在Test04测试类的main()方法中调用测试

## 第5题

知识点：对象数组

案例：

​	1、声明一个Employee员工类，

​		包含属性：编号(id)、姓名(name)、薪资(salary)、年龄(age)，此时属性不私有化

​		包含方法：

​		（1）void printInfo()：可以打印员工的详细信息

​		（2）void setInfo(int  i, String n, double s, int a)：可以同时给id,name,salary,age赋值

​	2、声明一个EmployeeManager类，包含如下方法：

​	（1）public void print(Emplyee[] all)：遍历打印员工数组中的每个员工的详细信息

​	（2）public void sort(Employee[] all)：将all员工数组按照年龄从高到低排序

​	（3）public void addSalary(Employee[] all, double increament)：将all员工数组的每一个员工的工资，增加increament

​	3、声明Test05测试类

（1）public static void main(String[] args)：在main方法中，创建Employee[]数组，并创建5个员工对象放到数组中，并为员工对象的属性赋值

（2）创建EmployeeManager对象，

（3）调用print方法，显示员工信息

（4）调用sort方法对员工数组进行按照年龄排序，并调用print方法，显示员工信息

（5）调用addSalary方法给每一个员工加薪1000元，并调用print方法，显示员工信息





# 递归练习（难）

## 第6题

用递归实现不死神兔：故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。

在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，

再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，没有发生死亡，

问：现有一对刚出生的兔子2年后(24个月)会有多少对兔子?



## 第7题

描述：猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了快一半，还不过瘾，又多吃了一个。第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。以后每天都吃了前一天剩下的一半多一个。到第十天，只剩下一个桃子。试求第一天共摘了多少桃子？

## 第8题

通项公式如下：f(n)=n + (n-1) + (n-2) + .... + 1，其中n是大于等于5并且小于10000的整数，例如：f(5) = 5 + 4 + 3 + 2 + 1，f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，请用递归的方式完成方法long f( int n)的方法体。

## 第9题

有n步台阶，一次只能上1步或2步，共有多少种走法？

# 代码阅读题

## 第10题

知识点：方法的参数传递

案例：分析运行结果

```java
package com.atguigu.test10;

public class Test10 {
	public static void main(String[] args) {
		Other o = new Other();
		new Test12().addOne(o);
		System.out.println(o.i);
	}
	
	public void addOne(Other o){
		o.i++;
	}
}
class Other{
	public int i;
}
```

## 第11题

知识点：方法的参数传递

案例：分析运行结果

```java
package com.atguigu.test11;

public class Test11 {
	public static void main(String[] args) {
		int i = 0;
		change(i);
		i = i++;
		System.out.println("i = " + i);
	}
	public static void change(int i){
		i++;
	}
}

```

