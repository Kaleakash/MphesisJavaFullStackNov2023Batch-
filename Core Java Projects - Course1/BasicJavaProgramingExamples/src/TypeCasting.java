
public class TypeCasting {

	public static void main(String[] args) {
		byte a=10;
		short b=a;		// implicit 
		System.out.println("a "+a);
		System.out.println("b "+b);
		short c =10;
		//byte d = c;		error 
		byte d = (byte)c;
		System.out.println("c "+c);
		System.out.println("d "+d);
		
		int m=100;
		float n=m;		// implicit 
		System.out.println("m "+m);
		System.out.println("n "+n);
		//float o1=100;
		//float o1 = 100.0f;	// type casting 
		float o1 = (float)100.0;// type casting 	
		int p = (int)o1;	// explicit type casting 
		System.out.println("o1 "+o1);
		System.out.println("p "+p);
	}

}
