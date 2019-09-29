import React, { Component } from 'react';

import NavBar from "./dashboard";
import axios from 'axios';

class Profile extends Component {

    constructor(props){
        super(props);
        this.state = {
            fName: 'hashini',
            lName: 'warnakulasooriya',
            email: 'hash_hw@icloud.com',
            contactNumber: '+94702672794',
            balance: 210,

        };
    }
    componentDidMount(){
        axios.get('/api/passenger').then(
            data => {
                this.setState({
                    fName: data.firstName
                })
            }
        )
    }
    render() {
        return (
            <div>
                <NavBar />
                <div className="signup-form">
                    <form>
                        <h2>Hi Hashini</h2>
                        <img src="https://www.pinclipart.com/picdir/middle/355-3553881_stockvader-predicted-adig-user-profile-icon-png-clipart.png" alt="myLove" width="72" height="72">
                        </img>
                        <p>Welcome</p>
                        <table>
                            <tbody>
                                <tr>
                                    <td>First Name: </td>
                                    <td>
                                        <div className="form-group">
                                            <h4
                                                className="form-control"
                                                name="first_name">
                                                {this.state.fName}
                                            </h4>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Last Name: </td>
                                    <td>
                                        <div className="form-group">
                                            <h4
                                                className="form-control"
                                                name="last_name">
                                                {this.state.lName}
                                            </h4>
                                        </div>
                                    </td>
                                </tr>

                                <tr>
                                    <td>Email: </td>
                                    <td>
                                        <div className="form-group">
                                            <h4
                                                className="form-control"
                                                name="email">
                                                {this.state.email}
                                        </h4>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Contact Number: </td>
                                    <td>
                                        <div className="form-group">
                                            <h4
                                                className="form-control"
                                                name="contactNumber">
                                                {this.state.contactNumber}
                                        </h4>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Balance: </td>
                                    <td>
                                        <div className="form-group">
                                            <h4
                                                className="form-control"
                                                name="balance">
                                                {this.state.balance}
                                    </h4>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <div className="form-group">
                                            <form action="/recharge">
                                                <button type="submit" className="btn btn-danger btn-md">Recharge</button>
                                            </form>
                                        </div>
                                    </td>
                                    <td>

                                        <div className="form-group">
                                            <form action="/transaction">
                                                <button type="submit" className="btn btn-info btn-md">Transactions</button>
                                            </form>
                                        </div>
                                    </td>

                                </tr>
                            </tbody>
                        </table>
                    </form>
                </div>
            </div>
        );
    }
}

export default Profile;