package com.luv2code.springdemo;

import com.prayag.springdemo.Coach;
import com.prayag.springdemo.TrackCoach;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}
