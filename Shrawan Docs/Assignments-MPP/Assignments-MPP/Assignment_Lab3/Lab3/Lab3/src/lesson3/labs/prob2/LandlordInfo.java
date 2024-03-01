package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LandlordInfo {
	
	List<Building> buildings = new ArrayList<Building>();
	
	LandlordInfo(){
		
	}
	
	void addBuilding(Building building) {
		this.buildings.add(building);
	}

	public double calcProfits() {
		
		double buildingProfit = 0;
		for (Building building : buildings) {
			List<Apartment> apartments = building.getApartments();
			
			double totalApartmentRents = 0;
			for(Apartment apartment: apartments) {
				double rent = apartment.getRent();
				totalApartmentRents += rent;
			}
			
			buildingProfit += totalApartmentRents - (building.getMaintenanceCost() + building.getTaxes());
			
		}
		
		return buildingProfit;
	}

}
