package UNIT01;

public class P6_Task02_StringInJava {

	public static void main(String[] args) {
		StringInJava obj = new StringInJava();
		obj.StringDefinition() ;
		obj.charAndString();
	}
}
class StringInJava
{
	void StringDefinition()
	{
		String s="Hello World";
		//String s1=new String("Hello World2");
		
		System.out.println(s);
		
		//Get length of String
		System.out.println(s.length());
		
		
		//loop through a string
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		String first="Aditi";
		String second="Dobriyal";
		
		//Add two Strings
		String third=first+second;
		System.out.println(third);
		
		//compare two strings
		boolean result1=first.equals(second);
		System.out.println(result1);
		
		/*
		 * Java Strings are Immutable
		 * In Java the JVM maintains a string pool to store all of its strings inside the memory
		 * The String pool helps in reusing the strings
		 * -If the string already exists, the new string is not created
		 * -Instead the new reference points to the already existing string
		 * -If he string does not exists new string is created
		 */
		
	
	}
	
	/*
	 * Character Array are mutable but Strings are not
	 */
	
	void charAndString()
	{
		char[] ch= {'H','e','l','l','o',' ','W','o','r','l','d'};
		
		
		System.out.println(ch);
		
		for(int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		String s1 = new String(ch); //char array to string
		System.out.println(s1);
		
		ch[0] = 'h';
		s1 = s1 + 'a';
		System.out.println(s1);

		
		String s2 = "Happy";
		char[] ch4 = s2.toCharArray();  //string to char array
		System.out.println(ch4);

		
		char[] a2 = { 'A', 'K', 'A' };
		String s3 = new String(a2);
		System.out.println(s3);

	}
}