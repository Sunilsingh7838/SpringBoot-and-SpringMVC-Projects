
import './App.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import Navbar from './Components/Navbar';
import AboutUs from './Components/AboutUs';
import Contact from './Components/Contact';
import Home from './Components/Home';
import "react-responsive-carousel/lib/styles/carousel.min.css";
// import { Carousel } from 'react-responsive-carousel';
import {
  BrowserRouter as BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import QuickLink from './Components/QuickLink';


 function App() {
  return (
    <>
    <BrowserRouter>
    <Navbar/>
     <div className="App">
     <Routes>
            <Route  path="/Home" element= {<Home />}></Route>
            <Route excet path="/AboutUs" element= {<AboutUs />}></Route>
            <Route excet path="/Contact" element= {<Contact />}></Route>
      </Routes>
     </div>
     <QuickLink/>
     </BrowserRouter>
    </>
  );
}

export default App;
