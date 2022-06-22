import { Component } from "react";
import s from './Header.module.css'


export default class Header extends Component {

    render(){
        return(
            <div className={s.navWrapper}>
            <div className={s.leftNav}>
              <a href="/">Orders to delivery</a>
            </div>
            <div className={s.rightNav}>
                <a href="/onTheWay">Orders On the way</a>
            </div>
            <div className={s.navWrapper}>
                <a href="/deliverers">Deliverers</a>
            </div>
            <div className={s.navWrapper}>
                <a href="/allOrders">All orders</a>
            </div>
          </div>
        )
    }
}