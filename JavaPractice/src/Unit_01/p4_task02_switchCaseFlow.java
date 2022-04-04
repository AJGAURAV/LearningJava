package Unit_01;

import java.util.Scanner;

public class p4_task02_switchCaseFlow {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int day;
		System.out.println("Enter day : ");
		day = input.nextInt();
		
		p4_task02_switchCaseFlow obj = new p4_task02_switchCaseFlow();
		obj.switchTest(day);
		
		input.close();

	}

	public void switchTest(int day) {
		
		switch(day) {
		case 1: System.out.println("day 1 , Somvar :)"); break;
		case 2: System.out.println("day 2 , Mangalvar :)"); break;
		case 3: System.out.println("day 3 , Budhvar :)"); break;
		case 4: System.out.println("day 4 , Vrahspativar :)"); break;
		case 5: System.out.println("day 5 , Shukrvar :)"); break;
		case 6: System.out.println("day 6 , Shanivar :)"); break;
		case 7: System.out.println("day 7 , Ravivar :)"); break;
		default : System.out.println("Invalid day!");
		}
		
	}
}
