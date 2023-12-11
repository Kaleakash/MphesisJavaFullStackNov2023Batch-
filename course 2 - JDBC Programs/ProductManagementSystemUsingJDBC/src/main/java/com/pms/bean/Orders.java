package com.pms.bean;

public class Orders {
private int oid;
private int pid;
private String orderdate;
private float totalprice;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getOrderdate() {
	return orderdate;
}
public void setOrderdate(String orderdate) {
	this.orderdate = orderdate;
}
public float getTotalprice() {
	return totalprice;
}
public void setTotalprice(float totalprice) {
	this.totalprice = totalprice;
}
public Orders() {
	super();
	// TODO Auto-generated constructor stub
}
public Orders(int oid, int pid, String orderdate, float totalprice) {
	super();
	this.oid = oid;
	this.pid = pid;
	this.orderdate = orderdate;
	this.totalprice = totalprice;
}
@Override
public String toString() {
	return "Orders [oid=" + oid + ", pid=" + pid + ", orderdate=" + orderdate + ", totalprice=" + totalprice + "]";
}

}
