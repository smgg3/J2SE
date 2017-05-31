package com.test.immutableobjects;
import java.time.*;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Patient {
	private String name;
	private int pId;
	private int age;
	private LocalDateTime dob;
	private List<Allergy> allergyList;
	private List<Disease> diseaseList;
	private Address address;
	private String phoneNumber;
	enum Gender{FEMALE,MALE}
	private Gender gender;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public List<Allergy> getAllergyList() {
		return allergyList;
	}
	public List<Disease> getDiseaseList() {
		return diseaseList;
	}
	public Address getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public Gender getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public void setAllergyList(List<Allergy> allergyList) {
		this.allergyList = allergyList;
	}
	public void setDiseaseList(List<Disease> diseaseList) {
		this.diseaseList = diseaseList;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void displayAllergy(List<Allergy> allergyList){
		ListIterator<Allergy> i=allergyList.listIterator();
		System.out.print(this.name+" has ");
		if(allergyList.isEmpty()) System.out.println("no allergies");
		else
		while(i.hasNext()){
			System.out.print(i.next().getaName()+"  ");
		}
		System.out.println(" Allergies");	
		
	}
	public void displayDisease(List<Disease> list){
		ListIterator<Disease> i=list.listIterator();
		System.out.print(this.name+" has ");
		if(list.isEmpty()) System.out.println("no allergies");
		else
		while(i.hasNext()){
			System.out.print(i.next().getdName()+"  ");
		}
		System.out.println(" Diseases");	
		
	}
	
}
