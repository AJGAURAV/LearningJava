package Unit_01;

import java.util.Scanner;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class p9_ArrayInJava{

	public static void main(String[] args) {

		int[] array = { 6,3,4,1,4,3,7,6,3,7};

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		//obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}


class QuestionsOnArray { 

	void sortAnArray(int[] arr) {
		System.out.println("\nSorting");
		
		System.out.println("Original Array");
		for(int i=0; i< arr.length; i++)
			System.out.print(arr[i] + " ");
		
		
		// insertion sort
		int key;
		int j;
		
		for(int i=1; i< arr.length; i++) {
			key = arr[i];
			j = i-1;
			while((j >= 0) && (key < arr[j])) {
				arr[j+1] = arr[j];
				j--;
			} 
				arr[++j] = key;
		}
		
		
		System.out.println("\nSorted Array");
		for(int i=0; i< arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	

	void findTheDuplicateElements(int[] arr) {
		System.out.println("\n\nDuplicates in array");
		
		System.out.println("Original Array");
		for(int i=0; i< arr.length; i++)
			System.out.print(arr[i] + " ");
		
		int max = arr[0];
		for(int i=1; i< arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		
		int freq[] = new int[max+1];
		for(int i=0; i< arr.length; i++) {
			freq[arr[i]]++;
		}
		
		int duplicates = 0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i] > 1)
				duplicates++;
		}
		
		int j=0;
		int dupElements[] = new int[duplicates];
		for(int i=0; i< arr.length; i++)
			if(freq[i] > 1)
				dupElements[j++] = i;
		
		System.out.println("Duplicates in Array");
		for(int i=0; i< duplicates; i++)
			System.out.print(dupElements[i] + " ");
		

	}

	
	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!

	}

	
	void leftRotationInAnArray(int[] arr) {
		
		System.out.println("\nLeft Rotation");
		
		System.out.println("\n\nOriginal Array");
		for(int i=0; i< arr.length; i++)
			System.out.print(arr[i] + " ");
		
		int temp = arr[0];
		int i;
		for(i=1; i< arr.length; i++) {
			arr[i-1] = arr[i];
		}	
			arr[i-1] = temp;
			
		System.out.println("\nRotated Array");
		for(int j=0; j< arr.length; j++)
			System.out.print(arr[j] + " ");

	}

	
	void removeElementInArray(int[] arr) {
		System.out.println("\nElement Deletion");
		
		int key;
		System.out.println("\n\nEnter the element to be deleted : ");
		Scanner input = new Scanner(System.in);
		key = input.nextInt();
		input.close();
		
		
		System.out.println("\n\nOriginal Array");
		for(int i=0; i< arr.length; i++)
			System.out.print(arr[i] + " ");
		
		
		int counter = 0;
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == key) {
				// deletion
				counter++;
				for(int j=i+1; j< arr.length; j++)
					arr[j-1] = arr[j];
			}
		}
		
		
		int n;
		if(counter > 0)
			n = arr.length - 1;
		else 
			n = arr.length;
	
		System.out.println("\n\nArray after deletion of " + key);
		
		for(int i=0; i< n; i++)
			System.out.print(arr[i] + " ");

	}

}

