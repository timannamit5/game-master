package com.training.games.carrom;

import java.util.ArrayList;

import com.training.games.PlayGame;
import com.training.games.basic.Game;
import com.training.games.cricket.Cricket;
import com.training.games.exceptions.PlayersRequiredException;
import com.training.games.models.Player;
import com.training.games.utils.Leaderboard;

public class CarromRunner {
	public static void main(String[] args) throws Exception {
		Carrom carromInstance =  new Carrom("India", 4);
		initializePlayers(carromInstance);
		ArrayList<Player> playersList = new ArrayList<>();
		playersList = carromInstance.getPlayersList();
		PlayGame.play(carromInstance);
		Leaderboard leaderboard = new Leaderboard(playersList);
		leaderboard.getRanking();
	}
	
	public static void initializePlayers(Carrom game) {
		game.addPlayerToGame(new Player("Namit", 2));
		game.addPlayerToGame(new Player("Naveen", 3));
		game.addPlayerToGame(new Player("Shashank", 1));
		game.addPlayerToGame(new Player("Shrut", 6));
	}

}
