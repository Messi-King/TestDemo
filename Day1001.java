public class TestDemo {

	public static void main(String[] args) {
		/*int a = 10;
		int b = 20;
		System.out.println(!(a < b));*/
		//System.out.println(10 > 20 && 10 / 0 == 0);
		//System.out.println(10 > 20 || 10 / 0 == 0);
		//
		boolean flg = false ? false : true==true ? true : false;
		System.out.println(flg);
	}

	public static void main21(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println(a == b);//false
		System.out.println(a != b);//true
		System.out.println(a <= b);//true
		System.out.println(a >= b);//false
	}

	public static void main20(String[] args) {
		int a = 10;
		a = a++;
		System.out.println(a);//10
	}

	public static void main19(String[] args) {
		int a = 10;
		int b = a++;
		System.out.println(b);
	}

	public static void main18(String[] args) {
		//System.out.println(10/0);
		int a = 10;
		a+=10;
		//a = a+10;
		System.out.println(a);
	}

	public static void main17(String[] args) {
		System.out.println(10%3);//1
		System.out.println(-10%3);//-1  1
		System.out.println(10%-3);//-1  1
		System.out.println(-10%-3);//1  -1
		System.out.println(11.5%2.0);
	}

	public static void main16(String[] args) {
		System.out.println(5/2);//2
		System.out.println(5.0/2);//2.5
		System.out.println((float)5/2);//2.5
		System.out.println(5/(float)2);//2.5
		System.out.println((float)(5/2));//2.0
	}

	public static void main15(String[] args) {
		String str = "123";
		int a = Integer.valueOf(str);
		System.out.println(a);
	}

	public static void main14(String[] args) {
		int num = 10;
		String str = 10+" ";
		System.out.println(str);

		String str2 = String.valueOf(num);
		System.out.println(str2);
	}

	public static void main13(String[] args) {
		int a = 10;
		long b = 20L;

		int c = (int)(a+b);
		System.out.println(c);
	}

	public static void main12(String[] args) {
		//byte a = 128;//-128 - 127
		//System.out.println(a);
		/*byte b = Byte.MAX_VALUE+1;
		System.out.println(b);*/
		/*byte b1 = Byte.MAX_VALUE;
		byte b2 = b1+1;
		System.out.println(b2);*/

		/*byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte)(b1+b2);
		System.out.println(b3);*/
	}

	public static void main11(String[] args) {
		int a = 1;
		boolean flg = false;
		//a = (int)flg;
	}

	public static void main10(String[] args) {
		int a = 10;
		double b = 1.5;
		a = (int)b;
		System.out.println(a);
	}

	public static void main9(String[] args) {
		int a = 10;
		long b = a;
		int c = (int)b;
		System.out.println(a + "," +b+", "+c);
	}
	public static void main8(String[] args) {
		final int A;
		A = 100;
		//A = 99;error
		System.out.println(A);
	}

	public static void main7(String[] args) {
		int a = 10;
		{
			//a = 99;
			System.out.println(a);
		}
		System.out.println(a);
	}

	public static void main5(String[] args) {
		{
			int a = 10;
			System.out.println(a);
		}
		//System.out.println(a);
	}

	public static void main4(String[] args) {
		String a = "hello";
		String b = "world";
		String c = a + b;
		System.out.println(c);
	}

	public static void main3(String[] args) {
		System.out.println("ab"+"cd");
		int a = 10;
		//a = 10;
		int b = 20;
		System.out.println("a = "+a);
		System.out.println(a+b);
		System.out.println("a = "+ a +",b = "+b);
	}

	public static void main2(String[] args) {
		System.out.println("\"abcd\"");
		System.out.println("D:\\上课代码\\Java\\20201010");
	}


	public static void main1(String[] args) {
		String str = "hello";
		System.out.println(str);

		System.out.print("打印但是不换行");
		System.out.println("打印并且换行");
		System.out.printf("%s\n","格式化打印");

		System.out.printf("%d\n",10);

	}
}