package com.sf.srs.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="SRS_TBL_User_Schedule")
public class ScheduleBean {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int scheduleID;



@Column(name="startDate")
@Temporal(TemporalType.TIMESTAMP)
private Date startDate;


//@OneToMany(mappedBy="schedulebean",cascade=CascadeType.ALL ,orphanRemoval=true)
//private List<ReservationBean> reservations=new ArrayList<>();



@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="ShipID",referencedColumnName = "ShipID")
private ShipBean shipbean;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="routeID",referencedColumnName = "routeID")
private RouteBean routebean;


public ScheduleBean() {
	
}


public int getScheduleID() {
	return scheduleID;
}


public void setScheduleID(int scheduleID) {
	this.scheduleID = scheduleID;
}


public Date getStartDate() {
	return startDate;
}


public void setStartDate(Date startDate) {
	this.startDate = startDate;
}


public ShipBean getShipbean() {
	return shipbean;
}


public void setShipbean(ShipBean shipbean) {
	this.shipbean = shipbean;
}


public RouteBean getRoutebean() {
	return routebean;
}


public void setRoutebean(RouteBean routebean) {
	this.routebean = routebean;
}


@Override
public String toString() {
	return "ScheduleBean [scheduleID=" + scheduleID + ", startDate=" + startDate + ", shipbean=" + shipbean
			+ ", routebean=" + routebean + "]";
}





}
