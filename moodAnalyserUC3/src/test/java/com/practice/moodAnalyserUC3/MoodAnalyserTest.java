package com.practice.moodAnalyserUC3;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
	@Test
	public void testAnalyseMood() {
		//fail("Not yet implemented");
		try {
		MoodAnalyser object1=new MoodAnalyser("I am in sad mood");
		Assert.assertEquals("SAD",object1.analyseMood());
		}
		catch(MoodAnalysisException e) {
			System.out.println("inside testing mood analysis");
		}
				
	}
	
	@Test
	public void givenNullMoodShouldInformUser() {
		MoodAnalyser object;
		try {
        object=new MoodAnalyser(null);
        String ans=object.analyseMood();
		
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.type);
		}
		
	}
	@Test
	public void givenEmptyMoodInformUser() {
		MoodAnalyser object;
		try {
        object=new MoodAnalyser("");
        String ans=object.analyseMood();
		
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.type);
		}
	}
}
