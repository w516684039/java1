package zuoye1;

public class Multi extends Number {
	public Multi(){
		super();
	}
	public Multi(int num1,int num2){
		super(num1,num2);
	}
	public int getResult(){
		return num1 * num2;
	}
	public static void main(String[] args){
		Multi multi = new Multi(8, 5);
		int result = multi.getResult();
		System.out.println(result);

	}

}
