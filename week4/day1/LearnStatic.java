package week4.day1;

public class LearnStatic {

	int id;
	String name;
	static String compName;
	
	public void empDetails(int id ,String name,String compName) {
		this.id=id;
		this.name=name;
		this.compName=compName;
		System.out.println(id +":" +name +":"+ compName);
	}
	
	public static void empDetails() {
		
		//System.out.println(id +":" +name +":"+ compName);
	}
	public static void main(String[] args) {
		
		LearnStatic ls=new LearnStatic();
		int id2 = ls.id;
		String name2 = ls.name;
		System.out.println(compName);
	
	}

}
