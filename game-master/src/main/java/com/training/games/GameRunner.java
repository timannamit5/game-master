package com.training.games;

import com.training.games.basic.Game;
import com.training.games.cricket.Cricket;
import com.training.games.exceptions.PlayersRequiredException;

public class GameRunner {
	public static void main(String[] args) throws PlayersRequiredException {
		Game[] games = new Game[3];
		games[0] = new Cricket(100,200,new String[] {"Bat", "Ball"},11);
		games[1] = new Carrom("Namit", "India", 4);
		
		for(Game game: games) {
			PlayGame.play(game);
		}
	}
	
	
}
