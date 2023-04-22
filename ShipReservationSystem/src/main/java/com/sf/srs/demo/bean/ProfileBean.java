package com.sf.srs.demo.bean;

import java.util.Date;


import jakarta.persistence.*;

@Entity
@Table(name="SRS_TBL_User_Profile")
public class ProfileBean {
	
	
@Id
@Column(name="firstName")
private String  firstName ;
@Column(name="lastName")
private String lastName;
@Column(name="dateofBirth")
@Temporal(TemporalType.TIMESTAMP)
private Date dateOfBirth;
@Column(name="gender")
private String gender;
@Column(name="strret")
private String street;
@Column(name="location")
private String location;
@Column(name="city")
private String city;
@Column(name="state")
private String state;
@Column(name="pincode")
private String pincode;
@Column(name="mobileNo")
private String mobileNo;
@Column(name="emailID")
private String emailID;
@Column(name="password")
private String password;

@ManyToOne( cascade = CascadeType.ALL)
@JoinColumn(name="Userid",referencedColumnName = "Userid")
private CredentialsBean credentialsbean;

public ProfileBean() {
	
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Date getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}

public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

public String getEmailID() {
	return emailID;
}

public void setEmailID(String emailID) {
	this.emailID = emailID;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public CredentialsBean getCredentialsbean() {
	return credentialsbean;
}

public void setCredentialsbean(CredentialsBean credentialsbean) {
	this.credentialsbean = credentialsbean;
}

@Override
public String toString() {
	return "ProfileBean [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
			+ ", gender=" + gender + ", street=" + street + ", location=" + location + ", city=" + city + ", state="
			+ state + ", pincode=" + pincode + ", mobileNo=" + mobileNo + ", emailID=" + emailID + ", password="
			+ password + ", credentialsbean=" + credentialsbean + "]";
}


}






