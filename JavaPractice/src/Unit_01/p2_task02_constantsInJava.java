package Unit_01;

public class p2_task02_constantsInJava {

	final int a=15;
	static final int num=100; // only variable static fncs  can access ..
	public static final int number=10; // other class can also access this variable..
	
	private static final int x=20; // Can't be accessed outside of this class..
	
	
	public static void main(String[] args) { // static fnc can only use static global variables

		float pi=3.14f; // anyone can change this value but the value of pi shouldn't be changed ..
		System.out.println(pi);
		
		pi=6.28f;
		System.out.println(pi); 
		
		// constant variable 
		final float PI=3.14f; // Final keyword makes this value immutable ..
		
		// PI = 10.5f; // will generate error.. 
		System.out.println(PI);
		
		// System.out.println(a); // Error bcz this variable 'a' is not static
		System.out.println(num); // num is a static variabe that's why this fnc can access it.
	}
	
	
	void msg() // fnc inside the same class can access all the variables 
	{
		System.out.println(a);
		System.out.println(num);
		
	}

}
