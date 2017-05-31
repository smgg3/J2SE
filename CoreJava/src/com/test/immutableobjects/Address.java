package com.test.immutableobjects;

public class Address {
	private String street;
	private String city;
	private String state;
	private String country;
	private String zip;
	
	
	public Address(String street, String city, String state, String country, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}

	public String toString(){
		return street+" \n "+city+", "+state+", "+country+"-"+zip;
	}

	public static void main(String[] args) {
		Address p=new Address("Apt#211, 811 E Armour Blvd","Kansas City","MO","USA","64109");
		System.out.println(p.toString());

	}

}
