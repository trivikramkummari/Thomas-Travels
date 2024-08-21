package com.thomas.travels;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Travel travel = new Travel();

		Driver driver1 = new Driver(121, "lorry", "rajesh", 126.33);
		Driver driver2 = new Driver(123, "car", "ramesh", 185.33);
		Driver driver3 = new Driver(125, "bus", "suresh", 189.33);
		Driver driver4 = new Driver(127, "scooty", "naresh", 175.33);
		Driver driver5 = new Driver(129, "car", "rakesh", 165.33);

		ArrayList<Driver> driverslist = new ArrayList<>();
		driverslist.add(driver1);
		driverslist.add(driver2);
		driverslist.add(driver3);
		driverslist.add(driver4);
		driverslist.add(driver5);

		boolean running = true;
		while (running) {
			System.out.println("Menu:");
			System.out.println("1. Check if a driver is a car driver");
			System.out.println("2. Fetch driver details by driverId");
			System.out.println("3. Count the number of drivers for a particular category");
			System.out.println("4. Retrieve drivers of a particular category type");
			System.out.println("5. Find the driver with the maximum distance travelled");
			System.out.println("6. Exit");

			System.out.print("Enter your choice: ");
			int choice = input.nextInt();
			input.nextLine(); // Consume the newline

			switch (choice) {
			// 1st case Whether category is car or not?
			case 1:
				isCarDrive(input, travel);
				break;

			// 2nd case Fetching the driver details by driver id
			case 2:
				System.out.println("Available DriverIds: 121, 123, 125, 127, 129");
				System.out.print("Enter driverId: ");
				int driverId = input.nextInt();
				input.nextLine(); // Consume the newline
				travel.retrivebyDriverId(driverslist, driverId);
				break;

			// 3rd case Counting the particular type of category
			case 3:
				System.out.print("Enter category to count (e.g., car, bus): ");
				String countCategory = input.nextLine();
				int countOfCategory = travel.retrieveCountOfDriver(driverslist, countCategory);
				System.out.println("The count of the category is " + countOfCategory);
				break;

			// 4th case For retrieving drivers of particular category type
			case 4:
				System.out.print("Enter category to retrieve drivers (e.g., car, bus): ");
				String retrieveCategory = input.nextLine();
				ArrayList<Driver> categoryDrivers = travel.retrieveDriver(driverslist, retrieveCategory);
				System.out.println("List of " + retrieveCategory + " Drivers:");
				for (Driver driver : categoryDrivers) {
					System.out.println(driver.getDriverName());
				}
				break;

			// 5th case Maximum distance travelled?
			case 5:
				Driver maximumDistance = travel.maximumDistanceMethod(driverslist);
				System.out.println("Maximum distance travelled by " + maximumDistance.getDriverName());
				break;

			// 6th case Exiting
			case 6:
				System.out.println("Exiting...");
				running = false;
				break;
			// default Invalid choice
			default:
				System.out.println("Invalid choice. Please select a valid option.");
				break;
			}
		}

		input.close();
	}

	private static void isCarDrive(Scanner input, Travel travel) {
		Driver driver = new Driver(256, "car", "somesh", 180.36);
		System.out.println(travel.isCarDriver(driver));
	}
}