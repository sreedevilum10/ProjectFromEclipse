package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Department {
	private int deptId;
	private String deptName;

	public Department(int deptId, String deptName) {
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

class Employeeee {
	private int empId;
	private String empName;
	private double empSalary;
	private Departmentt department;

	public Employeeee(int empId, String empName, double empSalary, Departmentt department) {

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

	public Departmentt getDepartment() {
		return department;
	}
}
//===========================salary comparator=============================

class SalaryComparator implements Comparator<Employeeee> {

	@Override
	public int compare(Employeeee o1, Employeeee o2) {
		return Double.compare(o1.getEmpSalary(), o2.getEmpSalary());
	}
}

//===========================Department comparator=============================
class DepartmentComparator implements Comparator<Employeeee> {

	@Override
	public int compare(Employeeee o1, Employeeee o2) {

		int result = o1.getDepartment().getDeptName().compareTo(o2.getDepartment().getDeptName());
//if department name is same sort by highest salary
		if (result == 0) {
			return Double.compare(o2.getEmpSalary(), o1.getEmpSalary());
		}
		return result;
	}
}


//=================Main Class==========================
public class ComparatorWithMultipleObjects {

	public static void main(String[] args) {
		Departmentt deptOne = new Departmentt(100, "IT");
		Departmentt deptTwo = new Departmentt(102, "HR");
		Departmentt deptThree = new Departmentt(101, "Finance");

		ArrayList<Employeeee> employeeList = new ArrayList<Employeeee>();
		employeeList.add(new Employeeee(200, "Abhilash", 50000, deptOne));
		employeeList.add(new Employeeee(189, "Rakhi", 45000, deptThree));
		employeeList.add(new Employeeee(192, "Manu", 60000, deptOne));
		employeeList.add(new Employeeee(182, "Anu", 60000, deptTwo));
		employeeList.add(new Employeeee(199, "Jeeva", 30000, deptOne));

		System.out.println("Sort Employee by salary.......");

		Collections.sort(employeeList, new SalaryComparator());
		for (Employeeee e : employeeList) {
			System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getEmpSalary() + " "
					+ e.getDepartment().getDeptName());
		}

		System.out.println("####################################");
		System.out.println("Sort Employee by department.......");

		Collections.sort(employeeList, new DepartmentComparator());
		for (Employeeee e : employeeList) {
			System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getEmpSalary() + " "
					+ e.getDepartment().getDeptName());

		}
	}

}
