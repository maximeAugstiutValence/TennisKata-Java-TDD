package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	public static String score;
	
	public TennisGame(){
		this.score = "Love-all";
	}
	
	
	public void serverScores() {
		this.score = "Fifteen-Love";
		
	}
	
	public String getScore() {
		return score;
	}

	

}
