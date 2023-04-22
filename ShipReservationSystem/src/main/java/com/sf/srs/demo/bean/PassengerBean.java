package com.sf.srs.demo.bean;

import jakarta.persistence.*;

@Entity
@Table(name="SRS_TBL_User_Passenger")
public class PassengerBean {

@Column(name="name")
private String name;
@Column(name="age")
@Id
private int age ;
@Column(name="gender")
private String gender;


@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="reservationID",referencedColumnName="reservationID")
private ReservationBean reservationbean ;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="scheduleID",referencedColumnName = "scheduleID")
private ScheduleBean schedulebean ;


public PassengerBean() {
	
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public ReservationBean getReservationbean() {
	return reservationbean;
}


public void setReservationbean(ReservationBean reservationbean) {
	this.reservationbean = reservationbean;
}


public ScheduleBean getSchedulebean() {
	return schedulebean;
}


public void setSchedulebean(ScheduleBean schedulebean) {
	this.schedulebean = schedulebean;
}


@Override
public String toString() {
	return "PassengerBean [name=" + name + ", age=" + age + ", gender=" + gender + ", reservationbean="
			+ reservationbean + ", schedulebean=" + schedulebean + "]";
}

}






