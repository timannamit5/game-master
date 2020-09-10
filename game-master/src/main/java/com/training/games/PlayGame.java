package com.training.games;

import com.training.games.basic.Game;
import com.training.games.gametypes.OfflineGame;
import com.training.games.gametypes.OnlineGame;

public class PlayGame {
	
	public static void play(Game game) {
		System.out.println("----------------------Common methods---------------------");
		System.out.println(game.getName());
		game.start();
		game.rule();
		game.stop();
		
		if(game instanceof OnlineGame ) {
			((OnlineGame)game).meetVirtual();	
		}else {
			((OfflineGame)game).meetPhysical();
		}
		
		
		
		System.out.println("------------------------------");
	}
	
	

}
