 package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.ReservationVersao1;

public class ProgramVersao1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			ReservationVersao1 reservation = new ReservationVersao1();
			
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
				reservation = new ReservationVersao1(number,checkIn,checkOut);
				System.out.println(reservation);
			}
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date(dd/MM/yyyy): ");
			 checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date(dd/MM/yyyy): ");
			 checkOut = sdf.parse(sc.next());
			 
			 Date now =  new Date();
			 
			 if(checkIn.before(now) || checkOut.before(now)) {
				 System.out.println("Error in reservation: Reservation dates for update must be future");
			 } else if(!checkOut.after(checkIn)) {
				 System.out.println("Error in reservation: check-out date must be after check-in date");
			 } else {
			 
			 reservation.updateDate(checkIn,checkOut);
			 System.out.println("reserva depois da atualização: ");
			 System.out.println(reservation);
			 }
			 
			 
			sc.close();
	}	

}
