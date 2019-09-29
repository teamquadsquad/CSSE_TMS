import React, {Component} from 'react';
import { Route, Switch } from 'react-router-dom';
import Login from "./login";
import Dashboard from "./dashboard";
import SignUp from "./signUp";
import JourneyHistory from "./journeyHistory";
import Feedback from "./feedback";
import Notification from "./notification";
import Recharge from "./recharge";
import TimeTables from "./timeTables";
import Profile from "./profile";
import CheckOut from "./checkOut";
import Transaction from "./transaction";

class Body extends Component {
    render() {
        return (
            <div>

                <div className="container mt-3 px-5">

                    <Switch>
                        <Route path="/login" component={Login} ></Route>
                        <Route path="/dashboard" component={Dashboard} ></Route>
                        <Route path="/sign_up" component={SignUp} ></Route>
                        <Route path="/journey_history" component={JourneyHistory} ></Route>
                        <Route path="/feedback" component={Feedback} ></Route>
                        <Route path="/notification" component={Notification} ></Route>
                        <Route path="/recharge" component={Recharge} ></Route>
                        <Route path="/time_tables" component={TimeTables} ></Route>
                        <Route path="/profile" component={Profile} ></Route>
                        <Route path="/checkOut" component={CheckOut} ></Route>
                        <Route path="/transaction" component={Transaction} ></Route>
                    </Switch>

                </div>
            </div>
        );
    }
}

export default Body;