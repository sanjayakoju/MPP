package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	
	private double maintenanceCost;
	private double taxes;
	
	private List<Apartment> apartments = new ArrayList<>();

	Building(double profit, double maintenanceCost) {
		this.maintenanceCost = profit;
		this.taxes = maintenanceCost;
	}
	
	
	void addApartment(Apartment apartment) {
		this.apartments.add(apartment);
	}
	
	List<Apartment> getApartments() {
		return apartments;
	}



	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}



	public double getTaxes() {
		return this.taxes;
	}
}
