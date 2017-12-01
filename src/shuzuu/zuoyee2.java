package shuzuu;

public class zuoyee2 {
	public static void main(String args[]) {
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, j = 0, k = 0;
		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1, 0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
		for (int i = 0; i < score.length; i++) {
			

			int o = score[i];
			switch (o) {
			case 0:
				a++;
				break;
			case 1:
				b++;
				break;
			case 2:
				c++;
				break;
			case 3:
				d++;
				break;
			case 4:
				e++;
				break;
			case 5:
				f++;
				break;
			case 6:
				g++;
				break;
			case 7:
				h++;
				break;
			case 8:
				j++;
				break;
			case 9:
				k++;
				break;
			}
		}
		System.out.println("0的个数：" + a);
		System.out.println("1的个数：" + b);
		System.out.println("2的个数：" + c);
		System.out.println("3的个数：" + d);
		System.out.println("4的个数：" + e);
		System.out.println("5的个数：" + f);
		System.out.println("6的个数：" + g);
		System.out.println("7的个数：" + h);
		System.out.println("8的个数：" + j);
		System.out.println("9的个数：" + k);
	}

}
