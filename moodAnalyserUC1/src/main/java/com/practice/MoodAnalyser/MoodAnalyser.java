package com.practice.MoodAnalyser;

public class MoodAnalyser {
	public String analyseMood(String message) {
		// TODO Auto-generated method stub
		if(message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";

	}
}
