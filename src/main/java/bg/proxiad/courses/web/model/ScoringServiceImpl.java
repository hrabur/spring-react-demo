package bg.proxiad.courses.web.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

@Service
public class ScoringServiceImpl implements ScoringService {
	
	private AtomicInteger nextMatchId = new AtomicInteger(0);
	private Map<Integer, Match> matches = new HashMap<>();

	@Override
	public Collection<Match> listOngoingMatches() {
		return matches.values();
	}

	@Override
	public Match createMatch(String leftPlayer, String rightPlayer, int gamesNumber) {
		Game game = new Game();
		game.setLeftPlayerIndex(0);
		game.setScore(new int[] { 0, 0 });
		
		List<Game> games = new ArrayList<>(gamesNumber);
		games.add(game);
		
		int matchId = nextMatchId.getAndIncrement();
		Match match = new Match();
		match.setId(matchId);
		match.setGamesNumber(gamesNumber);
		match.setPlayers(new String[] { leftPlayer, rightPlayer });
		match.setGames(games);
		
		return match;
	}

	@Override
	public Match getMatchInfo(int matchId) {
		return matches.get(matchId);
	}

	@Override
	public Match addPont(int matchId, boolean left) {
		Match match = getMatchInfo(matchId);
		int gameNumber = match.getGames().size() - 1;
		Game game = match.getGames().get(gameNumber);
		
		if (left) {
			game.getScore()[game.getLeftPlayerIndex()]++;
		} else {
			game.getScore()[game.getRightPlayerIndex()]++;
		}
		
		return match;
	}
	
	
}
