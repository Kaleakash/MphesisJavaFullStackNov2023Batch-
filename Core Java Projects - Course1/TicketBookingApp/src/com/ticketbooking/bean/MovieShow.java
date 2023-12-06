package com.ticketbooking.bean;

import java.util.Arrays;

public class MovieShow {
private String showDate;
private MovieShowInfo movieShowInfo[]=new MovieShowInfo[4];
public MovieShow() {
	MovieShowInfo msi1= new MovieShowInfo("9am",40,200);
	MovieShowInfo msi2= new MovieShowInfo("2am",60,150);
	MovieShowInfo msi3= new MovieShowInfo("6am",45,350);
	MovieShowInfo msi4= new MovieShowInfo("11am",55,600);
	movieShowInfo[0]=msi1;
	movieShowInfo[1]=msi2;
	movieShowInfo[2]=msi3;
	movieShowInfo[3]=msi4;
}
public String getShowDate() {
	return showDate;
}
public void setShowDate(String showDate) {
	this.showDate = showDate;
}
public MovieShowInfo[] getMovieShowInfo() {
	return movieShowInfo;
}
public void setMovieShowInfo(MovieShowInfo[] movieShowInfo) {
	this.movieShowInfo = movieShowInfo;
}
@Override
public String toString() {
	return "MovieShow [showDate=" + showDate + ", movieShowInfo=" + Arrays.toString(movieShowInfo) + "]";
}

}
