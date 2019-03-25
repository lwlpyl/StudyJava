# 第二讲 Java基本语法

## 1.数据类型

8种基本数据类型：

* byte 1个字节
* short 2个字节
* int 4个字节
* long 8个字节
* float 4个字节
* double 8个字节
* char 2个字节，采用Unicode编码
* boolean 1个字节，true或者false

引用数据类型：

* 类
* 接口
* 数组

二者差别：

* 基本数据类型变量在栈区，在“这里”，赋值时复制的是值

* 引用数据类型变量引用到堆区，在“那里”，赋值时复制的是引用

## 2.标识符

* 大小写敏感
* 由字母、数字、下划线、美元符号组成
* 不能以数字开头
* 最好与其意义相符，增强可读性
* 驼峰法则

## 3.运算符与表达式

总体来说与C语言和C++相似：

* 算术运算符：+、-、*、/、%、++、--
* 关系运算符：>、>=、<、<=、==、!=
* 逻辑运算符：&、|、!、^、&&、||
* 位运算符：&、|、^、~、>>、<<、>>>
* 赋值运算符：=、+=、-=、*=、/=、%=
* 字符串连接运算符：+

## 4.流程控制语句

程序的三种基本结构:
* 顺序
* 分支 if、switch
* 循环 for、while、do-while

break和continue:
* break 结束循环
* continue 跳过当前循环进入下一循环


if示例：

```
	public static boolean isLeapYear(int year) {
		if( (year%4==0 && year%100!=0) || (year%400==0) ) {
			return true;
		}
		return false;
	}
```

switch示例：

```
	public static void main(String[] args) {
		char grade = 'C';
		switch(grade) {
		case 'A':
			System.out.println("91~100");
			break;
		case 'B':
			System.out.println("81~90");
			break;
		case 'C':
			System.out.println("71~80");
			break;
		case 'D':
			System.out.println("61~70");
			break;
		default:
			System.out.println("error!");
		}
	}
```

3种循环结构示例：

```
	public static void main(String[] args) {
		// for循环
		int count = 0;
		for(int i=0; i<=100; i++) {
			count += i;
		}
		System.out.println(count);
		
		// while循环
		count = 0;
		int i = 0;
		while(i<=100) {
			count += i;
			i++;
		}
		System.out.println(count);
		
		// do-while循环
		count = 0;
		i = 0;
		do {
			count += i;
			i ++;
		}while(i<=100);
		System.out.println(count);
	}
```

## 5.注释

* 单行注释 
* 多行注释
* doc注释

生成文档：

```
	javadoc Hello.java
```

## 6.编译运行

```
	javac Hello.java
	java Hello
```


