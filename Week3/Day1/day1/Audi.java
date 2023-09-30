package week3.day1;

public class Audi extends Car{

	//A class cannot have multiple classes to be extended
	//A class can extends one class at a time
	
	//Audi-->Car-->Vehicle
	public static void main(String[] args) {

		Audi audi=new Audi();
		audi.startVehicle();
		audi.applyBreak();
		audi.noOfdoors();
		
		//Audi -->vehiclemethods and car
		//new -->luxury
		
	}

}
