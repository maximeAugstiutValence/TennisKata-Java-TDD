package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	private String score;
	
	public TennisGame(){
		this.score = "Love-all";
	}
	
	
	public void serverScores() {
		this.score = "Fifteen-Love";
		
	}
	
	public void receiverScores() {
		this.score = "Love-Fifteen-";
		
	}
	
	public String getScore() {
		return score;
	}


	

	

}
