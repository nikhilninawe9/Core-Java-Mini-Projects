package one;

import java.util.Arrays;
import java.util.Scanner;

public class DoctorAppointmentProject {
	private String userpatientName;
	private String userAddress;
	private long userMobile;
	private String userName;
	private String password;
	private int choice1;
	private String loginUsername = null;
	private String loginPassword = null;
	private int patientChoice;
	private int cityChoice;
	private int doctorChoice;
	private String patientName;
	private int patientAge;
	private long patientMobile;
	private int patList;
	private String[] user = new String[10];
	private String[] pat = new String[10];
	private int counter1 = 0;
	private int counter2 = 0;
	private int patientLoginCounter = 0;
	Scanner sc = new Scanner(System.in);

	public DoctorAppointmentProject() {
		System.out.println("---------Welcome to Brillect Hospitals---------");
		System.out.println("Please follow the procedure");
		System.out.println("-----------------------------------------------");
	}

	public void patient() {
		System.out.println("------Welcome to Patient Menu------");
		System.out.println("Press 1 for Registration");
		System.out.println("Press 2 for Login");
		patientChoice = sc.nextInt();
	}

	public void welcomeBar() {
		System.out.println("Press 1 for Patients");
		System.out.println("Press 2 for Doctors");
		System.out.println("Press 3 for Admin Services");
		choice1 = sc.nextInt();
	}

	public void welExecution() {
		switch (choice1) {
		case 1:
			patient();
			switch (patientChoice) {
			case 1:
				System.out.println("Register yourself..");
				patientRegistration();
				welcomeBar();
				welExecution();
				break;

			case 2:
				if (userName != null && password != null) {
					System.out.println("Patient Login");
					System.out.println("------Enter the required credentials for login------");
					patientLogin();
				} else {
					System.out.println("Please Register first then try!..");
					patient();
					System.out.println("Register yourself..");
					patientRegistration();
					welcomeBar();
					welExecution();
				}
				break;

			default:
				System.out.println("Wrong choice!!");
				System.out.println("Please select the menu again..");
				welcomeBar();
				welExecution();
			}
			break;

		case 2:
			System.out.println("----Doctors Currently Available----");
			citySelect();
			break;

		case 3:
			System.out.println("----Admin Services----");
			XList();
			welcomeBar();
			welExecution();
			break;

		default:
			System.out.println("Wrong choice!!");
			System.out.println("Please select the menu again..");
			welcomeBar();
			welExecution();
		}
	}

	public void patientRegistration() {
		System.out.println("Please enter Name:");
		userpatientName = sc.next().toString();
		user[counter1] = userpatientName;
		System.out.println("Please enter Address:");
		userAddress = sc.next().toString();
		System.out.println("Please enter Mobile number:");
		userMobile = sc.nextLong();
		System.out.println("Please set username:");
		userName = sc.next().toString();
		System.out.println("Please set password:");
		password = sc.next().toString();
		System.out.println("---Registration Done Successfully---");
		System.out.println("Your username is " + userName + " and password is " + password);
		counter1++;
	}

	public void doctor() {

	}

	public void patientLogin() {
		System.out.println("Please enter registered username:");
		loginUsername = sc.next().toString();
		System.out.println("Please enter required password:");
		loginPassword = sc.next().toString();

		if (loginUsername.equals(userName) && loginPassword.equals(password)) {
			patientLoginCounter++;
			System.out.println("User Exists");
			System.out.println("Welcome " + userpatientName);
			citySelect();

		} else {
			System.out.println("Invalid Credentials!");
			patientLogin();
		}

	}

	public void citySelect() {
		System.out.println("------Please Select the city------");
		System.out.println("1 Nagpur");
		System.out.println("2 Mumbai");
		System.out.println("3 Pune");
		System.out.println("4 Delhi");
		System.out.println("5 Bangalore");
		cityChoice = sc.nextInt();

		switch (cityChoice) {
		case 1:
			System.out.println("Select the doctor from Nagpur");
			doctorDetails();
			break;

		case 2:
			System.out.println("Select the doctor from Mumbai");
			doctorDetails();
			break;

		case 3:
			System.out.println("Select the doctor from Pune");
			doctorDetails();
			break;

		case 4:
			System.out.println("Select the doctor from Delhi");
			doctorDetails();
			break;

		case 5:
			System.out.println("Select the doctor from Bangalore");
			doctorDetails();
			break;

		default:
			System.out.println("Wrong choice!!");
			System.out.println("Please select the menu again..");
			citySelect();
		}
	}

