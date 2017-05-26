import React from 'react';
import $ from 'jquery'
import MatchCard from './MatchCard'
import AddMatchDialog from './AddMatchDialog'

export default class App extends React.Component {
   state = {
     matches: []
   }

  componentDidMount() {
    $.getJSON( "/api/matches", ( data ) => {
      this.setState({ matches: data });
    });
  }

  render = () => {
    return (
      <div>
        <div className="md-grid">
          {this.state.matches.map((match) =>
            <MatchCard match={match}/>
          )}
        </div>
        <AddMatchDialog />
      </div>
    )
  }
}
