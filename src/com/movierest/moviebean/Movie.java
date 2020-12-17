package com.movierest.moviebean;


import java.io.Serializable;   
import javax.xml.bind.annotation.XmlRootElement; 


@XmlRootElement(name = "movies") 
public class Movie implements Serializable {  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String movieid;
	private String movietitle;
	private int movieyear;
	private String movieclass;
	private String movieimage;
	private String moviesynopsis;
	   
	public Movie() {}
	
	public Movie(String movieid, String movietitle, int movieyear, String movieclass, String movieimage,
			String moviesynopsis) {
	
		this.movieid = movieid;
		this.movietitle = movietitle;
		this.movieyear = movieyear;
		this.movieclass = movieclass;
		this.movieimage = movieimage;
		this.moviesynopsis = moviesynopsis;
	}
	
	public String getMovieid() {
		return movieid;
	}
	
	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}
	
	public String getMovietitle() {
		return movietitle;
	}
	
	public void setMovietitle(String movietitle) {
		this.movietitle = movietitle;
	}
	
	public int getMovieyear() {
		return movieyear;
	}
	
	public void setMovieyear(int movieyear) {
		this.movieyear = movieyear;
	}
	
	public String getMovieclass() {
		return movieclass;
	}
	
	public void setMovieclass(String movieclass) {
		this.movieclass = movieclass;
	}
	
	public String getMovieimage() {
		return movieimage;
	}
	
	public void setMovieimage(String movieimage) {
		this.movieimage = movieimage;
	}
	
	public String getMoviesynopsis() {
		return moviesynopsis;
	}
	
	public void setMoviesynopsis(String moviesynopsis) {
		this.moviesynopsis = moviesynopsis;
	}
	
	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", movietitle=" + movietitle + ", movieyear=" + movieyear + ", movieclass="
				+ movieclass + ", movieimage=" + movieimage + ", moviesynopsis=" + moviesynopsis + "]";
	} 
	
	
	
	
	
	    
	
	} 