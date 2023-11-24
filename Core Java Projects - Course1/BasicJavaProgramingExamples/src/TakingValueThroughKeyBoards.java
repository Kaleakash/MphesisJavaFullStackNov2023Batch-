import java.util.Scanner;
public class TakingValueThroughKeyBoards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of a");
//		int a = sc.nextInt();		// it is use to can int value 
//		System.out.println("Enter the value of b ");
//		int b = sc.nextInt();
//		int sum = a+b;
//		System.out.println("Sum of two number is "+sum);
		
		String name = "Ravi Kumar";// memory created...
		System.out.println(name);
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String fname = sc.next();   // it is use to scan string value 
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		System.out.println("id is "+id);
		System.out.println("name is "+fname);
		System.out.println("salary "+salary);

	}

}
