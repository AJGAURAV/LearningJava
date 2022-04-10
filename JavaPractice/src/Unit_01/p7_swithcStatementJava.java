
package Unit_01;

import java.util.Scanner;

/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class p7_swithcStatementJava {

	public static void main(String[] args) {
		System.out.println(" p7_swithcStatementJava");
		SwitchStatements obj = new SwitchStatements();
		obj.getData();
		

	}

}

class SwitchStatements {
	
	
	int num;
	
	void getData() {
		SwitchStatements obj = new SwitchStatements();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("NUM : ");
		int num = input.nextInt();
		
		input.close();
		obj.switchStatements(num);
	}
	
	void switchStatements(int num) {
		
		switch(num) {
		case    1: System.out.println("2022"); break;
		case	2: System.out.println("04"); break;
		case	3: System.out.println("07"); break;
		case	4: System.out.println("thursday"); break;
		default: System.out.println("Invalid Input!");
		}
		
		
		
	}
}