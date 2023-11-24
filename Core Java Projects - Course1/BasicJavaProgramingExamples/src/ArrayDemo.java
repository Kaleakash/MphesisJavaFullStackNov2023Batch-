
public class ArrayDemo {

	public static void main(String[] args) {
	int abc[];		// declation 
int xyz[]= {10,20,30,40,50,60,100,120,45,23,43,12,56,78,90};
	System.out.println(xyz);		// display array address in hexa decimal format. 
	System.out.println("0 index postion "+xyz[0]);
	System.out.println("0 index postion "+xyz[3]);
	//System.out.println("0 index postion "+xyz[10]);
	int mno[]=new int[10];	// dynamic memory 
	System.out.println("0 position value "+mno[0]);
	System.out.println("9 position value "+mno[9]);
	mno[0]=100;
	mno[1]=101;
	System.out.println("0 position value "+mno[0]);
	System.out.println("1 position value "+mno[1]);
	
	System.out.println("Retrieve array value using for loop");
	System.out.println("Size of array "+xyz.length);  // size of array 
	for(int i=0;i<xyz.length;i++) {
		System.out.println("Value of array "+xyz[i]);
	}
	System.out.println("Retrieve array value for enhaced loop");
	for(int n : xyz) {
		System.out.println("Value of array "+n);
	}
	}

}
