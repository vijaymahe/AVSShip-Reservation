
import 'bootstrap/dist/css/bootstrap.min.css';
import axios from 'axios';
import React, { useState } from 'react'
import "./Deleteship.css";



function Deleteship() {
    const [shipID,setShipID]=useState();
    const handleSubmit=(e)=>{
        e.preventDefault();
              axios.delete(`http://localhost:8989/admin/deleteship/`+shipID).then(res=>alert("Data is Deleted"))
      
    }
  return (
    <div >
      <div className='f'>
        
      <h1> Delete Ship</h1>
      <div className='d'>
      <form onSubmit={handleSubmit} >
        Enter Ship ID to Delete  : <input type="text" value={shipID} onChange={(e)=>{setShipID(e.target.value)}}/><br/>
        <button>Delete Ship</button>
      </form>
      </div>
      </div>
    
      </div>
      
  )
}

export default Deleteship;
