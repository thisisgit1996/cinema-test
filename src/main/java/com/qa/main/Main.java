package com.qa.main;

import util.JSonConverter;
import com.qa.model.Movie;
import com.qa.service.Service;



public class Main {

	public static void main(String[] args) {
		Service service = new Service();
		Movie rambo = new Movie("rambo", "action", "15");
		service.addMovie(rambo);
		JSonConverter util = new JSonConverter();
		String display = util.getJSONForObject(service.getMovieMap());
		System.out.println("Display: " + display);
	}

}
