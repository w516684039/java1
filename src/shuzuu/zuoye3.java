package shuzuu;

public class zuoye3 {
	public static void main(String args[]){
		int[] score = {0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int a = 0, b = 0;
		for(int i = 0;i < score.length ;i++){
			int c = score[i];
			if(c % 2 == 0){
				a++;
			}else{
				b++;
			}
		}
		System.out.println("偶数个数：" + a);
		System.out.println("奇数个数：" + b);
	}

}
