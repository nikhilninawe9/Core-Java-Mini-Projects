package Projects;

import java.util.Date;
import java.util.Scanner;

public class RailwayReservation {

	private String passengerName;
	private int age;
	private long mobileNumber;
	private String address;
	private long pinCode;
	private int pressNo;
	private int noTickets;
	private Date date;
	private int amount;
	private int mulFactor;
	private int trNo;
	private String trRoute;
	Scanner sc = new Scanner(System.in);

	public void details() {

		System.out.println("Enter your name: ");
		passengerName = sc.next().toString();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Enter your mobile number: ");
		mobileNumber = sc.nextLong();
		System.out.println("Enter your address: ");
		address = sc.next().toString();
		System.out.println("Enter your pin-code: ");
		pinCode = sc.nextLong();
		System.out.println("Mr. " + passengerName + ", please select the train..");

	}

	public void displayMenu() {

		System.out.println("Press 1 for Nagpur to Pune");
		System.out.println("Press 2 for Nagpur to Delhi");
		System.out.println("Press 3 for Nagpur to Mumbai");
		System.out.println("Press 4 for Nagpur to Lucknow");
		System.out.println("Press 5 for Nagpur to Hyderabad");
		pressNo = sc.nextInt();

	}

	public void selectTrain() {

		switch (pressNo) {
		case 1:
			System.out.println("Nagpur to Pune");
			trNo = 17121;
			mulFactor = 900;
			trRoute = "Nagpur to Pune";
			break;
		case 2:
			System.out.println("Nagpur to Delhi");
			trNo = 17132;
			mulFactor = 1200;
			trRoute = "Nagpur to Delhi";
			break;
		case 3:
			System.out.println("Nagpur to Mumbai");
			trNo = 17654;
			mulFactor = 850;
			trRoute = "Nagpur to Mumbai";
			break;
		case 4:
			System.out.println("Nagpur to Lucknow");
			trNo = 17987;
			mulFactor = 1500;
			trRoute = "Nagpur to Lucknow";
			break;
		case 5:
			System.out.println("Nagpur to Hyderabad");
			trNo = 14659;
			mulFactor = 742;
			trRoute = "Nagpur to Hyderabad";
			break;
		default:
			System.out.println("Wrong choice!");
			System.out.println("Please select again......");
			System.out.println();
			displayMenu();
			selectTrain();
		}

	}

	public void calculation() {
		System.out.println("Please enter number of tickets!");
		noTickets = sc.nextInt();
		amount = noTickets * mulFactor;
	}

	public void finalDisplay() {
		if (noTickets == 0) {
			System.out.println("Atleast 1 passanger must be travelling!");
			calculation();
			finalDisplay();
		} else {
			System.out.println("--------------Brillect Railway Service----------------");
			System.out.println("Date: " + new Date());
			System.out.println("Train number: " + trNo);
			System.out.println("Number of Passanger: " + noTickets);
			System.out.println("------------------------------------------------------");
			System.out.println("Train Route: " + trRoute);
			System.out.println("Passanger Details: " + passengerName);
			System.out.println("Passanger Age: " + age);
			System.out.println("Passanger Phone: " + mobileNumber);
			System.out.println("Passanger Address: " + address);
			System.out.println("Pincode: " + pinCode);
			System.out.println("------------------------------------------------------");
			System.out.println("Total amount to pay is: " + amount);
			System.out.println();
			System.out.println("Thanks for Selecting us Travelling Service");
			System.out.println("---------------------Happy Journey--------------------------");
			sc.close();
		}
	}

	public static void main(String[] args) {
		RailwayReservation r = new RailwayReservation();
		r.details();
		r.displayMenu();
		r.selectTrain();
		r.calculation();
		r.finalDisplay();
	}

}
