package j1130;

import zuoye1.Div;

public class test2 {
	public  void test11() {
		
		int num1 = 3;
		int num2 = 0;
		
		div (num1,num2);
	}
	private void div(int num1,int num2){
		try{
			int result = num1/num2;
		}catch(Exception e){
			System.out.println("++++++");
			System.out.println(e);
		}finally{
			System.out.println("------");
		}
		System.out.println("asdahsjdha");
	} 
	public void test12() {
		  
		   try {
		      InputStream inputStream = new FileInputStream(new File("a.txt"));
		   } catch (FileNotFoundException e) {
		     
		      e.printStackTrace();
		   }
		}


}
