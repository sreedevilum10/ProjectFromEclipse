package com.luminar.test;

import java.util.List;
import java.util.Scanner;

import com.luminar.dao.StudentDao;
import com.luminar.entity.Student;


public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List < Student > students=null;
		Student student=null;
		Student theStudent=null;  // get a student details from table
		
		int rollno;
		String name;
		float mark;
		
	//---------------------------------------
	
		System.out.println("enter name");
		name=sc.nextLine();
		
		System.out.println("enter mark");
		mark=sc.nextFloat();
		
	// insert a row in table student		
		student=new Student();
		
		student.setName(name);
		student.setMark(mark);
		
		StudentDao.saveStudent(student);
	
	//view table records	
	
		students = StudentDao.getStudents();		
		students.forEach((e) -> {System.out.println(e.getRollno()+" " +e.getName()+" "+e.getMark()); });
	
		
// update a record in table .	
		
		System.out.println("Enter the roll number whose record is to be updated. "); // you have to give id in table
		rollno=sc.nextInt();
		
		sc.nextLine(); //remove newline from buffer
		
		System.out.println("enter new name");
		name=sc.nextLine();
		
		System.out.println("enter the new mark");
		mark=sc.nextFloat();
		
		student.setRollno(rollno);
		student.setName(name);
		student.setMark(mark);
		StudentDao.updateStudent(student);
	//view table records	
		
		students = StudentDao.getStudents();		
		students.forEach((e) -> {System.out.println(e.getRollno()+" " +e.getName()+" "+e.getMark()); });
		
		// delete a record in the table 		
		
		
		System.out.println("Enter the roll number whose record is to be deleted. "); // you have to give id in table
		rollno=sc.nextInt();
		
		student.setRollno(rollno);
		StudentDao.deleteStudent(student);
		
		//view table records	
		
				students = StudentDao.getStudents();		
				students.forEach((e) -> {System.out.println(e.getRollno()+" " +e.getName()+" "+e.getMark()); });
		
		//view a student's details
		
				System.out.println("Enter the roll number for the record you want to view.. "); // you have to give id in table
				rollno=sc.nextInt();
				
				student.setRollno(rollno);
				theStudent=StudentDao.getStudentDetails(student);
				System.out.println(theStudent.getRollno()+" " +theStudent.getName()+" "+theStudent.getMark()); 
				
	}
}
