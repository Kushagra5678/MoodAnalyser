package com.practice.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_whenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("This is a sad message");
		String mood=moodAnalyser.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	@Test
	public void givenMessage_whenNotSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("This is a happy message");
		String mood=moodAnalyser.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	@Test
	public void givenNullMessage_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser=new MoodAnalyser();
		String mood=moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY",mood);
	}
}
