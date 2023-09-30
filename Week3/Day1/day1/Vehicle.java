package week3.day1;

public class Vehicle {
		
	public void startVehicle() {
		System.out.println("start the vehicle");
	}
	
	public void applyBreak() {
		System.out.println("Break applied");
	}

	public static void main(String[] args) {
		
		Vehicle v=new Vehicle();
		v.applyBreak();
		v.startVehicle();

	}

}
