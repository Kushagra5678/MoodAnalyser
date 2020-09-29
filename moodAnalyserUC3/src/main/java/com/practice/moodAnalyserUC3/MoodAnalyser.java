package com.practice.moodAnalyserUC3;

public class MoodAnalyser {
	public String message;
	
	public MoodAnalyser(String message) {
		this.message=message;
	}
	
	public String analyseMood() throws MoodAnalysisException {
		try {
		if(message.length()==0)
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Enter proper mood");
		
		if(message.toLowerCase().contains("sad"))
			return "SAD";
		else return "HAPPY";
		
		}
		catch(NullPointerException e){
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Enter proper mood");
		}
		
	}
	public static void main(String[] args) throws MoodAnalysisException {
		
		System.out.println("Inside main");
		
	}
}
