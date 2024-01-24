import React from 'react'


import { BrowserRouter, Routes, Route } from "react-router-dom";
import { Navbar } from 'react-bootstrap';
import Login from './component/Login';
import Forms from './component/Forms';
// import Login from './component/Login';

const App = () => {
  return (
    <div>
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Login/>}></Route> 
        <Route path="/login" element={<Login/>}></Route>
        <Route path="/reg" element={<Forms/>}></Route>
      </Routes>
    </BrowserRouter>
    </div>

  )
}

export default App