package com.movierest.seriesservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;

import com.movieapp.TrendingMoviesInfo;
import com.movieapp.TrendingMoviesManager;
import com.movieapp.TrendingSeriesInfo;
import com.movieapp.TrendingSeriesManager; 

@Path("/SeriesService") 

public class TrendingSeriesService {  

   	   @POST
	   @Path("/hello")
   	   @Consumes({MediaType.TEXT_PLAIN})
	   @Produces({MediaType.TEXT_PLAIN})
	   
	   public String successConnect() {
   		 return "Hello Jersey";
	   }
		   
	    @POST
	    @Path("/allseries")
	    @Consumes({MediaType.APPLICATION_JSON})
	    @Produces({MediaType.APPLICATION_JSON})
	       
	     public TrendingSeriesManager getAllMovies(String allmovies) {
	         TrendingSeriesManager moviemanager = new TrendingSeriesManager();
	         moviemanager.getAllMovies();
			 
	         return moviemanager;
	    }

	   @POST
	   @Path("/getseriesimage")
	   @Consumes({MediaType.APPLICATION_JSON})
	   @Produces({MediaType.APPLICATION_JSON})
	   
	   public TrendingSeriesManager getSeriesImage( ) {
		   TrendingSeriesManager moviemanager = new TrendingSeriesManager();
	         moviemanager.getMovieImage();
			 
	         return moviemanager;
       }

	   @POST
	   @Path("/newseries")
	   @Consumes({MediaType.APPLICATION_JSON})
	   @Produces({MediaType.APPLICATION_JSON})
	   
	   public TrendingSeriesInfo addMovie(TrendingSeriesInfo newmovie) {
		   TrendingSeriesManager moviemanager = new TrendingSeriesManager();
	         moviemanager.addNewMovie(newmovie);
			
	         return newmovie;
	   }
	   
       @PUT
       @Path("/updateseries")
       @Consumes({MediaType.APPLICATION_JSON})
       @Produces({MediaType.APPLICATION_JSON})
       
       public TrendingSeriesManager updateMovie(TrendingSeriesInfo updatemovie) {
    	   TrendingSeriesManager moviemanager = new TrendingSeriesManager();
	         moviemanager.updateMovie(updatemovie);
			 
	         return moviemanager;
       }
    
       @DELETE
       @Path("/deleteseries")
       @Consumes({MediaType.APPLICATION_JSON})
       
       public TrendingSeriesManager deleteMovie(TrendingSeriesInfo deletemovie) {
    	   TrendingSeriesManager moviemanager = new TrendingSeriesManager();
	         moviemanager.deleteMovie(deletemovie);
			 
	         return moviemanager;
       }
   }