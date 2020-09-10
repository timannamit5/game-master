package com.training.games.gametypes;

import com.training.games.basic.Game;
import com.training.games.exceptions.PlayersRequiredException;

public abstract class OnlineGame extends Game {
	private String region;
	
	public OnlineGame() {
		
	}
	
	public OnlineGame( String name, String region) throws PlayersRequiredException {
		super(name);
		this.region = region;
	}
	
	public void meetVirtual() {
		System.out.println("Meet virtually");
	}

	public abstract void start();

	public abstract void stop();

	public abstract void rule();
	
	
	
	
}
