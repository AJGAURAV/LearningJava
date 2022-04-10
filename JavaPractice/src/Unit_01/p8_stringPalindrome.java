

package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class p8_stringPalindrome {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("Gaurav");
		String s2 = new String("Gaur");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		// palindrome test
		
		int j = s.length()-1;
		int counter = 0;
		
		for(int i=0; (i < s.length()/2); i++,j--) {
			if(s.charAt(i) != s.charAt(j)) {
				counter++;
				break;
			}
		}
		
		
		if(counter == 0)
			System.out.println("String : " + s + " is palindrome");
		else 
			System.out.println("String : " + s + " is not palindrome");
	}

	
	void reverseOfAString(String s) {
		
		
		// since strings are immutable they can't be modified later
		// strings are not indexable
		// strings can point to different memory location
		
		// char array Vs String class objects Vs CharBuffers ...
		
		char str[] = s.toCharArray();
		
		System.out.println(str);
		char temp;
		int j = str.length - 1;
		
		for(int i=0; i< str.length/2; i++,j--) {
			temp = str[i];
			str[i] = str[j];
			str[j] = temp;
		}
		System.out.println("String after reversing ");
		System.out.println(str);
	

	}
	
	
	void stringEqualOrNot(String s1,String s2) {
		
		if(s1.length() == s2.length()) {
			int counter=0;
			for(int i=0; i< s1.length(); i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					counter++;
					break;
				}
			}
			
			if(counter == 0)
				System.out.println("Strings " + s1 + " and " + s2 + " are equal");
		}
		
		else 
			System.out.println("Strings " + s1 + " and " + s2 + " are not equal");
			
	}
}

















































