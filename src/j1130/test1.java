package j1130;

public class test1 {
	public static void main(String[] args){
		
		String regex = "[a-zA-Z0-9_-]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9]+)+";
	    String mail = "dfh8ery834_eyr-@eryeyr_.com.cn.gov";
	    if (mail.matches(regex)) {
	         System.out.println("是邮箱");
	      } else {
	         System.out.println("不是邮箱");
	      }
  
	}

}
