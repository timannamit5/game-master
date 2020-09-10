package com.training.games.basic;

public abstract class Game {
	
	private int noOfPlayer;
	private String name;
	
	public Game() {
		
	}
	
	
	public String getName() {
		return name;
	}

	
	public Game(int noOfPlayer) {
		this.name = "No name";
		this.noOfPlayer = noOfPlayer;
	}
	

	public Game(String name) {
		if(name.length() < 5) {
			try {
				throw new RuntimeException("Name cannot be less than 5 chars");
			}catch(RuntimeException rte){
				this.name = "No name";
				rte.printStackTrace();
			}
			
		}else {
			this.name = name;
		}
	}

	public abstract void start();
	
	public abstract void stop();
	
	public abstract void rule();

}
