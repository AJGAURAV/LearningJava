// delete nth number from given data list (array)
// insignificant data should be represented by zero

package Assingnment_01;
import java.util.Scanner;

public class q8 {

	static q8 obj = new q8();
	
	public static void main(String[] args) {
		System.out.println("Gaurav Tomar 20021086 4F\n");
		obj.driver();
	}
	
	
	public void driver() {
		
		Scanner input = new Scanner(System.in);
		
		int size;
		System.out.println("Enter Size of Array : ");
		size = input.nextInt();
		
		int data[] = new int[size];
		System.out.println("Enter Data\n");
		for(int i=0; i<size; i++) {
			data[i] = input.nextInt();
		}
		
		int n;
		System.out.println("Enter the element to be deleted : ");
		n = input.nextInt(); 
		
		input.close();
		
		obj.delElement(data,size,n);
		obj.printData(data, size);
		
	}
	

	public void delElement(int data[],int size,int n) {
		for(int i=n-1; i<size-1; i++) {
			data[i] = data[i+1];
		}
			data[size-1] = 0;
	}
	
	
	void printData(int arr[],int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}




















