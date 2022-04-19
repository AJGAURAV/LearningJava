package Unit_01;
/*
 -Normally an array is a collection of similiar type of elements which has contiguous memory location
 -Java array is an object which contains elements of similiar data type
 -We can store only a fixed set of elements in Java array
 -Size limit issue:
    -We can store only the fixed size of elements in a java array
    -It doesn't grow its size at runtime
    -To solve this problem,collection framework is used in java which grows automatically 
 -There re two types of array
 -Single Dimensional Array
 -Multi Dimensional Array
 
 -Declare an Array in Java 
  -Datatype arrRefVar[];
  OR
  -DataType[] arrayRefVar;
  OR
  -DataType []arrayRefVar;
  
 -Instantiation of array in Java 
 -arrayRefVar=new datatype [size];
  
 */

public class p6_task01_arrayInJava {

	public static void main(String[] args) {
		System.out.println("p6_task01_arrayInJava");
		//Declaration
		int arr1[];
		int[] arr2;
		int []arr3;
		//Can do it as e=we have not provide it any memory/space yet!
		//array[0] = 1;
		//Initialization, during initialization we have to provide the size of the array
		arr1 = new int[6]; //{1,2,3,4};
		
		//Assigning values to the Java array
		for(int i=0;i<arr1.length;i++)//length is the property of array
			arr1[i] = i;
		int arr4[] = {33,3,4,5}; //declaration,instantiation and initialization
		
		//passing array to method 
		arrayAsParameter(arr4);
		
		//passing annonymous array in a method
		arrayAsParameter(new int[] {33,3,4,5});
		
		//Returning Array from the Method 
		int[] arr5 = arrayAsReturnType();
		System.out.println(arr5.toString());
		
		//ArrayIndexOutOfBoundsException
		int arr[]= {50,60,70,80};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//Multidimensional Array in Java
		int[][] arr6 = new int[3][3]; //3 rows and 3 column
		for(int i=0,j=0;i<3 && j<3;i++, j++) {
			System.out.println(arr6[i][j]);
		}
		int counter = 0;
		for(int i=0,j=0;i<3 && j<3;i++, j++) {
			counter++;
			arr6[i][j] = counter;
		}
		for(int i=0,j=0;i<3 && j<3;i++, j++) {
			
			System.out.println(arr6[i][j]);
	}
}
	static void arrayAsParameter(int arr[]) { //declare empty array as parameter
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}}
	//Returning Array from the method
	static int[] arrayAsReturnType() {
		int arr4[] = {33,3,4,5};
		return arr4;
	}
	}