package practiseSequenceDiagram;

import java.util.Date;

public class Employee {

	private int employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private long ssn;
	private Date birthdate;
	private double salary;
	private Position position;
	
	public Employee(int employeeId, String firstName, String middleName, String lastName, long ssn, Date dob, double salary, Position position) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.birthdate = dob;
		this.salary = salary;
		this.position = position;
	}
	
	public double getSalary() {
		return salary;
	}
}
