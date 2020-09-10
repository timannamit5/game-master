package com.training.games.gametypes;

import com.training.games.basic.Game;

public abstract class OfflineGame extends Game {
	
	private int length;
	private int breadth;
	private String[] equipments;
	
	public OfflineGame() {
		
	}
	
//	public OfflineGame(int length, int breadth, String[] equipments, int noOfPlayer) {
//		super(noOfPlayer);
//		this.length = length;
//		this.breadth = breadth;
//		this.equipments = equipments;
//	}
	
	public OfflineGame( String name,int length, int breadth, String[] equipments) {
		super(name);
		this.length = length;
		this.breadth = breadth;
		this.equipments = equipments;
	}
	
	public void meetPhysical() {
		System.out.println("Meet physically");
	}
	

	public abstract void start();
	public abstract void stop();
	public abstract void rule() ;

	
	


	
	
	

}
