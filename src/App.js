import React from 'react';
import Header from './Components/Header';
import Footer from './Components/Footer';
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Home from './Pages/Home';
import Directory from './Pages/Directory'
import About from './Pages/About';


function App() {
  return (
    <div>


     <Router>

     <Header /> 

     <div className="p-3">
      <Routes>
        <Route exact path="/" element={<Home />} />
        <Route path="/directory" element={<Directory />} />
        <Route path="/about" element={<About />} />
      </Routes>
      </div>

      <Footer />

      </Router>
    </div>
  );
}

export default App;
