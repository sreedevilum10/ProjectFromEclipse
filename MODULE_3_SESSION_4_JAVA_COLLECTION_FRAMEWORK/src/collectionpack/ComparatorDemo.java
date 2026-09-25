package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	int empno;
	String name;
	int age;

	Employee(int empno, String name, int age) {
		this.empno = empno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator {// before generic
	
	public int compare(Object o1,Object o2) {
		Employee e1=(Employee)o1; 
		Employee e2=(Employee)o2;
		
		if (e1.age == e2.age)
			return 0;
		else if (e1.age > e2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator{
	
	public int compare(Object o1,Object o2) {
		Employee e1=(Employee)o1; 
		Employee e2=(Employee)o2;
		return e1.name.compareTo(e2.name);
	}
}

public class ComparatorDemo {
	public static void main(String args[]) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(114, "Devu", 25));
		al.add(new Employee(105, "Bini", 26));
		al.add(new Employee(108, "Kripz", 24));

		System.out.println("Sorting by Name...");
		
		Collections.sort(al, new NameComparator());
		for (Employee emp : al) {
			System.out.println(emp.empno + " " + emp.name + " " + emp.age);
		}

		System.out.println("sorting by age...");

		Collections.sort(al, new AgeComparator());
		for (Employee emp : al) {
			System.out.println(emp.empno + " " + emp.name + " " + emp.age);
		}
	}
}
