package zuoyey;

public class Person {
	protected String name;
	protected int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("name" + name + "age" + age);
	}

	public void speak() {
		System.out.println(name + "正在说话");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
