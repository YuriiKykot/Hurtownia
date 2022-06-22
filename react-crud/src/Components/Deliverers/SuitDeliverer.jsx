import { useState } from "react";
import axios from "axios";
import { useParams } from "react-router-dom";
import React from "react";
import ItemDeliverer from "../Item/ItemDeliverer";
import s from '../Orders/Order.module.css'
import PopUp from "../PopUp/Popup"; 



export default function SuitDrones() {

    const data = useParams('add')
    const qua = data.qua
    const oId = data.id
    const [deliverers, setDeliverers] = useState([])

    React.useEffect(() => {
        axios.get("http://localhost:8080/api/all").then((response) => {
            setDeliverers(response.data)
        });
    }, []);

    const cancelOrder = (e) => {
        window.location.assign("http://localhost:3000");
        axios.get("http://localhost:8080/api/cancelOrder/" + oId).then(response => {

    })}
    const returnTo = (e) => {
        <h4>PopUp - GeeksforGeeks</h4>
        window.location.assign("http://localhost:3000");
        axios.get("http://localhost:8080/api/returnTo").then(response => {
    })}

        return(
            <div className={s.wrapper}>
               {deliverers.length === 0 ? <button onClick={cancelOrder}>Cancell order</button> : deliverers.map((deliverer) => (
        <ItemDeliverer transportType={deliverer.transportType} pricePerHour={deliverer.pricePerHour} name={deliverer.name} id_order={oId} id_deliverer={deliverer.id_deliverer}/>
      ))}
       {deliverers.length === 0 && <button onClick={returnTo}>Return to orders</button>}
            </div>
        )
}