package com.ticketbooking.bean;

public class MovieShowInfo {
	private String showTime;
	private int numberOfSeats;
	private int amount;
	
	public MovieShowInfo(String showTime, int numberOfSeats, int amount) {
		super();
		this.showTime = showTime;
		this.numberOfSeats = numberOfSeats;
		this.amount = amount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public MovieShowInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieShowInfo(String showTime, int numberOfSeats) {
		super();
		this.showTime = showTime;
		this.numberOfSeats = numberOfSeats;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	@Override
	public String toString() {
		return "MovieShowInfo [showTime=" + showTime + ", numberOfSeats=" + numberOfSeats + ", amount=" + amount + "]";
	}
	
}
