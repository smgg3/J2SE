package com.test.immutableobjects;


import java.time.*;
import java.util.TimeZone;

public class Time {
	//OffsetDateTime s;
	private LocalDateTime dob;
	public Time() {
		//s=OffsetDateTime.of(LocalDateTime.now(),ZoneOffset.of("+05:00"));
		dob=LocalDateTime.now(ZoneId.of("UTC"));
	}
	public ZonedDateTime getDOB(){
		ZoneId timezone=ZoneId.of(TimeZone.getDefault().getID());
		ZonedDateTime dn=ZonedDateTime.of(dob,timezone);
		System.out.println("DOB is : "+dn);
		return dn;
	}
	public void setDOB(LocalDateTime dob){
		this.dob=dob;
		
	}
	public String getAge(LocalDateTime k){
		
		int age=(k.getYear()-dob.getYear());
		int month=k.getMonthValue()-dob.getMonthValue();
		int days=k.getDayOfMonth()-dob.getDayOfMonth();
		if(month<0){
			age--;
			month=12+month;
		};
		if(days<0){
			month--;
			days=30+days;
		}
		System.out.println("Age is "+age+" years "+month+" months "+days+" days");
		return "Age is "+age+" years "+month+" months "+days+" days";
		
	}
	public static void main(String[] args) {
		Time t=new Time();
		
		LocalDateTime k=LocalDateTime.of(2020,Month.JANUARY,14,20,30);
		int age=(k.getYear()-t.getDOB().getYear());
		int month=k.getMonthValue()-t.getDOB().getMonthValue();
		int days=k.getDayOfMonth()-t.getDOB().getDayOfMonth();
		if(month<0){
			age--;
			month=12+month;
		};
		if(days<0){
			month--;
			days=30+days;
		}
		System.out.println("Age is "+age+" years "+month+" months "+days+" days");
		System.out.println(t.getAge(k));
		
		
		
		
//		System.out.println(t.s);
//		LocalDateTime k=LocalDateTime.of(t.s.getYear(),t.s.getMonth(),t.s.getDayOfMonth(),t.s.getHour(),t.s.getMinute());
//		System.out.println("UTC time"+k);
//		LocalDateTime date=t.s.toLocalDateTime();
//		System.out.println(date);
//		ZoneId america=ZoneId.of("America/New_York");
//		ZonedDateTime d=ZonedDateTime.of(date, america);
//		System.out.println(d);
//		System.out.println(TimeZone.getTimeZone("UTC"));
//		System.out.println(TimeZone.getDefault().getID());
//		LocalDateTime utc = LocalDateTime.now(ZoneId.of("UTC"));
//		System.out.println(utc);
//		ZoneId n=ZoneId.of(TimeZone.getDefault().getID());
//		ZonedDateTime dn=ZonedDateTime.of(utc,n);
//		System.out.println(dn);
		
	}

}
