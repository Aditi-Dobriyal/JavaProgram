package UNIT01;

/* 
# Operator in Java is a symbol that is used to perform operations.
 
   sum=a+b;
   For example: +, -, *, /etc.
   ->a+=1; // a=a+1;
   
# Types of operators in Java
  - Unary Operator:     {prefix and post-fix} [a++, a--, ++a, --a, ~a, !a]
  -Arithmetic Operators {*, /, +, -, %}
  -Shift Operators      {<<, >>}
  -Relational Operator  {< > <= >= == !=}
  
  -Bitwise Operator:    {&, |, ^}
  -Logical Operator:    {&&, ||}
  
  -Ternary Operators:   {? :}
  -Assignment Operator: {= += -= /= %= &= ^= |= <<= >>= >>>=2}
   
 */
public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {
		
		OperatorsInJava obj= new OperatorsInJava();
		
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShiftOperator();
		obj.RelationalOperator();
		obj.BitwiseAndLogicalOperators();
		obj.TernaryOperator();
		obj.AssignmentOperator();
	}
}

class OperatorsInJava{
	void UnaryOperator() {
		
		int a=10; 
		boolean b=false;
		System.out.println("Inside UnaryOperator");
		System.out.println(a++);    //10
		System.out.println(a--);    //11
		System.out.println(++a);    //11
		System.out.println(--a);	//10
		
		
		/*
		 * Bitwise Complement(~)
		 * This unary operator returns the one's complement representation of the input value with all bits inverted, which means it makes
		   every 0 to 1, and every 1 to 0.
		 */
		System.out.println(~a); //invert all bits
		
		System.out.println(!b);
		System.out.println("\n");
	}
	
	void ArithmeticOperator() {
		System.out.println("Inside Arithmetic operation");
		int a=10; 
		int b=5;
		System.out.println(a+b);   //15
		System.out.println(a-b);   //5
		System.out.println(a*b);   //50
		System.out.println(a/b);   //2
		System.out.println(a%b);   //0
		
		System.out.println(((10*10)/5)+3-((1*4)/2));   //21
		System.out.println("\n");
	}
	
	void ShiftOperator() {
		System.out.println("Inside ShiftOperator");
		/*
		 0101010<<1   ==  1010100
		 
		 0,0,1,0,0,0 {8>>1}  
		 0,0,0,1,0,0 {4>>1}
		 0,0,0,0,1,0 {2>>1}
		 0,0,0,0,0,1 {1}
		 32,16,8,4,2,1
		 
		 0,0,1,0,0,0 {8<<1}
		 0,1,0,0,0,0 {16<<1}
		 1,0,0,0,0,0 {32}
		 */
		
		System.out.println(10 << 2); // 10*2^2=10*4=40
		System.out.println(15 << 4); // 15*2^4=15*16=240
		
		System.out.println(10 >> 2); // 10/2^2=10/4=2
		System.out.println(20 << 2); // 20/2^2=20/4=5
		
		System.out.println("\n");
	}
	  
	void RelationalOperator() {
		System.out.println("Inside RelationalOperator");
		
		int a=10;
		int b=20;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);

		System.out.println("\n");

	}
	
	//Bitwise: Second condition is also checked but not in logical && and even in ||
	void BitwiseAndLogicalOperators() {
		System.out.println("Inside BitwiseAndLogicalOperators");
		
		int a=10;
		int b=5;
		int c=20;
		
		//logical && and Bitwise &
		System.out.println(a<b && a++<c);   //false && true=false
		System.out.println(a);              //10 because second condition not checked
		
		System.out.println(a<b & a++<c);    //false && true=false
		System.out.println(a);              //11 because second condition is checked
		
		//Logical || and Bitwise |
		System.out.println(a>b || a<c);     //true || true= true
		System.out.println(a>b | a<c);      //true|true =true
		
		System.out.println(a>b || a++<c);   //true || true= true  
		System.out.println(a);              //10 because second condition not checked		
	}
	
	
	void  TernaryOperator() {
		System.out.println("Inside TernaryOperator");
		
		int a=2;
		int b=5;
		int min=(a<b)?a:b;
		System.out.println(min);
		System.out.println("\n");
	}
	
	void AssignmentOperator() {
		System.out.println("Inside AssignmentOperator");
		
		int a=10;
		int b=20;
		a+=4; //a=a+4;   
		b-=4; //b=b-4;
		System.out.println(a);
		System.out.println(b);
		System.out.println("\n");

	}
}