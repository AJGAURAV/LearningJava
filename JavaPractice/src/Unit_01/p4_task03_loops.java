package Unit_01;

import java.util.Scanner;

public class p4_task03_loops {
	
	public static void main(String[] args) {
		p4_task03_loops obj = new p4_task03_loops();
		
		obj.forLoop();
		obj.whileLoop();
		obj.doWhileLoop();
	}
	
	
	private void forLoop() {
		Scanner input = new Scanner(System.in);
		
		int ht;
		System.out.println("Enter height of Pattern : ");
		ht = input.nextInt();
		
		
		for(int i=0; i<ht; i++) {
			for(int j=i; j<ht; j++)
			System.out.print("*");
			System.out.print("\n");
		}
		
		// empty for
		int i = 5; 
		for( ; ; ) {
			if(i-- == 0) 
				break;
			System.out.println(i);
		}
		
		
		int arr[] = new int[5];
		System.out.println("Enter values in Array : ");
		for(int k=0; k<5; k++)
			arr[k] = input.nextInt();
		
		
		// for each loop
		System.out.println("Array : ");
		for(int j:arr) {
			System.out.println(j);
		}
		
		
		input.close();
	}
	
	
	protected void whileLoop() {
		int num = 5;
		while(num-- > 0) {
			System.out.println("While loop");
		}
	}
	
	void doWhileLoop() {
		int num = 5;
		do {
			System.out.println("Do while loop");
		} while(num-- > 0);
	}
}
