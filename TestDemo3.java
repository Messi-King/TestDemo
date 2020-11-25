import java.util.Scanner;

class  Test {

}

public class TestDemo {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println(age);
		System.out.println("请输入你的姓名：");
		String name = sc.nextLine();
		System.out.println(name);
		sc.close();
	}



	public static void main19(String[] args) {
		int i = 0;
		/*while (i >= 10) {
			System.out.println("哈哈");
			i++;
		}*/

		do {
			System.out.println("哈哈");
			i++;
		}while (i>=10);
	}

	public static void main18(String[] args) {
		int a = 10;
		for (int i=1;i <= 10 ;i++ ) {
			for(int j = 1;j <= 5;j++) {
				System.out.println("dsf");
			}
		}

		for(int k = 1;k <= 10;k++) {
			System.out.println("dsf");
		}

		for(int m = 1;m <= 10;m++) {
			System.out.println("dsf");
		}
	}

	public static void main17(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10;i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main16(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	//找到1-100之间，所有既能被3整除，
	//也能被5整除的数字
	public static void main15(String[] args) {
		int i = 1;
		while (i <= 100) {
			i++;
			if(i % 15 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	public static void main14(String[] args) {
		int i = 1;
		while (i <= 100) {
			if(i % 3 == 0) {
				System.out.println(i);
				continue;
			}
			i++;
		}
	}

	public static void main13(String[] args) {
		int num = 5;
		int j = 1;
		int sum = 0;
		while(j <= num) {
			int i = 1;
			int fac = 1;//每个数字的阶乘
			while (i <= j) {
				fac = fac*i;
				i++;
			}
			j++;//2
			sum += fac;//吧每次计算的阶乘加起来
		}
		System.out.println(sum);
	}

	public static void main12(String[] args) {
		int i = 1;
		int fac = 1;
		while (i <= 5) {
			fac = fac*i;
			i++;
		}
		System.out.println(fac);
	}



	public static void main11(String[] args) {
		int sum = 0;
		int i = 1;
		while(i <= 100) 
			sum = sum + i;//3  6
			i++;//3  4
		System.out.println("1-100的和："+sum);
	}

	public static void main10(String[] args) {

		//求1-100的和还有1-100奇数的和 1-100偶数的和
		
		int sum = 0;
		int i = 1;

		while(i <= 100){
			sum = sum + i;//3  6
			i++;//3  4
		}
		System.out.println("1-100的和："+sum);

		int sumOdd = 0;
		i = 1;
		while (i <= 100) {
			sumOdd = sumOdd + i;
			i = i+2;
		}
		System.out.println("1-100奇数的和："+sumOdd);
		

		int sumEve = 0;
		i = 2;
		while (i <= 100) {
			sumEve = sumEve + i;
			i = i+2;
		}
		System.out.println("1-100偶数的和："+sumEve);

		/*while (true) {
			System.out.println("fafsa");
		}*/
		/*int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a++;
		}*/
	}

	public static void main9(String[] args) {
		String  a = "hello";
		switch (a) {
			case "abcde":
				System.out.println("2");
			    break;
			case "hello":
			   System.out.println("1");
			   break;
			default:
				System.out.println("有误！");
				break;
		}
	}

	public static void main8(String[] args) {
		int x = 10;
		int y = 20;
		if (x == 10); { 
			if (y == 10){
				System.out.println("aaa");
			}else{
				System.out.println("bbb");
			}
		}

	}

	public static void main7(String[] args) {
		int x = 10;
		int y = 20;
		if (x == 10); { 
			if (y == 10){
				System.out.println("aaa");
			}else{
				System.out.println("bbb");
			}
		}
	}

	public static void main6(String[] args) {
		int x = 10;
		int y = 10;
		if (x == 10) {
			System.out.println("fsdfsafsadfdafdsa");
		}

		if (y == 10)
			System.out.println("aaa");
		else
			System.out.println("bbb");
	}

	public static void main5(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("闰年");
		}else {
			System.out.println("不是闰年");
		}
	}


	public static void main4(String[] args) {
		//从键盘获取数据
		Scanner scan = new Scanner(System.in);
		//每日一题     10选择题+2个代码题  48   
		while(scan.hasNextInt()) {
			//读入一个整型
			int num = scan.nextInt();

			if(num % 2 == 0) {
				System.out.println("偶数");
			}else {
				System.out.println("奇数");
			}
		}
	}


	public static void main3(String[] args) {
		int a = 1;
		if(a == 1) {
			System.out.println("hello!");
		} else {
			System.out.println("else");
		}
	}

	public static void main2(String[] args) {
		int a = 1;
		if(a == 1) {
			System.out.println("hello!");
		}
		System.out.println("else");
	}

	public static void main1(String[] args) {
		//顺序结构
		System.out.println("1");
		System.out.println("3");
		System.out.println("2");
	}
}