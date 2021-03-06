package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservationVersao2 {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	
	
	public ReservationVersao2() {
	}

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ReservationVersao2(Integer roomNumber, Date checkIn, Date checkOut) {
	
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
	
	public String updateDate(Date checkIn, Date checkOut) {
		
		 Date now =  new Date();
		 if(checkIn.before(now) || checkOut.before(now)) {
			 return "Error in reservation: Reservation dates for update must be future";
		 }  if(!checkOut.after(checkIn)) {
			 return "Error in reservation: check-out date must be after check-in date";
		 }
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
		 
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
