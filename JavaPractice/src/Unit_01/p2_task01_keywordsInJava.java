package Unit_01;

public class p2_task01_keywordsInJava {
	
	public static void main(String[] args) {
	
	//int double =10; // Double can't be used as a variable bcz it is a keyword in java for datatype .
			int num=11;
			
			System.out.println(num);		
			
			/*
			P2_Task01_KeywordsInJava int=new P2_Task01_KeywordsInJava(); 
			We can't use int for object creation bcz int is a reserved keyword in java 
			*/
			P2_Task01_KeywordsInJava obj=new P2_Task01_KeywordsInJava();  // object creation
			obj.msg();
	}
	
	/*
	void float() //We cant use float for fnc name bcz it is a reseved keyword  
	{
		System.out.println("Message...");
	}
	*/

	void msg()
	{
		System.out.println("Message...");
	}
}

