package com.prayag.springdemo;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.TrackCoach;

public class MyApp03 {

	public static void main(String[] args) {

		// create the object
		com.prayag.springdemo.Coach theCoach = new com.prayag.springdemo.TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}
