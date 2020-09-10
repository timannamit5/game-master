package com.training.games.carrom;

import java.util.ArrayList;

import com.training.games.exceptions.PlayersRequiredException;
import com.training.games.gametypes.OnlineGame;
import com.training.games.models.Player;

public class Carrom extends OnlineGame implements ICarrom {
	
	private int noOfPlayers;
	private ArrayList<Player> playersList;

	public Carrom(String region, int noOfPlayers) throws PlayersRequiredException {
		super("Carrom", region);
		this.setNoOfPlayers(noOfPlayers);
		this.validateNoOfPlayers(noOfPlayers);
		playersList = new ArrayList<>();

	}

	public void validateNoOfPlayers(int noOfPlayers) throws PlayersRequiredException {
		if (noOfPlayers > ICarrom.NO_OF_PLAYERS || noOfPlayers < 2) {
			throw new PlayersRequiredException("2-4 players needs to play");
		}
	}

	@Override
	public void striking() {
		System.out.println("Carrom game start");
	}

	@Override
	public void coveringQueen() {
		System.out.println("Queen in the pocket");
	}

	@Override
	public void pocket() {
		System.out.println("In the pocket");
	}

	@Override
	public void foul() {
		System.out.println("Foul commited");
	}
	
	@Override
	public void start() {
		System.out.println("Carrom game has started");
	}

	@Override
	public void stop() {
		System.out.println("Carrom game has stopped");
	}

	@Override
	public void rule() {
		System.out.println("Carrom is tough just like life");
	}

	public ArrayList<Player> getPlayersList() {
		return playersList;
	}
	
	public void setPlayersList(ArrayList<Player> playersList) {
		this.playersList = playersList;
	}

	public void addPlayerToGame(Player player) {
		System.out.println("Player " + player.getUsername() + " initialized");
		playersList.add(player);
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
		

}
