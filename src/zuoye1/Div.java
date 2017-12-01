package zuoye1;

public class Div extends Number {
	public Div(){
		super();
	}
	public Div(int num1,int num2){
		super(num1,num2);
	}
	public int getResult(){
		return num1 / num2;
	}
	public static void main(String[] args){
		Div div = new Div(8, 5);
		int result = div.getResult();
		System.out.println(result);

	}

}
