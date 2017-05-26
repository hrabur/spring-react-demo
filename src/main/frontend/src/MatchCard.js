import React from 'react';
import Button from 'react-md/lib/Buttons';
import Card from 'react-md/lib/Cards/Card';
import CardTitle from 'react-md/lib/Cards/CardTitle';
import CardActions from 'react-md/lib/Cards/CardActions';
import CardText from 'react-md/lib/Cards/CardText';

const MatchCard = (props) => (
  <div className="md-cell md-cell--4">
    <Card>
      <CardTitle
        title={`${props.match.players[0]} - ${props.match.players[1]}`}
        subtitle="Card Subtitle"
      />
      <CardActions expander>
        <Button flat label="Action 1" />
        <Button flat label="Action 2" />
      </CardActions>
      <CardText>
        Texts just for the example
      </CardText>
    </Card>
  </div>
);

export default MatchCard;
