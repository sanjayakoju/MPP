package practiseSequenceDiagram;

public class Position {

	private String title;
	private String description;
	private Employee employee;
	
	Position(String title, String description, Employee employee) {
		this.title = title;
		this.description = description;
		this.employee = employee;
	}
	
	public double getSalary() {
		return employee.getSalary();
	}
}
