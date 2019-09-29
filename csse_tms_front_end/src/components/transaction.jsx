import React, { Component } from 'react';

import NavBar from "./dashboard";

class Transaction extends Component {
    render() {
        return (
            <div>
                <NavBar />
                <div className="container">
                <table className="table">
                    <thead>
                        <tr>
                            <th>Date Tine</th>
                            <th>Amount</th>
                            <th>Type</th>
                        </tr>
                    </thead>
                    <tbody>
                    {/* {
                        this.state.categories.map( cat => {
                            return (
                                <tr>
                                    <td>{cat.name}</td>
                                    <td>{cat.description}</td>
                                    <td><button className="btn btn-primary" onClick = {this.findRooms.bind(this,cat.rooms)}>Rooms</button></td>
                                </tr>
                            )
                        })
                    } */}
                    </tbody>
                </table>
            </div>
            </div>
        );
    }
}

export default Transaction;