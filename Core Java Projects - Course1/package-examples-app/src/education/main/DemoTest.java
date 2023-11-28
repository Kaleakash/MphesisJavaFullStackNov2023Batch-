package education.main;
import com.bean.Developer;
import com.bean.Employee;
import com.entity.Manager;
import com.service.EmployeeService;

//import education.school.*;		// we can use all classes and interface part of school package. 
import education.college.Attendance;	// particular class. 
//import education.school.Attendance;
public class DemoTest {

	public static void main(String[] args) {
		
		Attendance att1  = new Attendance();
		att1.display();
		education.school.Attendance att2 = new education.school.Attendance();
		att2.display();
		Employee emp = new Employee();
		emp.disEmp();
		System.out.println("-------------------");
		Developer dv1 = new Developer();
		dv1.disDev();
		System.out.println("-------------------");
		Manager mgr1 = new Manager();
		mgr1.disMgr();
		System.out.println("-------------------");
		EmployeeService es = new EmployeeService();
		es.disEmployeeInfo();
	}

}
