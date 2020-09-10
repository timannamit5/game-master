package com.training.games.utils;

public class Util {

	public boolean validateNoOfPlayers(Games gameName, int noOfPlayers) {
		switch (gameName) {
		case CRICKET:
			if (noOfPlayers == 11) {
				return true;
			}
			return false;

		case CHESS:
			if (noOfPlayers == 2) {
				return true;
			}
			return false;

		case CARROM:
			if (noOfPlayers == 4) {
				return true;
			}
			return false;

		default:
			return false;
		}
	}

}
