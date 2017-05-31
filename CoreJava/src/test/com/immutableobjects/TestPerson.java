package test.com.immutableobjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;



public class TestPerson {
	public static void main(String[] args) {
	        Person p=new Person(1,"sravani");
	        System.out.println(p.getId()+" "+p.getName()+" "+p.getDate());
	        System.out.println(p.toString());
	        try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        p=new Person(1,"sai");
	        System.out.println(p.getId()+" "+p.getName()+" "+p.getDate());
	        System.out.println(p.toString());
	        System.out.println(p.getAge());
       

	}

}
