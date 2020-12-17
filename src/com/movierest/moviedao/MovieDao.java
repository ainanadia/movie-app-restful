package com.movierest.moviedao;

import com.movieapp.TrendingMoviesManager;  

//@Path("/moviedao")
public class MovieDao { 
	
      	private static MovieDao instance;
      	
		public static MovieDao getInstance() {
			
			if (instance == null) {
				instance = new MovieDao();
			}
			return instance;
		}
	
//	    public MovieManager movieByID(String movieid) { 
//	    	MovieManager movieManager = new MovieManager();   
//	    	movieManager.getByID(movieid);
//	    	
//			return movieManager;
//	    }

	    public TrendingMoviesManager allMovies(String allmovies) { 
	    	TrendingMoviesManager movieManager = new TrendingMoviesManager();   
	    	movieManager.getAllMovies();
	    	
			return movieManager;
	    }

}