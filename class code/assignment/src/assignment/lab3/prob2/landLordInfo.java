package assignment.lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class landLordInfo {

	private List<Building> buildings = new ArrayList<Building>();
	
	public landLordInfo() {
		
	};

	public void addBuilding(Building b) {
		// TODO Auto-generated method stub
		buildings.add(b);
		
	}

	public double calcProfits() {
		// TODO Auto-generated method stub
		double buildingProfit = 0;
		for (Building building : buildings) {
			List<Apartment> apartments = building.getApartment();
			
			double totalApartmentRents = 0;
			for(Apartment apartment: apartments) {
				double rent = apartment.getRent();
				totalApartmentRents += rent;
			}
			
			buildingProfit += totalApartmentRents - (building.getMaintenanceCost() );
			
		}
		
		return buildingProfit;
	}

	
}
