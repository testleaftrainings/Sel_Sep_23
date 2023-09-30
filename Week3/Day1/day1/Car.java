package week3.day1;

public class Car extends Vehicle{
	//built is-A relationship -->to connect the car and vehicle class
	//vehicle -parent class
	//car -subclass/child class
	public void noOfdoors() {
		System.out.println("4");
	}
	
	public void startVehicle() {
		System.out.println("Strated the vehicle remotely");
	}
	
	
	public static void main(String[] args) {
		
		
		Car bmw=new Car();
		bmw.noOfdoors();
		bmw.applyBreak();
		bmw.startVehicle();

	}

}
