/* 5Q.  WAP in Java which would contain 8 objects of a Class Employee.
		Employee contains name, age, department, salary. Your program would
		be able to calculate the total salary to be paid in each department. Use
		constructors to create these 8 objects and Scanner to take inputs.
		Restrictions:
		1- Minimum 8 objects [can be created manually with parameterized
		constructors with Scanner input]
		2- Departments are, A, B, C, D: minimum 4 departments [String Type]
		3- If the Salary exceeds more than 30,000, then the default salary
		would be 25000 of any of the employee
		4- Use array of objects, instead of using multiple 8 objects separately
		Use:
		Employee arr[] = new Employee[8];
		And
		arr[i].department.equals("A");
*/


package Assingnment_01;
import java.util.Scanner;


public class q5{
	public static void main(String[] args) {
		System.out.println("Gaurav Tomar 20021086 4F\n");
		Employee obj1 = new Employee();
		obj1.driver();
	}
}


class Employee{
	String name;
	int age;
	String department;
	int salary;
	
		Employee(){
		}
	
		Employee(String name,int age,String department,int salary){
			this.name = name;
			this.age = age;
			this.department = department;
			this.salary = salary;
		}
		
		
		void driver() {
			Employee obj[] = new Employee[6];
		
			String name;
			int age; 
			String department;
			int salary;
			
			Scanner input = new Scanner(System.in);
			
				for(int i=0; i<6; i++) {
					System.out.println(i+1 + ":");
					
				    System.out.println("Name : ");
						name = input.next();
					System.out.println("Age  : ");
						age = input.nextInt();
					System.out.println("Department : ");
						department = input.next();
						
					System.out.println("Salary : ");
						salary = input.nextInt();
					
					obj[i] = new Employee(name,age,department,salary);
				}
				 	input.close();
			
				
			for(int i=0; i<6; i++) {
				if(obj[i].salary > 30000) {
					for(int j=0; j<6; j++) {
						obj[j].salary = 25000;
					}
					break;
				}
			}
			
			
			int sum[] = new int[4];
			
			for(int i=0; i<6; i++) {
				switch(obj[i].department) {
					case "A": sum[0] = sum[0] + obj[i].salary; break;
					case "B": sum[1] += obj[i].salary; break;
					case "C": sum[2] += obj[i].salary; break;
					case "D": sum[3] += obj[i].salary; break;
				}
			}
			
			System.out.println("Department wise total salary\n");
				for(int i=0; i<6; i++) {
					System.out.printf("Department %c = %d\n",65+i,sum[i]);
				}
				
		}
}










