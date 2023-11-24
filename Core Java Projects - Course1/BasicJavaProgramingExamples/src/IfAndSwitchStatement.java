
public class IfAndSwitchStatement {

	public static void main(String[] args) {
//	System.out.println("simple if");
//	int a=10;
//	int b=5;
//	if(a>b) {
//		System.out.println("Yes a is big");
//	}else {
//		System.out.println("no b is big");
//	}
//
//	
//	System.out.println("Finish");
		int label=2;
		switch(label) {
		case 1:System.out.println("1st block");
		        break;
		case 2:System.out.println("2nd block");
        		break;
		case 3:System.out.println("3rd block");
        		break;
		case 4:System.out.println("4th block");
        		break;
        default :System.out.println("Wrong choice");
        		break;
		}
		System.out.println("finish");
	}

}