	public void bookDoctorAppointment() {
		System.out.println("---Appointment Form---");
		System.out.println("Enter patient name");
		patientName = sc.next().toString();
		pat[counter2] = patientName;
		System.out.println("Enter patient age");
		patientAge = sc.nextInt();
		System.out.println("Enter patient phone number");
		patientMobile = sc.nextLong();

		if (patientName != null && patientMobile != 0) {
			System.out.println("Appointment Done!");
		} else {
			System.out.println("Please enter all the fields and fill up again!!");
			bookDoctorAppointment();
		}
		counter2++;

	}

	public void doctorDetails() {
		System.out.println("1 Dr. Ninawe");
		System.out.println("2 Dr. Wakodikar");
		System.out.println("3 Dr. Lalwani");
		System.out.println("4 Dr. George");
		System.out.println("5 Dr. Bhamra");
		doctorChoice = sc.nextInt();

		switch (doctorChoice) {
		case 1:
			System.out.println();
			System.out.println("------Doctors details:------");
			System.out.println("Dr. Ninawe");
			System.out.println("MBBS, MD (Orthopedic Surgen)");
			if (patientLoginCounter != 0) {
				bookDoctorAppointment();
				welcomeBar();
				welExecution();
			} else {
				System.out.println("Please login first then book appointment");
				welcomeBar();
				welExecution();
			}
			break;

		case 2:
			System.out.println();
			System.out.println("------Doctors details:------");
			System.out.println("Dr. Wakodikar");
			System.out.println("MBBS, MD (Urology Expert)");
			if (patientLoginCounter != 0) {
				bookDoctorAppointment();
				welcomeBar();
				welExecution();
			} else {
				System.out.println("Please login first then book appointment");
				welcomeBar();
				welExecution();
			}
			break;

		case 3:
			System.out.println();
			System.out.println("------Doctors details:------");
			System.out.println("Dr. Lalwani");
			System.out.println("MBBS, MD (Psychitric Ward)");
			if (patientLoginCounter != 0) {
				bookDoctorAppointment();
				welcomeBar();
				welExecution();
			} else {
				System.out.println("Please login first then book appointment");
				welcomeBar();
				welExecution();
			}
			break;

		case 4:
			System.out.println();
			System.out.println("------Doctors details:------");
			System.out.println("Dr. George");
			System.out.println("MBBS, MD (Lungs Specialist)");
			if (patientLoginCounter != 0) {
				bookDoctorAppointment();
				welcomeBar();
				welExecution();
			} else {
				System.out.println("Please login first then book appointment");
				welcomeBar();
				welExecution();
			}
			break;

		case 5:
			System.out.println();
			System.out.println("------Doctors details:------");
			System.out.println("Dr. Bhamra");
			System.out.println("MBBS, MD (Heart Surgen)");
			if (patientLoginCounter != 0) {
				bookDoctorAppointment();
				welcomeBar();
				welExecution();
			} else {
				System.out.println("Please login first then book appointment");
				welcomeBar();
				welExecution();
			}
			break;

		default:
			System.out.println("Wrong choice!!");
			System.out.println("Please select the menu again..");
			doctorDetails();
		}
	}

	public void XList() {
		System.out.println("Press 1 for Patient list");
		System.out.println("Press 2 for User list");
		patList = sc.nextInt();

		switch (patList) {
		case 1:
			System.out.println("--Patients are as follows--");
			System.out.println(Arrays.toString(pat));
			break;

		case 2:
			System.out.println("--Users are as follows--");
			System.out.println(Arrays.toString(user));
			break;

		default:
			System.out.println("Wrong choice!!");
			System.out.println("Please select the menu again..");
			XList();
			break;
		}
	}

	public static void main(String[] args) {
		DoctorAppointmentProject d = new DoctorAppointmentProject();
		d.welcomeBar();
		d.welExecution();
	}

}
