package zuoye1;

public class Sub extends Number {
    public Sub(){
		super();
	}
	public Sub(int num1,int num2){
		super(num1,num2);
	}
	public int getResult(){
		return num1 - num2;
	}
	public static void main(String[] args){
		Sub sub = new Sub(8, 5);
		int result = sub.getResult();
		System.out.println(result);

	}

}
