
/**
 * 文档注释
 * 变量：
 * 1、变量名称一定是小驼峰
 *  标识符：数字，字母，下划线,$
 *  数字或者下划线开头
 * 2.变量在使用之前一定要初始化
 */

/*
块注释
 */

//行注释    

class Test {

}

public class TestDemo {

	public static void main(String[] args) {
		boolean flg = true;
		System.out.println(flg);

		/*if(1) {
			System.out.println("hhhhhh");
		}*/
	}

	public static void main7(String[] args) {
		/**
		 * byte 1  
		 * short  2   短整型
		 * int  4     整型
		 * long 8     长整型
		 * 美林数据   
		 * 
		 * 面试问题：
		 * 你说一下，Java当中的基本数据类型有哪些？
		 * byte short  int   long  float   double 
		 * char     boolean 
		 */
		short sh = 18;
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}

	public static void main6(String[] args) {
		byte b = 10;
		System.out.println(b);

		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

	}

	public static void main5(String[] args) {
		/**
		 * 2个字节
		 * 16 bit
		 * 
		 * Double  Float   Long    Integer  Character
		 * 
		 */
		char ch = 'f';//单引号引起来的就是一个字符

		System.out.println(ch);

	}

	public static void main4(String[] args) {
		float f = 12.5f;
		System.out.println(f);

		double d = 12.8;
		System.out.println(d);

		double a = 1.0;
		double b = 2.0;
		System.out.println(a / b);

		double num = 1.1;
		System.out.println(num * num);


	}

	/**
	 * long:8个字节   64
	 * -2^63 - 2^63 -1
	 * @param args [description]
	 */
	public static void main3(String[] args) {
		long a = 10L;
		System.out.println(a);

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

	}


	public static void main2(String[] args) {
		/*int _ = 10;
		int ______ = 1
		int ____ = 10;
		int ___ = 10;ctr+shift+/
		System.out.println(_);

		int age;
		age = 99;
		System.out.println(age);*/

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		int a = Integer.MAX_VALUE+2;
		System.out.println(a);
		int b = Integer.MIN_VALUE-1;
		System.out.println(b);
	}

	public static void main1(String[] args) {
		for (int i = 0;i < args.length ;i++ ) {
			System.out.println(args[i]);
		}
		System.out.println("========");
		System.out.println("hello");
	}
}


