import React from 'react';
import Header from './Components/Header';
import Footer from './Components/Footer';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Home from './Pages/Home';
import Directory from './Pages/Directory'
import About from './Pages/About';
import Error from './Pages/Error';


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
        <Route path="*" element={<Error />}/>
      </Routes>
      </div>

      <Footer />

      </Router>
    </div>
  );
}

export default App;
