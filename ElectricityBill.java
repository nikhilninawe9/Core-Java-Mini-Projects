package Projects;

import java.util.Scanner;

public class ElectricityBill {

	private String userName;
	private String cityName;
	private double unitsConsumed;
	private double totalBill;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		userName = sc.next();
		System.out.println("Enter the city");
		cityName = sc.next();
		System.out.println("Enter units consumed");
		unitsConsumed = sc.nextDouble();
	}

	public void calculation() {
		if (unitsConsumed > 1 && unitsConsumed <= 50) {
			totalBill = unitsConsumed * 1.5;
		} else if (unitsConsumed > 51 && unitsConsumed <= 100) {
			totalBill = unitsConsumed * 3.0;
		} else if (unitsConsumed > 100 && unitsConsumed <= 200) {
			totalBill = unitsConsumed * 4.0;
		} else if (unitsConsumed > 200 && unitsConsumed < 300) {
			totalBill = unitsConsumed * 5;
		} else if (unitsConsumed > 300) {
			totalBill = unitsConsumed * 6;
		} else {
			totalBill = unitsConsumed;
		}
	}

	public void display() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("-**Bill Generated**-");
		System.out.println("Customer Name: " + userName);
		System.out.println("Customer Address: " + cityName);
		System.out.println("Unit Consumed: " + unitsConsumed);
		System.out.println("Total Amount: " + totalBill);
		System.out.println("***********************************");
		System.out.println("For Reference");
		System.out.println("First 1-50 units 1.5 rupees per units charges apply!");
		System.out.println("First 51-100 units 3 rupees per units charges apply!");
		System.out.println("First 100-200 units 4 rupees per units charges apply!");
		System.out.println("First 200-300 units 5 rupees per units charges apply!");
		System.out.println("More than 300 units 6 rupees per units charges apply!");
		System.out.println("---------------------------------------------------------------");
	}

	public static void main(String[] args) {
		ElectricityBill u = new ElectricityBill();
		u.input();
		u.calculation();
		u.display();
	}

}
