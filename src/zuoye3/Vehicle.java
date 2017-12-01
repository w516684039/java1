package zuoye3;

public class Vehicle {
	private double speed;
	private double size;
	
	public Vehicle() {
		super();
		}

	Vehicle(double speed,double size){
		this.speed = speed;
		this.size = size;
	}
	
	public void move(){
	}
	
	public double speedUp(double speed){    // 加速
		return speed;
	}
	public double speedDown(double speed){  // 减速
		return speed;
	}
	
	public double getSpeed(){
		return speed;
	}
	public double getSize(){
		return size;
	}
}