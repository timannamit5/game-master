package com.training.games.exceptions;

public class PlayersRequiredException extends Exception {
	
	private String message;

	public PlayersRequiredException(String message) {
		super();
		this.message = message;
	}
	
	public PlayersRequiredException() {
		this.message = "Players not found";
	}
	
	@Override
	public String toString() {
		return "PlayersRequiredException [message " + message + " ]";
	}
	
	@Override
	public String getMessage() {
		return "getMessage : " + this.message;
	}
	

}
