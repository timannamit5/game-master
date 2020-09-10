package com.training.games.gametypes;

import com.training.games.basic.Game;
import com.training.games.exceptions.PlayersRequiredException;

public class OnlineGame extends Game {
	private String username;
	private String region;
	
	public OnlineGame() {
		
	}

	public OnlineGame(String username, String region, int noOfPlayer) {
		super(noOfPlayer);
		this.username = username;
		this.region = region;
	}
	
	public OnlineGame( String name,String username, String region) throws PlayersRequiredException {
		super(name);
		this.username = username;
		this.region = region;
	}
	
	public void meetVirtual() {
		System.out.println("Meet virtually");
	}

	public void start() {
		System.out.println("Online Game starts");
	}

	public void stop() {
		System.out.println("Online Game stop");
	}

	public void rule() {
		System.out.println("Online game rules");
	}
	
	
	
	
}
