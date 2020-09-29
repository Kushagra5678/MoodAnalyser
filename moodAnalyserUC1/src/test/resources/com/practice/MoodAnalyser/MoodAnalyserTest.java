package com.practice.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_whenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser=new MoodAnalyser();
		String mood=moodAnalyser.analyseMood("This is a sad message");
		Assert.assertEquals("SAD",mood);
	}
	@Test
	public void givenMessage_whenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser=new MoodAnalyser();
		String mood=moodAnalyser.analyseMood("This is a happy message");
		Assert.assertEquals("HAPPY",mood);
	}
}
