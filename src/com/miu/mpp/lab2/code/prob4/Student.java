package com.miu.mpp.lab2.code.prob4;

import java.util.*;

public class Student {
	String name;
	List<TranscriptEntry> grades;
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}
	
}
