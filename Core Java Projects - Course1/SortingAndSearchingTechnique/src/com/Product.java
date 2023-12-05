package com;

public class Product implements Comparable<Product>{
private int pid;
private String pname;
private float price;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
	public int compareTo(Product o) {
	System.out.println("Hi");
		//return 0;
//	if(this.pid>o.pid) {
//		return 1;
//	}else {
//		return -1;
//	}
	//return this.pid-o.pid;		// +ve, -ve or zero asc 
	//return o.pid-this.pid;		// +ve, -ve or zero desc
	//return this.pname.compareTo(o.pname);			// asc 
	//return o.pname.compareTo(this.pname);			// desc 
	//return (int)(this.price-o.price);				//  asc 
	return (int)(o.price-this.price);				//  asc 
	}
public Product(int pid, String pname, float price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
}

}
