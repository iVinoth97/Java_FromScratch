package java_Beginner;

public class StaticVariable {
	

	int x = 0;
	static int y =0;
	//
	void counter() {
		x++;
		y++;
		System.out.println("non-static => "+x+ " static => "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable obj1 = new  StaticVariable();
		obj1.counter();
		obj1.counter();
		System.out.println("Once again created object");
		StaticVariable obj2 = new  StaticVariable();
		obj2.counter();
		obj2.counter();
		System.out.println("Once again created object");
		StaticVariable obj3 = new  StaticVariable();
		obj3.counter();
		obj3.counter();

	}

}
