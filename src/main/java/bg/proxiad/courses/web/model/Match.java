package bg.proxiad.courses.web.model;

import java.util.List;

public class Match {
	private int id;
	private String[] players;

	private int gamesNumber = 3;
	private List<Game> games;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}

	public int getGamesNumber() {
		return gamesNumber;
	}

	public void setGamesNumber(int gamesNumber) {
		this.gamesNumber = gamesNumber;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}
}
