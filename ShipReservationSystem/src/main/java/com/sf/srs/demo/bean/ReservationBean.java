package com.sf.srs.demo.bean;

import java.util.ArrayList;


import java.util.Date;


import jakarta.persistence.*;

@Entity
@Table(name="SRS_TBL_User_Reservation")
public class ReservationBean {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int reservationID;

@Column(name="bookingDate")
@Temporal(TemporalType.TIMESTAMP)
private Date bookingDate ;
@Column(name="journeyDate")
private Date journeyDate ;
@Column(name="NoofSeats")
private int noOfSeats ;
@Column(name="totalFare")
private Double totalFare ;
@Column(name="bookingStatus")
private String bookingStatus ;

//@OneToMany(mappedBy="reservationbean", cascade=CascadeType.ALL, orphanRemoval=true)
//private List<PassengerBean> passenger=new ArrayList<>();

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="UserID",referencedColumnName = "UserID")
private CredentialsBean credentialsbean;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="scheduleID",referencedColumnName = "scheduleID")
private ScheduleBean schedulebean;


public ReservationBean() {
	
}


public int getReservationID() {
	return reservationID;
}


public void setReservationID(int reservationID) {
	this.reservationID = reservationID;
}


public Date getBookingDate() {
	return bookingDate;
}


public void setBookingDate(Date bookingDate) {
	this.bookingDate = bookingDate;
}


public Date getJourneyDate() {
	return journeyDate;
}


public void setJourneyDate(Date journeyDate) {
	this.journeyDate = journeyDate;
}


public int getNoOfSeats() {
	return noOfSeats;
}


public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}


public Double getTotalFare() {
	return totalFare;
}


public void setTotalFare(Double totalFare) {
	this.totalFare = totalFare;
}


public String getBookingStatus() {
	return bookingStatus;
}


public void setBookingStatus(String bookingStatus) {
	this.bookingStatus = bookingStatus;
}


public CredentialsBean getCredentialsbean() {
	return credentialsbean;
}


public void setCredentialsbean(CredentialsBean credentialsbean) {
	this.credentialsbean = credentialsbean;
}


public ScheduleBean getSchedulebean() {
	return schedulebean;
}


public void setSchedulebean(ScheduleBean schedulebean) {
	this.schedulebean = schedulebean;
}


@Override
public String toString() {
	return "ReservationBean [reservationID=" + reservationID + ", bookingDate=" + bookingDate + ", journeyDate="
			+ journeyDate + ", noOfSeats=" + noOfSeats + ", totalFare=" + totalFare + ", bookingStatus=" + bookingStatus
			+ ", credentialsbean=" + credentialsbean + ", schedulebean=" + schedulebean + "]";
}







}




