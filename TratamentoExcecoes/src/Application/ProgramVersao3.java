package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.ReservationVersao3;
import model.exception.DomainException;

public class ProgramVersao3 {
public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	ReservationVersao3 reservation = new ReservationVersao3();
	
	try {
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date(dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date(dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		
		reservation = new ReservationVersao3(number,checkIn,checkOut);
		System.out.println(reservation);
	
	
		System.out.println();
		System.out.println("Enter data to update the reservation: ");
		System.out.print("Check-in date(dd/MM/yyyy): ");
		checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date(dd/MM/yyyy): ");
		checkOut = sdf.parse(sc.next());
	 
	
		 
		reservation.updateDate(checkIn,checkOut);
		System.out.println("reservation: " + reservation);
	 
	} 
	catch(ParseException e) {
		System.out.println("Invalid date format");
	}
	catch(DomainException e) {
	System.out.println("Error in reseration: " + e.getMessage() );
	
	} 
	sc.close();
}
}
