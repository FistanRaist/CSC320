// Jeremy Carney, 01/19/2025, CSC320, CT1

import java.util.Scanner;
	
public class Address {
	public static void main(String args[]) {
		String firstName;
        String lastName;
        String streetAddress;
        String city;
        String zipCode;
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		firstName = scnr.nextLine();
		System.out.print("Enter Last Name: ");
		lastName = scnr.nextLine();
		System.out.print("Enter Street Address: ");
        streetAddress = scnr.nextLine();
		System.out.print("Enter City: ");
        city = scnr.nextLine();
		System.out.print("Enter Zipcode: ");
        zipCode = scnr.nextLine();
		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Street Address: " + streetAddress);
		System.out.println("City: " + city);
		System.out.println("Zipcode: " + zipCode);
	}
}