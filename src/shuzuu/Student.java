package shuzuu;

public class Student {
    String  name;
	int age;
	String gender;
	String classname;
	public Student(String name,int age,String gender,String classname) {
		   this.name = name; 
		   this.age = age; 
		   this.gender = gender; 
		   this.classname = classname; 
		}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", classname=" + classname + "]";
	}
	
	

}
