package Unit_01;

import java.util.Scanner;


public class p4_task04_scannerClass {

	public static void main(String[] args) {
		p4_task04_scannerClass obj = new p4_task04_scannerClass();
		obj.scannerEx();
	}
	
	
	void scannerEx() {
		Scanner input = new Scanner(System.in);
		
		
		// declaring primitive data types
		boolean pass;
		byte byteVar;
		short shortVar;
		int intVar;
		long longVar;
		 
		char charVar;
		
		float floatVar;
		double doubleVar;
		
		// initiation of primitive data types
		System.out.println("Enter bool value : ");
		pass = input.nextBoolean();
		
		System.out.println("Enter byte value : ");
		byteVar = input.nextByte();
		
		System.out.println("Enter short value: ");
		shortVar = input.nextShort();
		
		System.out.println("Enter integer Value : ");
		intVar = input.nextInt();
		
		System.out.println("Enter long value : ");
		longVar = input.nextLong();
		
		System.out.println("Enter char value : ");
		charVar = input.next().charAt(0);
				
		System.out.println("Enter float value : ");
		floatVar = input.nextFloat();
		
		System.out.println("Enter double value : ");
		doubleVar = input.nextDouble();
		
		
		// printing variables
		System.out.println("pass = " + pass);
		System.out.println("byte = " + byteVar);
		System.out.println("short = " + shortVar);
		System.out.println("int = " + intVar);
		System.out.println("long = " + longVar);
		System.out.println("char = " + charVar);
		System.out.println("float = " + floatVar);
		System.out.println("double = " + doubleVar);
		
		
		input.close();
	}

}
