package week3.day1;

public class MethodOverloading {

	public void add() {// no arg method
		System.out.println("Working Addition Funtionality");
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b);
	}

	public float add(float x, float y) {
		System.out.println(x + y);
		return y;
	}

	public void add(String name, int num) {

	}

	public void add(int num,String name) {

	}

	public static void main(String[] args) {
		MethodOverloading addFun = new MethodOverloading();
		addFun.add();
		addFun.add(2, 3, 5);
		addFun.add(2.3f, 4.5f);

	}

}
