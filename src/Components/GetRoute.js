import React, { useState, useEffect } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import axios from 'axios';
import "./GetRoute.css";

function GetRoute() {
  const [Routes, setroutes] = useState([]);

  useEffect(() => {
    async function fetchData() {
      const response = await axios.get('http://localhost:8989/admin/viewallroutes');
      setroutes(response.data);
    }
    fetchData();
  }, []);

  return (
    <div>
      <h2 className="text-center">ship Routes LIST</h2>
      <div className="row">
        <table className="table table-striped table-bordered">
          <thead>
            <tr>
              <th>routeID</th>
              <th>source</th>
              <th>destination</th>
              <th>travelDuration</th>
              <th>fare</th>
            </tr>
          </thead>
          <tbody>
            {Routes.map(r => (
              <tr key={r.routeID}>
                <td>{r.routeID}</td>
                <td>{r.source}</td>
                <td>{r.destination}</td>
                <td>{r.travelDuration}</td>
                <td>{r.fare}</td>
                
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default GetRoute;

