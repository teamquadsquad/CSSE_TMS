import React, {Component} from 'react';
import { Link } from 'react-router-dom'

class NavBar extends Component {

    constructor(props) {
        super(props);

        this.login = <Login />;
        this.dashboard = <Dashboard />;
        this.profile = <Profile />;
        this.notifications = <Notifications />;
        this.journeyHistory = <JourneyHistory />;
        this.recharge = <Recharge />;
        this.feedback = <Feedback />;
        this.timeTables = <TimeTables />;
    }
    render() {

        return (
            <div>

                <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                    <div className="container">

                        <a className="navbar-brand" href="#">Digital Tickets</a>
                        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarNav">
                            <ul className="navbar-nav">

                                <li className="nav-item ">
                                    {this.dashboard}
                                </li>
                                <li className="nav-item ">
                                    {this.profile}
                                </li>
                                <li className="nav-item ">
                                    {this.notifications}
                                </li>
                                <li className="nav-item ">
                                    {this.journeyHistory}
                                </li>
                                <li className="nav-item ">
                                    {this.recharge}
                                </li>
                                <li className="nav-item ">
                                    {this.feedback}
                                </li>
                                <li className="nav-item ">
                                    {this.timeTables}
                                </li>
                                <li className="nav-item ">
                                    {this.login}
                                </li>
                            </ul>
                        </div>

                    </div>
                </nav>

            </div>
        );
    }
}

class Login extends React.Component {

    render() {
        return (
            <div>
                <Link className="nav-link" to="/login">Login</Link>
            </div>
        );
    }
}

class Dashboard extends React.Component {

    render() {
        return (
            <div>
                <Link className="nav-link" to="/dashboard">Dashboard</Link>
            </div>
        );
    }
}

class Profile extends React.Component {

    render() {
        return (
            <div>
                <Link className="nav-link" to="/profile">Profile</Link>
            </div>
        );
    }
}

class Notifications extends React.Component {

    render() {
        return (
            <div>
                <Link className="nav-link" to="/notification">Notifications</Link>
            </div>
        );
    }
}

class JourneyHistory extends React.Component {

    render() {
        return (
            <div>
                <Link className="nav-link" to="/journey_history">Journey History</Link>
            </div>
        );
    }
}

class Recharge extends React.Component {

    render() {
        return (
            <div>
                <Link className="nav-link" to="/recharge">Recharge</Link>
            </div>
        );
    }
}

class Feedback extends React.Component {

    render() {
        return (
            <div>
                <Link className="nav-link" to="/feedback">Feedback</Link>
            </div>
        );
    }
}

class TimeTables extends React.Component {

    render() {
        return (
            <div>
                <Link className="nav-link" to="/time_tables">Time Tables</Link>
            </div>
        );
    }
}

export default NavBar;