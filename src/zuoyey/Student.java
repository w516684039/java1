package zuoyey;

public class Student extends Person {
	private String className;

	public Student() {
		super();
	}

	public Student(String name, int age, String className) {
		super(name, age);
		this.className = className;
	}

	public void show() {
		System.out.println("name: " + name + ", className: " + className);
	}

	public void study() {
		System.out.println(name + "正在学习");
	}
	public void test2() {
		   Student student = new Student("zhangsan", 20, "java1711");
		   student.speak();
		   student.show();
		}

public static void main(String[] args) {
	Student student=new Student();
	student.test2();
}
}
