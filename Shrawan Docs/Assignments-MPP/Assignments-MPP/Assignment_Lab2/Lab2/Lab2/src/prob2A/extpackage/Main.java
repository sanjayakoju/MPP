package prob2A.extpackage;

import prob2A.GradeReport;
import prob2A.Student;

public class Main {

	public static void main(String[] args) {

		// CASE 1:  whenever an instance of A is created, an instance of B must also be created
		Student student = new Student("Shrawan");
		GradeReport gradeReport = student.getGradeReport();
		gradeReport.setRemark("Good");
		
		
		// CASE 2: each must contain instance of each other
		Student s = gradeReport.getStudent();
		
		
		System.out.println(s.getName());
		
		
	}
	
	

}
