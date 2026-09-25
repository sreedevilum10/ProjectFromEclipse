package com.luminar.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.luminar.entity.Student;
import com.luminar.util.HibernateUtil;

public class StudentDao {

	
//--------START--------------saveStudent-------------------------------------------
	
	public static void  saveStudent(Student student) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(student);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();//reverse transaction
			}
			e.printStackTrace();
		}
	}
//--------END--------------saveStudent-------------------------------------------
	
	//--------START--------------updateStudent-------------------------------------------
	
	public static void updateStudent(Student student) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.update(student);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		}
	}
	
	//--------END--------------updateStudent-------------------------------------------
	
	//--------START--------------deleteStudent-------------------------------------------
	
		public static void deleteStudent(Student student) {//DML
			Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				transaction = session.beginTransaction();
				
				Student theStudent = session.get(Student.class, student.getRollno());
				if (student != null) {
					session.delete(theStudent);
				}
				
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null)
					transaction.rollback();
				e.printStackTrace();
			}
		}
		
		//--------END--------------updateStudent-------------------------------------------
	
	
	
	
	//--------START--------------getStudents-------------------------------------------
	
	public static List<Student> getStudents() {// DQL
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			//transaction    <- data from table to page
			//transaction -> from page - to table (guranteed transaction)
			return session.createQuery("from Student", Student.class).list();
			//HQL -> hibernate query language [ Student-> from entity student] 
			//createQuery("from ...) -> create an sql query using keyword from 
			// return datas should be [type] entity class
			// converted return values to list
			// return that list
		}
	}
	
	//--------END--------------getStudents-------------------------------------------
	
	//--------START--------------getStudentDetails-------------------------------------------
	
	public static Student getStudentDetails(Student student) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.get(Student.class, student.getRollno());
			//select * from students where rollno=? // 4
		}
	}
	
	//--------END--------------getStudentDetails-------------------------------------------
	
	
	
	
	

}
