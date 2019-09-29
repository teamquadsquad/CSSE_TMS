import React, { Component } from 'react';
import NavBar from "./dashboard";

class Recharge extends Component {
    render() {
        return (
            <div>
                <NavBar />
                <div className="signup-form">
                    <form>
                        <h4>Recharge Your Account</h4>
                        <hr />
                        <table>
                            <tbody>
                                <tr>
                                    <td>Balance: </td>
                                    <td>
                                        <div className="form-group">
                                            <h6
                                                name="first_name">
                                                250.00
                                            </h6>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Amount: </td>
                                    <td>
                                        <div className="form-group">
                                            <input type="text"
                                                className="form-control"
                                                name="last_name">

                                            </input>

                                        </div>
                                    </td>
                                </tr>


                                <tr>

                                    <td>

                                        <div className="form-group">
                                            <form action="/profile">
                                                <button type="submit" className="btn btn-info btn-md">Cancel</button>
                                            </form>
                                        </div>
                                    </td>
                                    <td>
                                        <div className="form-group">
                                            <form action="/checkOut">
                                                <button type="submit" className="btn btn-danger btn-md">Proceed</button>
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

export default Recharge;