import './App.css';
import { Route, Routes } from 'react-router-dom'
import Navbar from './components/Navbar';
import Home from './pages/Home';
import Add from './pages/Add';
import Maintain from './pages/Maintain';
import Cart from './pages/Cart';

function App() {
  return (
    <div className="App">
      <Navbar />
      <Routes>
        <Route path="" element={ <Home /> } />
        <Route path="lisa" element={ <Add /> } />
        <Route path="halda" element={ <Maintain /> } />
        <Route path="ostukorv" element={ <Cart /> } />
      </Routes>
    </div>
  );
}

export default App;
