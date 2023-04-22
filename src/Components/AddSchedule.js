import {  useState } from 'react';
import axios from 'axios';
import "./AddSchedule.css";

function AddSchedule() {
  // const [schedule, setSchedule] = useState([]);
  const [startDate, setStartDate] = useState("");
  const [shipID, setShipID] = useState("");
  const [routeID, setRouteID] = useState("");

  // useEffect(() => {
  //   async function fetchData() {
  //     const response = await axios.get('http://localhost:8989/admin/viewallSchedule');
  //     setSchedule(response.data);
  //   }
  //   fetchData();
  // }, []);

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('http://localhost:8989/admin/addSchedule', {
        startDate: startDate,
        shipID: shipID,
        routeID: routeID,
      });
      console.log(response.data);
      alert("Schedule added successfully!");
      setStartDate("");
      setShipID("");
      setRouteID("");
    } catch (error) {
      console.error(error);
      alert("Failed to add schedule");
    }
  };

  return (
    <div>
      {/* <h1>Hello Sundaram</h1>
      <h2 className='title'>View All Schedules</h2>
      <table className="table table-success table-striped, table table-bordered border-primary">
        <thead>
          <tr>
            <th>Schedule Id</th>
            <th>Start_Date</th>
            <th>shipID</th>
            <th>routeID</th>
          </tr>
        </thead>
        <tbody>
          {schedule.map((schedule) => (
            <tr key={schedule.scheduleID}>
              <td>{schedule.scheduleID}</td>
              <td>{schedule.startDate}</td>
              <td>{schedule.shipbean.shipID}</td>
              <td>{schedule.routebean.routeID}</td>
            </tr>
          ))}
        </tbody>
      </table> */}
      <h2 className='title'>Add Schedule</h2>
      <form onSubmit={handleSubmit}>
        <div className='form-group'>
          <label htmlFor='startDate'>Start Date:</label>
          <input type='date' className='form-control' id='startDate' value={startDate} onChange={(e) => setStartDate(e.target.value)} />
        </div>
        <div className='form-group'>
          <label htmlFor='shipID'>Ship ID:</label>
          <input type='text' className='form-control' id='shipID' value={shipID} onChange={(e) => setShipID(e.target.value)} />
        </div>
        <div className='form-group'>
          <label htmlFor='routeID'>Route ID:</label>
          <input type='text' className='form-control' id='routeID' value={routeID} onChange={(e) => setRouteID(e.target.value)} />
        </div>
        <button type='submit' className='btn btn-primary'>Submit</button>
      </form>
    </div>
  );
}

export default AddSchedule;
