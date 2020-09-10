package com.training.games;

import com.training.games.exceptions.PlayersRequiredException;
import com.training.games.gametypes.OnlineGame;

public class Carrom extends OnlineGame {

	private int noOfPlayer;

	public Carrom() {

	}

	public Carrom(String username, String region, int noOfPlayer) throws PlayersRequiredException {
		super("Carrom", username, region);
		if (noOfPlayer < 4) {
			throw new PlayersRequiredException("4 players required");
		}
		this.noOfPlayer = noOfPlayer;
	}

	@Override
	public void start() {
		System.out.println("Carrom game start");
	}

	@Override
	public void stop() {
		System.out.println("Carrom game stop");
	}

	@Override
	public void rule() {
		System.out.println("Carrom rule");
	}

}
