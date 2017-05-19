import React, { Component } from 'react';

export default class App extends React.Component {
   state = {
     count: 0
   }

  componentDidMount() {
    this.start();
  }

  stop = () => {
    clearInterval(this.state.tickerId);
    this.setState({tickerId: null});
  }

  start = () => {
    let tickerId = setInterval(() => {
      let count = this.state.count + 1;
      this.setState({count: count});
    }, 600);
    this.setState({tickerId: tickerId});
  }

  render = () => {
    return (
      <div>
        <h1>Ticker is {this.state.count}</h1>
        {this.state.tickerId && <button onClick={this.stop}>Stop</button>}
        {!this.state.tickerId &&<button onClick={this.start}>Start</button>}
      </div>
    )
  }
}
