import React, { useState } from 'react';
import axios from 'axios';
import "./UpdateRoute.css";

function UpdateRoute() {
  const [route, setRoute] = useState({routeID:"",  source : '', destination: '', travelDuration: '',fare:'' });
  
  const [message, setMessage] = useState('');

  function handleChange(event) {
    const { name, value } = event.target;
    setRoute(prevRoute => ({ ...prevRoute, [name]: value }));
  }

  

  async function handleSubmit(event) {
    event.preventDefault();
    console.log(JSON.stringify(route))
    try {
      const response = await axios.put("http://localhost:8989/admin/updateRoute", route).then(alert("shipRoute is updated"));
      setMessage(response.data.message);
    } catch (error) {
      setMessage('Failed to update shipRoute.');
    }
  }

  return (
    // <div>
    //   <h2 className="text-center">Update Ship by ID</h2>

      // {message && <p className="text-danger">{message}</p>}
      <div className="container">
  <h2 className="text-center">Update Ship by ID</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="routeID">routeID:</label>
          <input
            type="text"
            className="form-control"
            id="routeID"
            name="routeID"
            value={route.routeID}
            onChange={handleChange}
          />
        </div>   
        <div className="form-group">
          <label htmlFor="source">source:</label>
          <input
            type="text"
            className="form-control"
            id="source"
            name="source"
            value={route.source}
            onChange={handleChange}
          />
        </div>
        <div className="form-group">
          <label htmlFor="destination">destination:</label>
          <input
            type="text"
            className="form-control"
            id="destination"
            name="destination"
            value={route.destination}
            onChange={handleChange}
          />
        </div>
        <div className="form-group">
          <label htmlFor="travelDuration">travelDuration:</label>
          <input
            type="text"
            className="form-control"
            id="travelDuration"
            name="travelDuration"
            value={route.travelDuration}
            onChange={handleChange}
          />
        </div>

       
        <div className="form-group">
          <label htmlFor="fare">fare:</label>
          <input
            type="number"
            className="form-control"
            id="fare"
            name="fare"
            value={route.fare}
            onChange={handleChange}
          />
        </div>         
        
        <button type="submit" className="btn btn-primary">Submit</button>
      </form>
    </div>
  );
}

export default UpdateRoute;
