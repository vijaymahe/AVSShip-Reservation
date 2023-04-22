package com.sf.srs.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sf.srs.demo.bean.RouteBean;
import com.sf.srs.demo.bean.ScheduleBean;
import com.sf.srs.demo.bean.ShipBean;
import com.sf.srs.demo.service.AdminService;



@RestController 
@CrossOrigin (origins="http://localhost:3000")
@RequestMapping ("/admin")
public class AdminController {
@Autowired
private AdminService adminservice ;

//Ship		
@PostMapping("/addShip")
public String meth1(@RequestBody ShipBean sb)
{
	adminservice.addShip(sb);
	return "<h1>Ship Added Successfully</h1>";
}	
@GetMapping("/getShip/{id}")
public ShipBean meth2(@PathVariable("id") int id)
{
	return adminservice.getShipByID(id);
	
	
}
@PutMapping("/updateShip")
public String meth3(@RequestBody ShipBean sb)
{
	adminservice.updateShip(sb);
	return "<h1>Ship updated Successfully</h1>";
}

@GetMapping("viewallShips")
public List<ShipBean> viewallShips(){
	return adminservice.viewallShips();
}

@DeleteMapping("/deleteship/{id}")
public String meth4(@PathVariable(value="id") String shipID)
{
	adminservice.deleteship(shipID);
	return "<h1>Ship is Deleted!</h1>";
 
}
//Schedule
@GetMapping("/viewByScheduleId/{Id}")
public ScheduleBean viewByScheduleId(@PathVariable (value="Id")String scheduleID) {
	return adminservice.viewByScheduleId(scheduleID);
}


@PostMapping("/addSchedule")
public String meth5(@RequestBody ScheduleBean sb)
{
adminservice.addSchedule(sb);
return "<h1>Schedule Added successfully</h1>";
}

@PutMapping("/updateSchedule")
public boolean modifySchedule(@RequestBody ScheduleBean scheduleBean) {
	return adminservice.modifySchedule(scheduleBean);
}

@DeleteMapping("/deleteSchedule/{Id}")
public String deleteSchedule(@PathVariable (value="Id")int scheduleId)
{
	return adminservice.deleteSchedule(scheduleId);

}
@GetMapping("viewallSchedule")
public List<ScheduleBean> viewallSchedul(){
	return adminservice.viewallSchedule();
}



//Route
@GetMapping("/getRoute/{id}")
public RouteBean meth7(@PathVariable("id") int id)
{
	return adminservice.getRouteById(id);
	
	
}

@PostMapping("addRoute")
public String meth8(@RequestBody RouteBean rb) {
	adminservice.addRoute(rb);
return "<h1>  Route had been added Successfully</h1>";
}

@PutMapping("updateRoute")
public String meth9(@RequestBody RouteBean rb)
{
	adminservice.updateRoute(rb);
	return "<h1>Ship updated Successfully</h1>";
}

@DeleteMapping("deleteroute/{id}")
public String meth10(@PathVariable(value="id") String routeID)
{
	adminservice.deleteroute(routeID);
	return "<h1>Route is Deleted!</h1>";
 
}

@GetMapping("viewallroutes")
public List<RouteBean> viewallroutes(){
	return adminservice.viewallroutes();
}
}

