package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


import model.entities.ReservationVersao2;

public class ProgramVersao2 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ReservationVersao2 reservation = new ReservationVersao2();
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date(dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date(dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn))
		{
			System.out.println("Error in reservation: check-out date must be after check-in date");
		} else {
			reservation = new ReservationVersao2(number,checkIn,checkOut);
			System.out.println(reservation);
		}
		
		System.out.println();
		System.out.println("Enter data to update the reservation: ");
		System.out.print("Check-in date(dd/MM/yyyy): ");
		 checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date(dd/MM/yyyy): ");
		 checkOut = sdf.parse(sc.next());
		 
	
		 
		 String erro = reservation.updateDate(checkIn,checkOut);
		 if(erro != null)
		 {
			 System.out.println("Erro in reservation: "+ erro);
		 } else {
			 System.out.println("reservation: " + reservation);
		 }
		 
		 
		 
		sc.close();

	}

}
