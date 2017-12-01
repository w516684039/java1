package j1129;

public class test1 {
	public static void main(String[] args){
		String  str ="java AndroidA";
		System.out.println(str.length());
		System.out.println("---------");
		System.out.println(str.charAt(5));
		System.out.println("---------");
		System.out.println(str.indexOf('A'));
		System.out.println("---------");
		int index ='A';
		System.out.println(str.indexOf('A',7));
		System.out.println("---------");
		System.out.println(str.indexOf("And"));
		System.out.println("---------");
		System.out.println(str.lastIndexOf('A'));
		System.out.println("---------");
		System.out.println(str.lastIndexOf('A',7));
	}

}
