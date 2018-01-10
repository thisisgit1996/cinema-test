package com.qa.service;

import java.util.HashMap;
import java.util.Map;

import com.qa.model.Movie;

public class Service {
	private Map<Integer, Movie> movieMap;
	private static int count = 0;

	public Map<Integer, Movie> getMovieMap() {
		return movieMap;
	}

	public void setMovieMap(Map<Integer, Movie> movieMap) {
		this.movieMap = movieMap;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Service.count = count;
	}

	public Service() {
		movieMap = new HashMap<Integer, Movie>();
	}

	public void addMovie(Movie aMovie) {
		count++;
		movieMap.put(count, aMovie);
	}

	public void deleteMovie(int movieToDelete) {
		movieMap.remove(movieToDelete);
	}
}
