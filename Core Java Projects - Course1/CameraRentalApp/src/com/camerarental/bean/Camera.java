package com.camerarental.bean;

public class Camera {
private String brand;
private String model;
private float perDayPrice;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public float getPerDayPrice() {
	return perDayPrice;
}
public void setPerDayPrice(float perDayPrice) {
	this.perDayPrice = perDayPrice;
}
public Camera() {
	super();
	// TODO Auto-generated constructor stub
}
public Camera(String brand, String model, float perDayPrice) {
	super();
	this.brand = brand;
	this.model = model;
	this.perDayPrice = perDayPrice;
}
@Override
public String toString() {
	return "Camera [brand=" + brand + ", model=" + model + ", perDayPrice=" + perDayPrice + "]";
}

}
