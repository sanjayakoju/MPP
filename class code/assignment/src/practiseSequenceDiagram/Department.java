package practiseSequenceDiagram;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private String location;
	private List<Position> positions;
	
	Department(String name, String location, List<Position> pList) {
		this.name = name;
		this.location = location;
		this.positions = new ArrayList<>();
		this.positions.addAll(pList);
	}
	
	public double getSalary() {
		double sum = 0;
		for(Position p : positions) {
			sum += p.getSalary();
		}
		return sum;
	}
}
