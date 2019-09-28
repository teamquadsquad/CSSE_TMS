import React, {Component} from 'react';

class SignUp extends Component {

    constructor(props) {
        super(props);
        this.state = {
            firstname: '',
            lastname: '',
            address: '',
            email: '',
            contactNumber: '',
            username: '',
            password: ''
        };

        this.handleInputChange = this.handleInputChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleInputChange(e) {
        this.setState({
            [e.target.name]: e.target.value
        })
    }

    handleSubmit(e) {

        e.preventDefault();

        const obj = {
            firstname: this.state.firstname,
            lastname: this.state.lastname,
            address: this.state.address,
            email: this.state.email,
            contactNumber: this.state.contactNumber,
            username: this.state.username,
            password: this.state.password
        };

        // axios.post('http://localhost:8080/api/passenger', obj).then(
        //     data => {
        //
        //         console.log('Success ' + data.data);
        //         localStorage.setItem('token', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVkMGU1OGJkYjYwMzA3NDgxZmI1YzVmYyIsInR5cGUiOiJBZG1pbiIsImlhdCI6MTU2MTM2OTk5NX0.J-NYI-x0Awqb1qxYvC4Byjo-cz8fCtyqpU6p7AHJaWs');
        //         localStorage.setItem('id', data.data.id);
        //         localStorage.setItem('name', data.data.firstname);
        //         localStorage.setItem('type', 'Student');
        //         this.props.history.push('/');
        //         window.location.reload();
        //
        //     }
        // );

        this.setState({
            firstname: '',
            lastname: '',
            address: '',
            email: '',
            contactNumber: '',
            username: '',
            password: ''
        })
    }

    render() {
        return (
            <div>
                <div className="signup-form">
                    <form onSubmit={this.handleSubmit}>
                        <h2>Sign Up</h2>
                        <p>Please fill this form to create an account!</p>
                        <div className="form-group">
                            <div className="form-group">
                                <input type="text"
                                       className="form-control"
                                       placeholder="First Name"
                                       onChange={this.handleInputChange}
                                       value={this.state.firstname}
                                       name="firstname">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="text"
                                       className="form-control"
                                       placeholder="Last Name"
                                       onChange={this.handleInputChange}
                                       value={this.state.lastname}
                                       name="lastname">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="text"
                                       className="form-control"
                                       placeholder="Address"
                                       onChange={this.handleInputChange}
                                       value={this.state.address}
                                       name="address">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="text"
                                       className="form-control"
                                       placeholder="Email Address"
                                       onChange={this.handleInputChange}
                                       value={this.state.email}
                                       name="email">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="text"
                                       className="form-control"
                                       placeholder="Contact Number"
                                       onChange={this.handleInputChange}
                                       value={this.state.contactNumber}
                                       name="contactNumber">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="text"
                                       className="form-control"
                                       placeholder="Username (NIC)"
                                       onChange={this.handleInputChange}
                                       value={this.state.username}
                                       name="username">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="password"
                                       className="form-control"
                                       placeholder="Password"
                                       onChange={this.handleInputChange}
                                       value={this.state.password}
                                       name="password"
                                       autoComplete="off">
                                </input>
                            </div>

                            <div className="form-group">
                                <input type="password"
                                       className="form-control"
                                       name="confirm_password"
                                       placeholder="Confirm Password"
                                       autoComplete="off">
                                </input>
                            </div>
                        </div>

                        <div className="form-group">
                            <button type="submit" className="btn btn-primary btn-lg">Sign Up</button>
                        </div>
                    </form>
                </div>
            </div>
        );
    }
}

export default SignUp;