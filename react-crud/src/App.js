import Header from './Components/Header/Header'; 
import './App.css';
import { Routes, Route } from "react-router-dom";
import Orders from './Components/Orders/Order';
import Order from './Components/Orders/OrderOnTheWay';
import OrderAll from './Components/Orders/AllOrders';
import Deliverers from "./Components/Deliverers/Deliverer";
import SuitDeliverer from "./Components//Deliverers/SuitDeliverer";


function App() {
  return (
    <div className="App">
      <Header/>
    <Routes>
      <Route path='/' element = {<Orders/>}/>
      <Route path='/onTheWay' element = {<Order/>}/>
      <Route path='/deliverers' element ={<Deliverers/>}/>
      <Route path='/allOrders' element ={<OrderAll/>}/>
      <Route path='/suit/:add/:qua/:id' element={<SuitDeliverer/>}/>
    </Routes>
    </div>
  );
}

export default App;
