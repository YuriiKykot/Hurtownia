import { Link } from 'react-router-dom'
import s from './Item.module.css'


export default function Item(props){


    return(
            <div className={s.box}>
                <h1>Id {props.id_order}</h1>
                <p>Address: {props.address}</p>
                <p>Quantity: {props.quantity}</p>
                <p>Order status: {props.orderStatus}</p>
            </div>
    )
}