package Unit_01;

import java.util.Scanner;

public class p4_task01_ifElseControlFlow {
	
	public static void main(String[] args) {
		
		p4_task01_ifElseControlFlow obj = new p4_task01_ifElseControlFlow();
		
		obj.flowControl();
	}
	
	void flowControl() {
		boolean pass = true;
		
		// if else conditions
		if(pass) 
			System.out.println("You have successfully passed :)");
		else
			System.out.println("Try again :)");
		
		
		// creating scanner object
		Scanner input = new Scanner(System.in);
		
		// if else ladder
		float cgpa;
		System.out.println("Enter CGPA secured : ");
		cgpa = input.nextFloat();
		
		if(cgpa >= 9.0f)
			System.out.println("Excellent !");
		else if(cgpa >= 8.5f)
			System.out.println("Stupendous !");
		else if(cgpa >= 7.0f)
			System.out.println("Uttamam !");
		else
			System.out.println("Ati Uttamam !");
		
		
		input.close();
		
		
		
	}
}
