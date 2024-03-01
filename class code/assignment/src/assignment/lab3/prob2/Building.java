package assignment.lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	
	private List<Apartment> apartment;
	private double maintenanceCost;
	private double profit;
	
	public Building(double profit, double maintenanceCost) {
		apartment = new ArrayList<>();
		this.maintenanceCost = maintenanceCost;
		this.profit = profit;
		
	}

	public void addApartment(Apartment a) {
		// TODO Auto-generated method stub
		apartment.add(a);
	}

	public List<Apartment> getApartment() {
		return apartment;
	}

	public void setApartment(List<Apartment> apartment) {
		this.apartment = apartment;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}
	
	

}
