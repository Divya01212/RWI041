package com.springboot;

public class Address {
private int rno;
private String city;
private long pincode;
public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getPincode() {
	return pincode;
}
public void setPincode(long pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [rno=" + rno + ", city=" + city + ", pincode=" + pincode + "]";
}

}
