// import { useEffect, useState } from 'react';
// import axios from 'axios';
// import "./GetSchedule.css";

// function GetSchedule() {
//   const [schedule, setSchedule] = useState([]);
//   // const [startDate, setStartDate] = useState("");
//   // const [shipID, setShipID] = useState("");
//   // const [routeID, setRouteID] = useState("");

//   useEffect(() => {
//     async function fetchData() {
//       const response = await axios.get('http://localhost:8989/admin/viewallSchedule');
//       setSchedule(response.data);
//     }
    
//     fetchData();
//   }, []);

//   return (
//     <div>
//       <h1>Hello Sundaram</h1>
//       <h2 className='title'>View All Schedules</h2>
//       <table className="table table-success table-striped, table table-bordered border-primary">
//         <thead>
//           <tr>
//             <th>Schedule Id</th>
//             <th>Start_Date</th>
//             <th>shipID</th>
//             <th>routeID</th>
//           </tr>
//         </thead>
//         <tbody>
//           {schedule.map((schedule) => (
//             <tr key={schedule.scheduleID}>
//               <td>{schedule.scheduleID}</td>
//               <td>{schedule.startDate}</td>
//               <td>{schedule.shipbean.shipID}</td>
//               <td>{schedule.routebean.routeID}</td>
//             </tr>
//           ))}
//         </tbody>
//       </table>
//       </div>
    
//   )
// }

// export default GetSchedule;





