import Item from "../Item/Item";
import { Component } from "react";
import axios from "axios";
import s from './Order.module.css'

export default class Order extends Component {
    constructor() {
        super();
        this.state = {
            data: '',

        }
    }
    componentDidMount() {
        axios.get("http://localhost:8080/api/getSubmitted").then(response => { console.log(response)
            this.setState({ data: response.data })
        })
    }
    render() {
        var rows = [];
        for (var i = 0; i < this.state.data.length; i++) {
            rows.push((<Item address={this.state.data[i].address} key={this.state.data[i].id_order} quantity={this.state.data[i].quantity} id_order={this.state.data[i].id_order} orderStatus={this.state.data[i].orderStatus}/>))
        }
        return (
            <div className={s.wrapper}>
                {rows}
            </div>
        )
    }


}