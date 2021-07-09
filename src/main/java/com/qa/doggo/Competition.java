package com.qa.doggo;

import java.util.ArrayList;
import java.util.List;

public class Competition {

	public List<String> findPlaces(int place) {
		List<String> places = new ArrayList<String>();
		String suffix = "";
		for (int i = 1; i < 101; i++) {
			if (i == place) {
				continue;
			} else if (i > 3 && i < 21) {
				suffix = "th";
			} else if (i % 10 == 1) {
				suffix = "st";
			} else if (i % 10 == 2) {
				suffix = "nd";
			} else if (i % 10 == 3) {
				suffix = "rd";
			} else {
				suffix = "th";
			}

			places.add(i + suffix);
		}
		System.out.println(places);
		return places;
	}

}
