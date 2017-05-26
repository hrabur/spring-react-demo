package bg.proxiad.courses.web.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bg.proxiad.courses.web.model.Match;
import bg.proxiad.courses.web.model.ScoringService;

@RestController
@RequestMapping(path = "/api/matches")
public class ScoringApi {
	
	@Autowired
	private ScoringService scoringService;

    @GetMapping
    public Collection<Match> listOngoingMatches() {
        return scoringService.listOngoingMatches();
    }

    @GetMapping(path = "{matchId}")
    public Match getMatchInfo(@PathVariable Integer matchId) {
        return scoringService.getMatchInfo(matchId);
    }
    
    @PostMapping
    public Match createMatch(String leftPlayer, String rightPlayer, int gamesNumber) {
    	return scoringService.createMatch(leftPlayer, rightPlayer, gamesNumber);
    }
    
    @PostMapping(path = "{matchId}/point")
    public Match addPoint(@PathVariable Integer matchId, boolean left) {
    	return scoringService.addPont(matchId, left);
    }
}
