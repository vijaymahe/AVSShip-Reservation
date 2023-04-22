package com.sf.srs.demo.bean;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.*;

@Entity
@Table(name="SRS_TBL_User_Ship")
public class ShipBean {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int shipID;

@Column(name="shipName")
private String shipName;
@Column(name="seatingCapacity")
private int seatingCapacity;
@Column(name="reservationCapacity")
private int reservationCapacity;

//@OneToMany(mappedBy="shipbean", cascade=CascadeType.ALL, orphanRemoval=true)
//private List<ScheduleBean> schedule=new ArrayList<>();

public ShipBean() {
	
}

public int getShipID() {
	return shipID;
}

public void setShipID(int shipID) {
	this.shipID = shipID;
}

public String getShipName() {
	return shipName;
}

public void setShipName(String shipName) {
	this.shipName = shipName;
}

public int getSeatingCapacity() {
	return seatingCapacity;
}

public void setSeatingCapacity(int seatingCapacity) {
	this.seatingCapacity = seatingCapacity;
}

public int getReservationCapacity() {
	return reservationCapacity;
}

public void setReservationCapacity(int reservationCapacity) {
	this.reservationCapacity = reservationCapacity;
}

@Override
public String toString() {
	return "ShipBean [shipID=" + shipID + ", shipName=" + shipName + ", seatingCapacity=" + seatingCapacity
			+ ", reservationCapacity=" + reservationCapacity + "]";
}






}
