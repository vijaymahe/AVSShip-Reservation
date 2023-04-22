import logo from './logo.svg';
import './App.css';
import AddShip from './Components/AddShip';
import GetShip from './Components/GetShip';
import UpdateShip from './Components/UpdateShip';
import DeleteShip from './Components/DeleteShip';
import GetRoute from './Components/GetRoute';
import AddRoute from './Components/AddRoute';
import UpdateRoute from './Components/UpdateRoute';
import DeleteRoute from './Components/DeleteRoute';
import Login from './Components/Login';
import GetSchedule from './Components/GetSchedule';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import AddSchedule from './Components/AddSchedule';

function App() {
  return (
    <div>

      <BrowserRouter>
      <Routes>
     <Route path='/' element= {<Login/>}/>
    <Route path='/viewship' element = {<GetShip/>}/> 
     <Route path = "/ship" element={<AddShip/>}/>
     <Route path = "/deleteship" element={<DeleteShip/>}/>
     <Route path="/updateship" element={<UpdateShip/>}/>
     <Route path='/viewRoute' element = {<GetRoute/>}/> 
     <Route path='/addRoute' element = {<AddRoute/>}/> 
     <Route path='/updateroute' element = {<UpdateRoute/>}/>
     <Route path='/deleteRoute' element = {<DeleteRoute/>}/> 
     <Route path='/viewSchedule' element = {<GetSchedule/>}/>  
     {/* <Route path='/deleteSchedule' element = {<DeleteSchedule/>}/> */}
     <Route path='/addSchedule' element = {<AddSchedule/>}/>
    </Routes>
    </BrowserRouter>
     
      </div>
  );
}

export default App;
