package com.training.games.cricket;

import java.util.ArrayList;

import com.training.games.exceptions.PlayersRequiredException;
import com.training.games.gametypes.OfflineGame;
import com.training.games.models.Player;

public class Cricket extends OfflineGame implements ICricket {

	private int noOfPlayers;
	private ArrayList<Player> playersList;

	public Cricket() {
		
	}

	public Cricket(int length, int breadth, String[] equipments, int noOfPlayers) throws PlayersRequiredException {
		super("Cricket", length, breadth, equipments);
		this.validateNoOfPlayers(noOfPlayers);
		this.setNoOfPlayers(noOfPlayers);
		this.generateMap(length, breadth);
		playersList = new ArrayList<>();
	}

	public void generateMap(int length, int breadth) {
		System.out.println("Map Generated");
	}

	public void validateNoOfPlayers(int noOfPlayers) throws PlayersRequiredException {
		if (noOfPlayers != ICricket.NO_OF_PLAYERS) {
			throw new PlayersRequiredException("11 players required");
		}
	}

	@Override
	public void start() {
		System.out.println("Cricket game start");
	}

	@Override
	public void stop() {
		System.out.println("Cricket game stop");
	}

	@Override
	public void rule() {
		System.out.println("Rules of cricket");

	}

	@Override
	public void bowling() {
		System.out.println("Bowled");

	}

	@Override
	public void batting() {
		System.out.println("Hit");

	}

	@Override
	public void fielding() {
		System.out.println("Fielding now...");
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public ArrayList<Player> getPlayersList() {
		return playersList;
	}

	public void setPlayersList(ArrayList<Player> playersList) {
		this.playersList = playersList;
	}

	public void addPlayerToGame(Player p) {
		System.out.println("Player " + p.getUsername() + " initialized");
		this.playersList.add(p);
	}
	
	public void setPlayerScore(ArrayList<Player> playersList) {
		for(Player p : playersList) {
			p.setScore((long)(5*Math.random()));
		}
		
	}

}
