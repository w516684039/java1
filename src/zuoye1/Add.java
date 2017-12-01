package zuoye1;

public class Add extends Number {
	public Add(){
		super();
	}
	public Add(int num1,int num2){
		super(num1,num2);
	}
	public int getResult(){
		return num1 + num2;
	}
	public static void main(String[] args){
		Add add = new Add(8, 5);
		int result = add.getResult();
		System.out.println(result);

	}
}

