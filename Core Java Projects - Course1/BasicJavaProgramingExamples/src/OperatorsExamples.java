
public class OperatorsExamples {

	public static void main(String[] args) {
//	System.out.println("Arithmetic operation");
//	int a=10;
//	int b=3;
//	int sum=a+b;
//	int sub = a-b;
//	int mul = a*b;
//	int div = a/b;
//	int mod = a%b;
//	System.out.println("Add "+sum);
//	System.out.println("Sub "+sub);
//	System.out.println("Mul "+mul);
//	System.out.println("Div "+div);
//	System.out.println("Mod Remainider"+mod);
		int a=10;
		int b=a;
		System.out.println("b = "+b);		// 10 
		b=a++;			// first store and then increment 			
		System.out.println("a=  "+b);		// 10
		b=++a;			// store and then increment 
		System.out.println("a = "+b);		// 12
	}

}
