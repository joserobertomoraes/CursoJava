package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exception.DomainException;

public class ReservationVersao3 {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	
	
	public ReservationVersao3() {
	}

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ReservationVersao3(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException{
	  if(!checkOut.after(checkIn)) {
		throw new DomainException("Error in reservation: check-out date must be after check-in date");
	 }
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}



	public Integer getRoomNumber() {
		return roomNumber;
	}



	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}



	public Date getCheckIn() {
		return checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}



	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
		
	}
	
	public void updateDate(Date checkIn, Date checkOut) throws DomainException {
		
		 Date now =  new Date();
		 if(checkIn.before(now) || checkOut.before(now)) {
			 throw new DomainException("Error in reservation: Reservation dates for update must be future") ;
		 }  if(!checkOut.after(checkIn)) {
			throw new DomainException("Error in reservation: check-out date must be after check-in date");
		 }
		this.checkIn = checkIn;
		this.checkOut = checkOut;

		 
	}
	
	@Override
	public String toString() {
		return "ROOM: " 
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+", Check-Out: "
				+ sdf.format(checkOut)
				+", "
				+duration()
				+ " nights";
	}

}
