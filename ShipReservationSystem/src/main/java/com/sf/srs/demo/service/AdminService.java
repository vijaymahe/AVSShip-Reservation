package com.sf.srs.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sf.srs.demo.bean.RouteBean;
import com.sf.srs.demo.bean.ScheduleBean;
import com.sf.srs.demo.bean.ShipBean;
import com.sf.srs.demo.dao.AdminDao;
import java.util.List;

@Service
public class AdminService {
	
		@Autowired 
		private AdminDao adao;
		
		
	//Ship	
		
	public String addShip(ShipBean shipBean) {
			return adao.addShip(shipBean);
		}	
		public String updateShip(ShipBean shipBean) {
			return adao.updateShip(shipBean);
		}
		public ShipBean getShipByID(int id)
		{
		return adao.getShipByID(id);	
		}
		
		public List<ShipBean> viewallShips(){
			return adao.viewallShips();
		}
		
		public String deleteship(String shipID) {
			return adao.deleteship(shipID);
		}
		
		//Schedule

		public String addSchedule(ScheduleBean sb)
		{
			return adao.addSchedule(sb);
			
		}
		
		public ScheduleBean viewByScheduleId(String scheduleID) {
			return adao.viewByScheduleId(scheduleID);
		}
		
		public boolean modifySchedule(ScheduleBean scheduleBean) {
			return adao.modifySchedule(scheduleBean);
		}
		
		public String deleteSchedule(int scheduleId)
		{
			return adao.deleteSchedule(scheduleId);
		}
		public List<ScheduleBean> viewallSchedule()
		{
			return adao.viewallSchedule();
		}
		
		
				
		//Route
		
		public RouteBean getRouteById(int id)
		{
		return adao.getRouteById(id);	
		}
		
		public String addRoute(RouteBean rb) {
		return adao.addRoute(rb);
		}
		
		
	    public String updateRoute(RouteBean rb)
	    {
		return adao.updateRoute(rb);
	    }
	
	  public String deleteroute(String routeID) 
	{
		return adao.deleteroute(routeID);
	}
	  
	public List<RouteBean> viewallroutes()
	{
		return adao.viewallroutes();
	}
	
	

}
