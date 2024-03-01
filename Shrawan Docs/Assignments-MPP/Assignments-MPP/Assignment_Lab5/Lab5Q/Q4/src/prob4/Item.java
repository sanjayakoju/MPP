package prob4;

import java.time.LocalDate;

public class Item {
	String name;
	Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}
