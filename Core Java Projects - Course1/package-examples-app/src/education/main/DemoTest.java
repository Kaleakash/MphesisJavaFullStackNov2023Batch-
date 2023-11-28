package education.main;
//import education.school.*;		// we can use all classes and interface part of school package. 
import education.college.Attendance;	// particular class. 
//import education.school.Attendance;
public class DemoTest {

	public static void main(String[] args) {
		
		Attendance att1  = new Attendance();
		att1.display();
		education.school.Attendance att2 = new education.school.Attendance();
		att2.display();
	}

}
