package com.test.collections;
import java.util.ArrayList;
import java.util.Comparator;
class ObjectsSort implements Comparable<ObjectsSort>{
	private String r_num;
	private int price;

	public ObjectsSort(String s){
		this.r_num=s;
		}
	

	public String getR_num() {
		return r_num;
	}

	public void setR_num(String r_num) {
		this.r_num = r_num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
//	@Override
//	public int hashCode() {
//		
//		return this.r_num.hashCode();
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj!=null && obj instanceof ObjectsSort ){
//			String regnum=((ObjectsSort)obj).getR_num();
//			if(regnum!=null & regnum.equals(this.r_num)){
//				return true;}
//		}
//		
//			return false;
//		
//	}
//
//
//	@Override
//	public String toString() {
//		return this.r_num;
//	}


	@Override
	public int compareTo(ObjectsSort o) {
		if(this.getPrice()>o.price)
			return -1;
		else if(this.getPrice()<o.price)
			return 1;
		else
			return 0;
		
	}

}