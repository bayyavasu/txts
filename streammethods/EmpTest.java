import java.util.List;
import java.util.Optional;

import com.slokam.pojo.Employee;
import com.slokam.utility.EmpUtility;

public class EmpTest {

	public static void main(String[] args) {
		List<Employee> empList = EmpUtility.getEmpInfo();
		empList.stream().forEach(e -> System.out.println(e));
		System.out.println("==========Emp Count==========");
		System.out.println(empList.stream().count());
		System.out.println("==========Filter even emp List ==========");
		empList.stream().filter(emp -> emp.getEmpId() % 2 == 1).forEach(e -> {
			Optional<String> opp = Optional.ofNullable(e.getEmpName());
			System.out.println("==========Inside Filet Foreach Optional ==========");
			if (opp.isPresent()) {
				String str = opp.get();
				System.out.println("Odd Emp Id Names:::::::::::"+str);
			}
		});
		System.out.println("==========anyMatch()==========");
		boolean val = empList.stream().
				anyMatch(eempNew -> eempNew.getEmpName().equals("empTwo"));
		System.out.println(val);
		System.out.println("==========allMatch()==========");
		System.out.println(empList.stream().
				allMatch(empObj -> empObj.getEmpName().startsWith("emp")));
		System.out.println("==========findAny==========");
		Optional<Employee> emp = empList.stream().findAny();
		if (emp.isPresent()) {
			System.out.println(emp.get().getEmpName());
		}
		System.out.println("==========findFirst==========");
		Optional<Employee> empFirst = empList.stream().findFirst();
		if (empFirst.isPresent()) {
			System.out.println(emp.get().getEmpName());
		}
		System.out.println("==========sortByEmpName==========");
		empList.stream().sorted((e1,e2) -> e1.getEmpName().
				compareTo(e2.getEmpName())).
		forEach(sortedEmp -> System.out.println(sortedEmp.getEmpName()));
	}

}
