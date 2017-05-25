package bg.proxiad.courses.web.model;

import java.util.Collection;

public interface ScoringService {
	Collection<Match> listOngoingMatches();
	
	Match createMatch(String leftPlayer, String rightPlayer, int gamesNumber);
	
	Match getMatchInfo(int matchId);
	
	Match addPont(int matchId, boolean left);

}
