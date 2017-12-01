package shuzuu;
import java.util.Scanner;
public class zuoy {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入成绩1：");
    	int mark1 = scanner.nextInt();
    	System.out.println("输入成绩2：");
    	int mark2 = scanner.nextInt();
    	System.out.println("输入成绩3：");
    	int mark3 = scanner.nextInt();
		int[] score = new int [3];
		score[0] = mark1;
		score[1] = mark2;
		score[2] = mark3;
		int sum = 0;
		for(int i = 0; i < score.length; i++){
			sum=sum+score[i];
		}
		int average = sum / score.length ;
		System.out.println("平均成绩：" + average);
	}

}
