import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import './Login.css';

function Login() {
  const[userID,setUserID]=useState("");
  const[password,setPassword]=useState("");
  const[role,setRole]=useState("");
  const nav=useNavigate();

  

  const handleSubmit=(e)=>{
    e.preventDefault(e.target.value);

    if(userID=="AD-001" && password=="AD-001"){
      nav("/ship");
    }
    else if(userID=="AD-002" && password=="AD-002"){
      nav("/viewship")
    }
    else if(userID=="AD-003" && password=="AD-003"){
      nav("/deleteship")
    }
    else if(userID=="AD-004"&& password=="AD-004"){
      nav("/updateship")
    }
    else if(userID=="AD-005" && password=="AD-005"){
      nav("/viewRoute")
    }
    else if(userID=="AD-006" && password=="AD-006"){
      nav("/addRoute")
    }
    else if(userID=="AD-007" && password=="AD-007"){
      nav("/deleteRoute")
    }
    else if(userID=="AD-008" && password=="AD-008"){
      nav("/updateroute")
    }
    else if(userID=="AD-009" && password=="AD-009"){
      nav("/viewSchedule")
    }
    else if(userID=="AD-010" && password=="AD-010"){
      nav("/addSchedule")
    }
    else{
      alert("FAIL")
    }
  }
  return (
    // <div>
    //   <form>
    //     <h1>AVS Ship Reservation</h1>
    //   <input type='text' placeholder='User Name' value={name} onChange={(e)=>setName(e.target.value)}/>
    //   <input type='text' placeholder='Password' value={pass} onChange={(e)=>setPass(e.target.value)}/>
    //   <button onClick={handleSubmit} >Submit</button>
    //   </form>
    // </div>
    <div>
      <form  className='form-cont' onSubmit={handleSubmit}>
        <h1>AVS Ship Reservation</h1>
          Select Your Role  :{" "}  <select className='select-option' value={role} onChange={(e) => { setRole(e.target.value) }}>
            <option value="Admin">Admin</option>
            <option value="user">User</option>
          </select><br/><br/>
            Enter UserID :{" "} <input type='text' value={userID} onChange={(e)=>{setUserID(e.target.value)}}/><br/>
            Enter Password :{" "} <input type='text' value={password} onChange={(e)=>{setPassword(e.target.value)}}/>
            <button className='bt1'>Login</button><br/>
        </form>
      </div>
  )
}

export default Login
