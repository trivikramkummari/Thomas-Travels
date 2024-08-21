package com.thomas.travels;

import java.util.ArrayList;

public class Travel {

	public boolean isCarDriver(Driver driver) {
		if (driver.getCategory().equals("car")) {
			return true;
		}
		return false;
	}

	public String retrivebyDriverId(ArrayList<Driver> drivers, int searchdriverId) {

		for (Driver neededDriver : drivers) {
			if (neededDriver.getDriverId() == searchdriverId) {
				System.out.println("Driver name is " + neededDriver.getDriverName() + " belonging to the category "
						+ neededDriver.getCategory() + " travelled " + neededDriver.getTotalDistance() + " so far");
			}
		}

		return "hello";
	}

	public int retrieveCountOfDriver(ArrayList<Driver> driversdata, String searchCategory) {
		int count = 0;
		for (Driver searchCat : driversdata) {
			if (searchCat.getCategory().equals(searchCategory)) {
				count += 1;
			}
		}

		return count;
	}

	public ArrayList<Driver> retrieveDriver(ArrayList<Driver> drivers, String category) {
		ArrayList<Driver> selectedDrivers = new ArrayList<>();
		for (Driver driver : drivers) {
			if (driver.getCategory().equals(category)) {
				selectedDrivers.add(driver);
			}
		}
		return selectedDrivers;
	}

	public Driver maximumDistanceMethod(ArrayList<Driver> drivers) {
		Driver maxDistanceDriver = drivers.get(0);
		for (Driver driver : drivers) {
			if (driver.getTotalDistance() > maxDistanceDriver.getTotalDistance()) {
				maxDistanceDriver = driver;
			}
		}
		return maxDistanceDriver;
	}

}