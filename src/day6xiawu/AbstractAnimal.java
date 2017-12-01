package day6xiawu;

public abstract class  AbstractAnimal {
	protected String name;
	protected int age;
	public abstract void showInfo();
	public AbstractAnimal(){
	}
	public AbstractAnimal(String name,int age){
		super();
		this.age = age;
		this.name = name;
	}
	public void SetName(String name){
		this.name = name;
	}
	public String GetName(){
		return name;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
