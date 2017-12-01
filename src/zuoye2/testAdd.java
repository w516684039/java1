package zuoye2;

import java.util.Scanner;
public class testAdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入一个数：");
		int i1 = scan.nextInt();
		double d1 = scan.nextDouble();
		float f1 = scan.nextFloat();
		long l1 = scan.nextLong();
		System.out.println("输入另一个数：");
		int i2 =scan.nextInt();
		double d2 = scan.nextDouble();
		float f2 = scan.nextFloat();
		long l2 = scan.nextLong();
		Add a = new Add();
		int resultInt = a.add(i1,i2);    //int
		double resultDouble = a.add (d1, d2);//double
		float resultFloat =  a.add (f1,f2);//float
		long resultLong = a.add (l1, l2);//long
	
		System.out.println("int型结果："+resultInt);
		System.out.println("double型结果："+resultDouble);
		System.out.println("float型结果："+resultFloat);
		System.out.println("long型结果："+resultLong);
	}

}