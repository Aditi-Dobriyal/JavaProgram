package UNIT01;

public class P6_Task02_StringInJava {

	public static void main(String[] args) {
		
		StringInJava obj = new StringInJava();
		obj.StringDefinition() ;
		obj.charAndString();

	}

}

class StringInJava {
	
	void StringDefinition() {
		
		String s = "Hello There!";
		String s1 = new String ("abcdefghijklmnopqrstuvwxyz");
		
		System.out.println(s);
		
		//get length of string
		System.out.println(s.length());
		
		//loop through string
		for(int i = 0; i < s.length(); i++)  {
			System.out.println(s.charAt(i));
		}
		
		String first = "Aditi";
		String second = "Dobriyal";
		
		//add two strings
		String third = first + second;
		System.out.println(third);
		
		//compare two strings
		boolean result1 = first.equals(second);
		System.out.println(result1);
		
		String fourth = "Aditi";
		String fifth = new String ("Dobriyal");
	}
	
	void charAndString()  {
		
		char[] ch = {'H', 'e', 'l', 'l', 'o' , ' ', 'T', 'h', 'e', 'r', 'e' };
		char[] ch2 = {'!', '!' };
		
		System.out.println(ch);
		
		for(int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		String s1 = new String(ch);
		System.out.println(s1);
		
		ch[0] = 'h';
		s1 = s1 + 'a' ;
		
		
		String s2 = "Happy";
		char[] ch4 = s2.toCharArray();
		
		char[] a2 = { 'A', 'K', 'A' };
		String s3 = new String(a2);
	}
}