import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import axios from 'axios';
import "./AddShip.css"


function AddShip() {
  const [ship, setShip] = useState({ shipName: '', seatingCapacity: '', reservationCapacity: '' });
  const [message, setMessage] = useState('');

  function handleChange(event) {
    const { name, value } = event.target;
    setShip(prevShip => ({ ...prevShip, [name]: value }));
  }

  async function handleSubmit(event) {
    event.preventDefault();
    try {
      const response = await axios.post("http://localhost:8989/admin/addShip", ship).then(alert(
        'ship is added'
      ));
      setMessage(response.data.message);
    } catch (error) {
      setMessage('Failed to post ship.');
    }
  }

  return (
    <div>
      <h2 className="text-center">Add New Ship</h2>
      {message && <p className="text-danger">{message}</p>}
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="shipName">Ship Name:</label>
          <input
            type="text"
            className="form-control"
            id="shipName"
            name="shipName"
            value={ship.shipName}
            onChange={handleChange}
          />
        </div>
        <div className="form-group">
          <label htmlFor="seatingCapacity">Seating Capacity:</label>
          <input
            type="number"
            className="form-control"
            id="seatingCapacity"
            name="seatingCapacity"
            value={ship.seatingCapacity}
            onChange={handleChange}
          />
        </div>
        <div className="form-group">
          <label htmlFor="reservationCapacity">Reservation Capacity:</label>
          <input
            type="number"
            className="form-control"
            id="reservationCapacity"
            name="reservationCapacity"
            value={ship.reservationCapacity}
            onChange={handleChange}
          />
        </div>
        <button type="submit" className="btn btn-primary">Submit</button>
      </form>
    </div>
  );
}

export default AddShip;
