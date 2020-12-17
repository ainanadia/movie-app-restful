package com.movierest.movieservice;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.movieapp.GetByIDManager;
import com.movieapp.TrendingMoviesInfo;
import com.movieapp.TrendingMoviesManager;

@Path("/MovieService") 

public class MovieService {  
	
   
   	   @POST
	   @Path("/hello")
   	   @Consumes({MediaType.TEXT_PLAIN})
	   @Produces({MediaType.TEXT_PLAIN})
	   
	   public String successConnect() {
   		 return "Hello Jersey";
	   }
		   

	   @POST
	   @Path("/allmovies")
	   @Consumes({MediaType.APPLICATION_JSON})
	   @Produces({MediaType.APPLICATION_JSON})
	       
	    public TrendingMoviesManager getAllMovies() {
	        TrendingMoviesManager moviemanager = new TrendingMoviesManager();
	        moviemanager.getAllMovies();
			 
	         return moviemanager;
	    }

	   @POST
	   @Path("/getmovieimage")
	   @Consumes({MediaType.APPLICATION_JSON})
	   @Produces({MediaType.APPLICATION_JSON})
	   
	   public TrendingMoviesManager getMovieImage(TrendingMoviesInfo image) {
		   TrendingMoviesManager moviemanager = new TrendingMoviesManager();
	         moviemanager.getMovieImage(image);
	         
			return moviemanager;
			 
       }
	   
	   @POST
	   @Path("/getmoviebyid")
	   @Consumes({MediaType.APPLICATION_JSON})
	   @Produces({MediaType.APPLICATION_JSON})
	   
	   public String getMovieByID(TrendingMoviesInfo movieid) {
		   GetByIDManager moviemanager = new GetByIDManager();
	         moviemanager.getMovieByID(movieid);
	  
	         ObjectMapper Obj = new ObjectMapper();
	         String jsonStr = null;
	  
	         try {
	             
	             jsonStr = Obj.writeValueAsString(movieid);
	  
	             // Displaying JSON String
	             System.out.println(jsonStr);
	         }
	         catch (IOException e) {
	             e.printStackTrace();
	         }
	         return jsonStr;
       }

	   @POST
	   @Path("/newmovie")
	   @Consumes({MediaType.APPLICATION_JSON})
	   @Produces({MediaType.APPLICATION_JSON})
	   
	   public TrendingMoviesInfo addMovie(TrendingMoviesInfo newmovie) {
		   TrendingMoviesManager moviemanager = new TrendingMoviesManager();
	         moviemanager.addNewMovie(newmovie);
			
	         return newmovie;
	   }

       @PUT
       @Path("/updatemovie")
       @Consumes({MediaType.APPLICATION_JSON})
       @Produces({MediaType.APPLICATION_JSON})
       
       public TrendingMoviesManager updateMovie(TrendingMoviesInfo updatemovie) {
    	   TrendingMoviesManager moviemanager = new TrendingMoviesManager();
	         moviemanager.updateMovie(updatemovie);
			 
	         return moviemanager;
       }
    
       @DELETE
       @Path("/deletemovie")
       @Consumes({MediaType.APPLICATION_JSON})
       
       public TrendingMoviesManager deleteMovie(TrendingMoviesInfo deletemovie) {
    	   TrendingMoviesManager moviemanager = new TrendingMoviesManager();
	         moviemanager.deleteMovie(deletemovie);
			 
	         return moviemanager;
	}
}