import 'bootstrap/dist/css/bootstrap.min.css';
import axios from 'axios';
import React, { useState } from 'react'
import "./DeleteRoute.css";



function DeleteRoute() {
    const [routeID,setRouteID]=useState();
    const handleSubmit=(e)=>{
        e.preventDefault();
              axios.delete(`http://localhost:8989/admin/deleteroute/`+routeID).then(res=>alert("Data is Deleted"))
      
    }
  return (
    <div >
      <div className='f'>
        
      <h1> Delete Route</h1>
      <div className='route'>
      <form onSubmit={handleSubmit} >
        Enter Route  ID to Delete  : <input type="text" value={routeID} onChange={(e)=>{setRouteID(e.target.value)}}/><br/>
        <button>Delete Route</button>
      </form>
      </div>
      </div>
    
      </div>
      
  )
}

export default DeleteRoute;
