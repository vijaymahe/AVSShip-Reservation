import React, { useState, useEffect } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import axios from 'axios';
import "./GetShip.css";

function GetShip() {
  const [ships, setShips] = useState([]);

  useEffect(() => {
    async function fetchData() {
      const response = await axios.get('http://localhost:8989/admin/viewallShips');
      setShips(response.data);
    }
    fetchData();
  }, []);

  return (
    <div>
      <h2 className="text-center">Ship LIST</h2>
      <div className="row">
        <table className="table table-striped table-bordered">
          <thead>
            <tr>
              <th>Ship ID</th>
              <th>Ship Name</th>
              <th>Seating Capacity</th>
              <th>Reservation Capacity</th>
            </tr>
          </thead>
          <tbody>
            {ships.map(ship => (
              <tr key={ship.shipID}>
                <td>{ship.shipID}</td>
                <td>{ship.shipName}</td>
                <td>{ship.seatingCapacity}</td>
                <td>{ship.reservationCapacity}</td>
                
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default GetShip;

