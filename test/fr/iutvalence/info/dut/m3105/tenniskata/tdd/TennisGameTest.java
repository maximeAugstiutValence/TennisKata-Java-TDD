package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void whenTheScoreOfTwoPlayerIsNullReturnLoveAll(){
		TennisGame TennisGameTest = new TennisGame();
		assertEquals(TennisGameTest.getScore(),"Love-all");
		
	}
	
	@Test
	public void whenTheScroreOfThePlayerIs15AndTheOtherPlayerIs0ReturnFifteenLove(){
		TennisGame TennisGameTest = new TennisGame();
		TennisGameTest.serverScores();
		assertEquals(TennisGameTest.getScore(),"Fifteen-Love");
		
	}
	
	@Test
	public void whenTheScroreOfThePlayerIs15AndTheOtherPlayerIs0ReturnLoveFifteen(){
		TennisGame TennisGameTest = new TennisGame();
		TennisGameTest.receiverScores();
		assertEquals(TennisGameTest.getScore(),"Fifteen-Love");
		
	}
	
	@Test
	public void whenTheScroreOfThePlayerIs15_15ReturnFifteenAll(){
		TennisGame TennisGameTest = new TennisGame();
		TennisGameTest.eachOtherScores();
		assertEquals(TennisGameTest.getScore(),"Fifteen-all");
		
	}
}
