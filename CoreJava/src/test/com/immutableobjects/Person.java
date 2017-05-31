package test.com.immutableobjects;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public final class Person {
	private final Integer id;//immutable object
	private final String name;//immutable object
	private final Date date;
	//private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	private String age;
	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.date = new Date();
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public Date getDate(){
		return new Date(date.getTime());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+getDate();
	}
	public String getAge() {
	    System.out.println(sdf.format(date));
	    LocalDate now = LocalDate.now();
	    System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(now));
	   int year=now.getYear()-date.getYear()-1900;
	   int months=now.getMonthValue()-date.getMonth();
	   int days=now.getDayOfMonth()-date.getDay();
	//   int hours=now.-date.getHours();
	//   int minutes=now.getMinute()-date.getMinutes();
	//   int seconds=now.getSecond()-date.getSeconds();
	   age=year+"years"+months+"months"+days+"days";//+hours+"hours"+minutes+"minutes"+seconds+"seconds";
	return age;
	}
	
}


