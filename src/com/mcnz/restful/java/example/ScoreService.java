package com.mcnz.restful.java.example;

import javax.ws.rs.*;

public class ScoreService {
	private static int wins, losses, ties;
	
	@POST @Path("/score/wins")@Produces("text/plain")
	public static int getWins() {
		return wins;
	}
	
	@POST @Path("/score/losses")@Produces("text/plain")
	public static int getLosses() {
		return losses;
	}

	@POST @Path("/score/ties")@Produces("text/plain")
	public static int getTies() {
		return ties;
	}

	@POST @Path("/score/wins")@Produces("text/plain")
	public int increaseWins() {
		return ++wins;
	}
	
	@POST @Path("/score/losses")@Produces("text/plain")
	public int increaseLosses() {
		return ++losses;
	}
	
	@POST @Path("/score/ties")@Produces("text/plain")
	public int increaseTies() {
		return ++ties;
	}

}
