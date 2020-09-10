package com.training.games.cricket;

import java.util.ArrayList;

import com.training.games.PlayGame;
import com.training.games.basic.Game;
import com.training.games.models.Player;
import com.training.games.utils.Leaderboard;

public class CricketRunner {
	
	public static void main(String[] args) throws Exception {
		Game cricket = new Cricket(100, 200, new String[] {"Bat", "Ball"}, 11);
		initializePlayers(cricket);
		ArrayList<Player> playersList = new ArrayList<>();
		playersList = ((Cricket)cricket).getPlayersList();
		PlayGame.play(cricket);
		((Cricket)cricket).setPlayerScore(playersList);
		Leaderboard leaderboard = new Leaderboard(playersList);
		leaderboard.getRanking();
	}
	
	
	
	public static void initializePlayers(Game game) {
		((Cricket)game).addPlayerToGame(new Player("Namit", 0));
		((Cricket)game).addPlayerToGame(new Player("Naveen", 0));
		((Cricket)game).addPlayerToGame(new Player("Shashank", 0));
		((Cricket)game).addPlayerToGame(new Player("Shrut", 0));
		((Cricket)game).addPlayerToGame(new Player("Rishab", 0));
		((Cricket)game).addPlayerToGame(new Player("Dhruv", 0));
		((Cricket)game).addPlayerToGame(new Player("Ashutosh", 0));
		((Cricket)game).addPlayerToGame(new Player("Divyansh", 0));
		((Cricket)game).addPlayerToGame(new Player("Suresh", 0));
		((Cricket)game).addPlayerToGame(new Player("Vishal", 0));
		((Cricket)game).addPlayerToGame(new Player("Garvit", 0));	
	}
}
