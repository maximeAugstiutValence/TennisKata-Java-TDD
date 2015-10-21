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
	
}
