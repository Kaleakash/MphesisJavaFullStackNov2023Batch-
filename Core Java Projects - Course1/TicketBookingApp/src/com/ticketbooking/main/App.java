package com.ticketbooking.main;

import com.ticketbooking.service.MovieShowService;

public class App {

	public static void main(String[] args) {
	MovieShowService ms = new MovieShowService();
	//ms.showMoviewAndSeatInfo();
	ms.searchMoviInfoByDate("7-Dec");
	}

}
