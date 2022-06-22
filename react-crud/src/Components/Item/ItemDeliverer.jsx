import s from './Item.module.css'
import axios from 'axios';


export default function ItemDeliverer(props){

    const setOrderClick = (e) =>{
        window.location.assign("http://localhost:3000");
        axios.get("http://localhost:8080/api/addOrder/" + props.id_deliverer + "/" + props.id_order).then(response => {
            props.droneStatus = 'BUSY'})
    }

    return(
            <div className={s.box}>
                <h1>{props.name}</h1>
                <p>Price: {props.pricePerHour}</p>
                <p>Transport: {props.transportType}</p>
                <p>Status: {props.deliverStatus}</p>
                {window.location.pathname === '/deliverers' ?(<div></div>) : (<button onClick={setOrderClick}>Add order</button>)}
            </div>
    )
}