package com.sf.srs.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sf.srs.demo.bean.RouteBean;
import com.sf.srs.demo.bean.ScheduleBean;
import com.sf.srs.demo.bean.ShipBean;

@Repository
public class AdminDao {
@Autowired	

private SessionFactory sessionFactory;
private Session session;
private Transaction transaction;
private Query q;
	
	
	public String addShip(ShipBean shipBean) 
	{
		if(shipBean!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(shipBean);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(shipBean==null)
		{
			return "ERROR";
		}
		else
		{
			return "FAIL";
		}
	}	
	
	public String updateShip(ShipBean shipBean)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(shipBean!=null)
		{
		session.update(shipBean);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(shipBean==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
	
	public ShipBean getShipByID(int id)
	{
		session=sessionFactory.openSession();
	Query<ShipBean> q=session.createQuery("from ShipBean where shipID=:sid");
	q.setParameter("sid",id);
	System.out.println(q.getResultList());
		List<ShipBean> all=q.getResultList();
		ShipBean rb=null;
		for(ShipBean rb1:all)
		{
			rb=rb1;
		}
	return rb;
	}
	
	public String deleteship(String shipID)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(shipID != null)
		{
		Query q1=session.createQuery("delete from ShipBean where shipID=:sid");
		q1.setParameter("sid", shipID);
		q1.executeUpdate();
transaction.commit();
session.close();
		return "SUCCESS";
		}
		else
		{
			return "FAIL";
		}
	}
	
	public List<ShipBean> viewallShips(){
		session=session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		 q=session.createQuery("from ShipBean");
		return (ArrayList<ShipBean>) q.list();
		
	}
	
public String addSchedule(ScheduleBean sb)
	{
		if(sb!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(sb);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(sb==null)
		{
			return "ERROR";
	}
		else
		{
			return "FAIL";
		}
	}

public ScheduleBean viewByScheduleId(String scheduleID) {
	ScheduleBean scheduleBean=null;
	session=sessionFactory.openSession();
	transaction=session.beginTransaction();
	Query q=session.createQuery("from ScheduleBean where scheduleID=:schid");
	q.setParameter("schid", scheduleID);

	scheduleBean=(ScheduleBean)q.uniqueResult();
	transaction.commit();
	session.close();
	return scheduleBean;
}
public boolean modifySchedule(ScheduleBean scheduleBean) {
    boolean isSuccess = true;
    try {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(scheduleBean);
        transaction.commit();
        session.close();
    } catch (Exception e) {
        isSuccess = false;
        e.printStackTrace();
    }
    return isSuccess;
}

public String deleteSchedule(int scheduleID){
	session=sessionFactory.openSession();
	transaction=session.beginTransaction();
	Query q=session.createQuery("delete from ScheduleBean where scheduleID=:schid");
	q.setParameter("schid",scheduleID);
	q.executeUpdate();
    transaction.commit();
    return "SUCCESS";
}

public List<ScheduleBean> viewallSchedule(){
	session=session=sessionFactory.openSession();
	transaction=session.beginTransaction();
	 q=session.createQuery("from ScheduleBean");
	return (ArrayList<ScheduleBean>) q.list();
	
}

public RouteBean getRouteById(int id)
	{
		session=sessionFactory.openSession();
	Query<RouteBean> q=session.createQuery("from RouteBean where routeID=:rid");
	q.setParameter("rid",id);
	System.out.println(q.getResultList());
		List<RouteBean> all=q.getResultList();
		RouteBean rb=null;
		for(RouteBean rb1:all)
		{
			rb=rb1;
		}
	return rb;
	}
	
	public String addRoute(RouteBean routebean) 
	{
		if(routebean!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(routebean);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(routebean==null)
		{
			return "ERROR";
		}
		else
		{
			return "FAIL";
		}
	}
	
	public String updateRoute(RouteBean routebean)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(routebean!=null)
		{
		session.update(routebean);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(routebean==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
	
	public String deleteroute(String routeID)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(routeID != null)
		{
		Query q1=session.createQuery("delete from RouteBean where routeID=:rid");
		q1.setParameter("rid", routeID);
		q1.executeUpdate();
transaction.commit();
session.close();
		return "SUCCESS";
		}
		else
		{
			return "FAIL";
		}
	}
	
	public List<RouteBean> viewallroutes(){
		session=session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		 q=session.createQuery("from RouteBean");
		return (ArrayList<RouteBean>) q.list();
		
	}
	
	
	
	
	
	
	

}
