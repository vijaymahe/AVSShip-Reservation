package com.sf.srs.demo.bean;

import java.util.ArrayList;

import jakarta.persistence.*;

@Entity
@Table(name="SRS_TBL_User_Route")
public class RouteBean {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int routeID ;

@Column(name="source")
private String source ;
@Column(name="destination")
private String destination ;
@Column(name="travelDuration")
private String travelDuration ;
@Column(name="fare")
private Double fare ;

//@OneToMany(mappedBy="routebean",cascade=CascadeType.ALL ,orphanRemoval=true)
//private List<ScheduleBean> schedule=new ArrayList<>();

public RouteBean() {
	
}

public int getRouteID() {
	return routeID;
}

public void setRouteID(int routeID) {
	this.routeID = routeID;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public String getTravelDuration() {
	return travelDuration;
}

public void setTravelDuration(String travelDuration) {
	this.travelDuration = travelDuration;
}

public Double getFare() {
	return fare;
}

public void setFare(Double fare) {
	this.fare = fare;
}

@Override
public String toString() {
	return "RouteBean [routeID=" + routeID + ", source=" + source + ", destination=" + destination + ", travelDuration="
			+ travelDuration + ", fare=" + fare + "]";
}






}
