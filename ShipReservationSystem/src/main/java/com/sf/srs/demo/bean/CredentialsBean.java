package com.sf.srs.demo.bean;

import java.util.ArrayList;

import java.util.List;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="SRS_TBL_User_Credentials")


public class CredentialsBean{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Userid;
    
    @Column(name="password")
    private String password;
    
    @Column(name="user_type")
    private String userType;
    
    @Column(name="login_status")
    private String loginStatus;
    
//    @OneToMany(mappedBy="credentialsbean", cascade=CascadeType.ALL, orphanRemoval=true)
//    private List<ProfileBean> profiles = new ArrayList<>();
//    
//    @OneToMany(mappedBy = "credentialsbean", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<ReservationBean> reservations = new ArrayList<>();

    public CredentialsBean() {
    }

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	@Override
	public String toString() {
		return "CredentialsBean [Userid=" + Userid + ", password=" + password + ", userType=" + userType
				+ ", loginStatus=" + loginStatus + "]";
	}
	

    
}






    