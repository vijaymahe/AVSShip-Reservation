import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import axios from 'axios';
import "./AddRoute.css";


function AddRoute() {
  const [route, setRoute] = useState({source : '', destination: '', travelDuration: '',fare:'' });
  const [message, setMessage] = useState('');

  function handleChange(event) {
    const { name, value } = event.target;
    setRoute(prevRoute=> ({ ...prevRoute, [name]: value }));
  }

  async function handleSubmit(event) {
    event.preventDefault();
    try {
      const response = await axios.post("http://localhost:8989/admin/addRoute", route).then(alert(
        'shipRoute is added'
      ));
      setMessage(response.data.message);
    } catch (error) {
      setMessage('Failed to post shipRoute.');
    }
  }

  return (
    <div>
      <h2 className="text-center">Add ShipRoute</h2>
      {message && <p className="text-danger">{message}</p>}
      <form onSubmit={handleSubmit}>
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

export default AddRoute;
