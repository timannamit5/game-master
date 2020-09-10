package com.training.games.utils;

import java.util.ArrayList;
import java.util.Collections;

import com.training.games.models.Player;

public class Leaderboard {
	
	ArrayList<Player> players;
	
	public Leaderboard(ArrayList<Player> players) {
		this.players = players;
	}
	
	public void getRanking() {
		Collections.sort(this.players, (p1,p2)->((Long)p1.getScore()).compareTo((Long)p2.getScore()));
		for(Player p: this.players) {
			System.out.println(p.getUsername() + " -> " + p.getScore());
		}
	}

}
