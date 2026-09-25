package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	String name;
	int age;
	int id;

	public Student(String name, int age, int id) {

		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public int compareTo(Student st) {

		if(this.age != st.age) 
			return this.age - st.age;
		return this.id - st.id;
		
		// comparing with age
//		if (age == st.age) {
//			//if age is same then check id
//			if (id == st.id) {
//				return 0;
//			} else if (age > st.age) {
//				return 1;
//			} else {
//				return -1;
//			}
//		} else if (age > st.age) {
//			return 1;
//		} else {
//			return -1;
//		}

		// comparing name
		// return this.name.compareTo(st.name);//ascending order
		// return st.name.compareTo(this.name);//descending order
	}

}

public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Anju", 12, 103));
		students.add(new Student("Bini", 13, 104));
		students.add(new Student("Ciya", 11, 105));
		students.add(new Student("Arya", 10, 100));

		Collections.sort(students);
		for (Student s : students) {
			System.out.println("Id: " + s.id + " Name: " + s.name + " Age: " + s.age);
		}
	}

}
