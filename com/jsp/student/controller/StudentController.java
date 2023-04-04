package com.jsp.student.controller;
import com.jsp.student.dao.StudentDao;
import com.jsp.student.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		//stydent1 
		Student student1 = new Student();
		
		
//		student1.setId(1);
//		student1.setName("abc");
//		student1.setEmail("Abc@gmail.com");
//		 StudentDao studentDao= new StudentDao();
//		Student student= studentDao.saveStudent(student1);
//		
		//student 2
//		Student student2 = new Student();
//		student2.setId(2);
//		student2.setName("osama");
//		student2.setEmail("osama@gmail.com");
//		StudentDao studentDao= new StudentDao();
//      	Student student= studentDao.saveStudent(student2);
//		Student student3 = new Student();
//		student3.setId(3);
//		student3.setName("nur");
//		student3.setEmail("nur@gmail.com");
//		StudentDao studentDao= new StudentDao();
//      	Student student= studentDao.saveStudent(student3);
		
//		
//		if(student3 !=null) {
//			System.out.println("added Succesfuuly");
//		}
		
		//update 
		StudentDao studentDao= new StudentDao();
//         studentDao.Update(1, "ahmed");
		
//		studentDao.readAll();
		studentDao.read(1);
		
		

	}

}
