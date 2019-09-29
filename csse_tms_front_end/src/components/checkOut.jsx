import React, { Component } from 'react';

import NavBar from "./dashboard";
import { CardElement, injectStripe, StripeProvider, Elements } from 'react-stripe-elements';

class _CardForm extends React.Component {
    render() {
      return (
        <form onSubmit={() => this.props.stripe.createToken().then(payload => console.log(payload))}>
          <label>
            Card details
            <CardElement />
          </label>
          <button>Pay</button>
        </form>
      )
    }
  }
  const CardForm = injectStripe(_CardForm)
  
  class Checkout extends React.Component {
    render() {
      return (
        <div className="Checkout">
          <h1>Available Elements</h1>
          <Elements>
            <CardForm className="StripeElement" />
          </Elements>
        </div>
      )
    }
  }
  const App = () => {
    return (
      <StripeProvider apiKey="pk_RXwtgk4Z5VR82S94vtwmam6P8qMXQ">
        <Checkout />
      </StripeProvider>
    )
  }
  export default App;
//   ReactDOM.render(<App />, document.querySelector('.App'))