import { useState } from 'react'
import './App.css'
import ListEmployeeComponents from './components/ListEmployeeComponents'
import HeaderComponents from './components/HeaderComponents'
import FooterComponents from './components/FooterComponents'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import EmployeeComponents from './components/EmployeeComponents'
function App() {
  return (
    <>
      <BrowserRouter>
        <HeaderComponents />
        <Routes>
          <Route path='/' element={<ListEmployeeComponents />}></Route>
          <Route path='/employees' element={<ListEmployeeComponents />}></Route>
          <Route path='/add-employee' element={<EmployeeComponents />}></Route>
          <Route path='/edit-employee/:empId' element={<EmployeeComponents />}></Route>
        </Routes>
        <FooterComponents />
      </BrowserRouter>
    </>
  )
}

export default App
