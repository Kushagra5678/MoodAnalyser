package com.practice.moodAnalyserUC3;

//import com.practice.moodAnalyserUC3.MoodAnalysisException.ExceptionType;

public class MoodAnalysisException extends Exception {
	  public enum ExceptionType{
			 ENTERED_NULL,ENTERED_EMPTY
		  }
		  public  ExceptionType type;
	    public MoodAnalysisException(ExceptionType type,String message){
	  	  super(message);
	  	  this.type=type;
	    }
}
