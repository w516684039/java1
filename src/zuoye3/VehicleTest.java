package zuoye3;

public class VehicleTest {
	private static double speedUp;

	public static void main(String[] args) {
		Vehicle car = new Vehicle(120,10);
		System.out.println("speed:"+car.getSpeed());
		System.out.println("size:"+car.getSize());
		double speedUp = car.speedUp(300);
		System.out.println("加速后："+speedUp);
		double speedDown = car.speedDown(55);
		System.out.println("减速后："+speedDown);
	}
}