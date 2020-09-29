package com.practice.moodAnalyserUC2;

public class MoodAnalyser {
	private String message=null;
	public MoodAnalyser() {
	}
	public MoodAnalyser(String message) {
		this.message=message;
	}
	public String analyseMood() {
		// TODO Auto-generated method stub
		try {
			if (message.contains("sad")| message.contains("happy"))
				return "SAD";
			else 
				return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
		
	}
}
