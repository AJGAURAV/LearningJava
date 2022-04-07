package Unit_01;

public class p5_task01_constructorsInJava {

	public static void main(String[] args) {
		
		demo1 obj = new demo1();
		obj.display();
		
		// one of either constructors is invoked at a time
		
		demo2 obj1 = new demo2(100,2.3f);
		obj1.display();
		
	}
}


class demo1{
	int a;
	char b;
	
	demo1(){
		System.out.println("default constructor of demo1");
		a = 100;
		b = 'G';
	}
	
	void display() {	
		System.out.println("integer a = " + a);
		System.out.println("char b = " + b);
	}
}


class demo2{
	int x;
	float y;
	
	
	demo2(){
		System.out.println("default constructor of demo2");
	}
	
	
	demo2(int x1,float y1){
		x = x1;
		y = y1;
	}
	
	
	void display() {
		System.out.println("int x = " + x);
		System.out.println("float y = " + y);
	}
}

