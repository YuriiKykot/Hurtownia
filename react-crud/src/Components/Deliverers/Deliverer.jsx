import { Component } from "react";
import ItemDeliverer from "../Item/ItemDeliverer";
import axios from "axios";
import s from '../Orders/Order.module.css'

export default class Deliverer extends Component {

    constructor() {
        super();
        this.state = {
            data: '',

        }
    }
    componentDidMount() {
        axios.get("http://localhost:8080/api/All").then(response => {
            this.setState({ data: response.data })
        })
    }
    render() {
        var rows = [];
        for (var i = 0; i < this.state.data.length; i++) {
            rows.push((<ItemDeliverer  key={this.state.data[i].id_deliverer} transportType={this.state.data[i].transportType} pricePerHour={this.state.data[i].pricePerHour} name={this.state.data[i].name} deliverStatus={this.state.data[i].delivererStatus} orders={this.state.data[i].orders}/>))
        }
        return (
            <div className={s.wrapper}>
                {rows}
            </div>
        )
    }
}