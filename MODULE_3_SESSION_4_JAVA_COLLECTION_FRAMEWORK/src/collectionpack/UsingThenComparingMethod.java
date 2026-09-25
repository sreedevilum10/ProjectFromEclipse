package collectionpack;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Collections;
import java.util.Comparator;

class Departmentt {
	private int deptId;
	private String deptName;

	public Departmentt(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}
}

class Staff {
	private int empId;
	private String empName;
	private double empSalary;
	private Department department;

	public Staff(int empId, String empName, double empSalary, Department department) {

		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.department = department;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public Department getDepartment() {
		return department;
	}
}

//=================Main Class==========================
public class UsingThenComparingMethod {

	public static void main(String[] args) {
		Department deptOne = new Department(100, "IT");
		Department deptTwo = new Department(102, "HR");
		Department deptThree = new Department(101, "Finance");

		ArrayList<Staff> employeeList = new ArrayList<Staff>();
		employeeList.add(new Staff(200, "Abhilash", 50000, deptOne));
		employeeList.add(new Staff(189, "Rakhi", 45000, deptThree));
		employeeList.add(new Staff(192, "Manu", 60000, deptOne));
		employeeList.add(new Staff(182, "Anu", 60000, deptTwo));
		employeeList.add(new Staff(199, "Jeeva", 30000, deptOne));

	
		System.out.println("####################################");
		System.out.println("Sort Employee by department....then Salary...");
		
		employeeList.sort(Comparator
				.comparing((Staff s)->s.getDepartment().getDeptName())
				.thenComparing(Comparator.comparing(Staff :: getEmpSalary).reversed()));
		
		for (Staff e : employeeList) {
			System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getEmpSalary() + " "
					+ e.getDepartment().getDeptName());

		}

		
	}

}


