package com.test.immutableobjects;

public class Temp {
	private String pName;
	private int pId;
	enum Place{ARMPIT,MOUTH,EAR};
	private Place place;
	private double defaultTemp;
	private double celcius;
	public String getpName() {
		return pName;
	}
	public int getpId() {
		return pId;
	}
	public Place getPlace() {
		return place;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getDefaultTemp() {
		return defaultTemp;
	}
	public double getCelcius() {
		return celcius;
	}
	public void setDefaultTemp(double defaultTemp) {
		this.defaultTemp = defaultTemp;
	}
	public void setCelcius(double celcius,int flag) {
		if(flag==1)
			this.celcius = celcius;
		else
			this.celcius=(double)5/9*(celcius-32);
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	public double getFahrenheit(){
		return ((double)9/5*celcius)+32;
	}
	public static void main(String [] args){
		Temp t=new Temp();
		t.setpName("Jhon");
		t.setpId(1);
		t.setDefaultTemp(0);
		t.setPlace(Temp.Place.ARMPIT);
		t.setCelcius(35, 1);
		System.out.println("Celcius : "+t.getFahrenheit()+"\nFahrenheit : "+t.getCelcius());
		
	}
	

}
