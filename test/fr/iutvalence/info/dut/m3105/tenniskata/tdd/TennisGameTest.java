package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void whenTheScoreOfTwoPlayerIsNullReturnLoveAll(){
		TennisGame TennisGameTest = new TennisGame("Love-all");
		assertEquals(TennisGameTest.getScore(),"Love-all");
		
	}
	
	@Test
	public void whenTheScroreOfThePlayerIs15AndTheOtherPlayerIs0ReturnFifteenLove(){
		TennisGame TennisGameTest = new TennisGame("Fifteen-Love");
		assertEquals(TennisGameTest.getScore(),"Fifteen-Love");
		
	}
}
