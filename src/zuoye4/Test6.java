package zuoye4;

import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入一个数：");
		String num = scan.next();
		char[] numArray = num.toCharArray();
		boolean b = false;
		for(int i = 0; i<numArray.length/2 ;i++){
			if(numArray[i] ==numArray[numArray.length-1-i]){
				b = true;
			}else{
				b = false;
			}
		}
		if(b==true){
			System.out.println("yes");
		}
		if(b==false){
			System.out.println("no");
		}
	}

}
//6、 0.6332的数据类型是（B）
//A float B double C Float D Double
//
//7、 Java 中 main() 函数的返回值是什么 ? D
//A 、 String
//B 、 int
//C 、 char
//D 、 void
//
//8 、如下哪个字串在Java 中可作为自定义标识符？  A 
//A 、 $number 
//B 、 super
//C 、 3number
//D 、 #number
//
//9 、下面的代码段中，执行之后 i  和 j  的值是什么 ? C
//int i = 1;
//int j;
//j = i++; 
//A 、  1, 1
//B 、 1, 2
//C 、 2, 1
//D 、 2, 2
//
//10 、下面哪个赋值语句不是合法的？A
//A 、 float a = 2.0
//B 、 double b = 2.0
//C 、 int c = 2
//D 、 long d = 2
//java中小数默认是Double类型的
//就像整数默认是int的，而不是short和long
//如果要把小数赋值给一个float的变量，应该float f = 10.1f
//
//11 、下面哪个是 main() 函数的合法参数 ?  C
//A 、 char args[]
//B 、 char args[][]
//C 、 String[] arg
//D 、 String args
//
//12 、已知表达式 int m[] = {0, 1, 2, 3, 4, 5, 6 };
//下面哪个表达式的值与数组最大下标数相等？B
//A 、  m.length()
//B 、 m.length-1
//C 、 m.length()+1
//D 、 m.length+1  
//
//13. 下面哪个语句不能定义一个字符变量（   B ）
//A、char c1=’a’;                B、char c2=” S ” ;
//C、char c4=97 ;               D、char c3=’\u0041’;
//
//
//14 在Java中，属于整数类型变量的是(C )
//A.single 　　　B.double
//C.byte　　　  D.char　
//
//
//15 、下面哪个函数是 public void example(){...} 的重载函数？A,D
//A 、 private void example( int m){...}
//B 、 public int example(){...}
//C 、 public void example2(){...}
//D 、 public int example ( int m, float f){...}
//
//16．下列语句哪一个正确（D）
//A． Java程序经编译后会产生machine code
//B． Java程序经编译后会产生byte code
//C． Java程序经编译后会产生DLL
//D．以上都不正确
//
//17．执行如下程序代码
//a=0;
//c=0;
//do{
//--c;
//a=a-1;
//}while(a>0);
//后，C的值是（C）
//A．0 B．1 C．-1 D．死循环
//