package com.test.immutableobjects;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class PatientReport {

	public PatientReport() {
		// TODO Auto-generated constructor stub
	}
	public static Patient setPatient(int id){
		Patient p=new Patient();
		p.setpId(id);
		p.setName("Jhon");
		ZonedDateTime z=new Time().getDOB();
		//LocalDateTime d=LocalDateTime.of(z.getYear(),z.getMonth(),z.getDayOfMonth(),z.getHour(),z.getMinute());
		LocalDateTime d=LocalDateTime.of(1994,Month.APRIL,5,12,00);
		p.setDob(d);
		p.setAge(23);
		p.setAddress(new Address("Apt#211, 811 E Armour Blvd","Kansas City","MO","USA","64109"));
		p.setGender(Patient.Gender.FEMALE);
		p.setPhoneNumber("(+1)913-375-7372");
		List<Allergy> l = new ArrayList<>();
		Allergy a1=new Allergy();
		a1.setaName("Rashes");
		a1.setSeverity(Allergy.Severity.MEDIUM);
		a1.setaReporter("NURSE");
		l.add(a1);
		Allergy a2=new Allergy();
		a2.setaName("Burning");
		a2.setSeverity(Allergy.Severity.HIGH);
		a2.setaReporter("Doctor");
		l.add(a2);
		p.setAllergyList(l);
		List<Disease> dlist=new ArrayList<>();
		Disease di1=new Disease();
		di1.setdName("SkinAllergy");
		dlist.add(di1);
		Disease di2=new Disease();
		di2.setdName("Eye Problem");
		dlist.add(di2);
		p.setDiseaseList(dlist);
		
		return p;
	}
	public static void main(String[] args) {
		//HashSet<Patient> s;
		Map<Integer,Patient> set = new HashMap<>();
		Set<Patient> set1=new HashSet<>();
 		setPatient(1);
		set.put(1, setPatient(1));
		set1.add(setPatient(1));
		System.out.println(set.get(1).getAllergyList().get(1).getaName());
		set.get(1).displayAllergy(set.get(1).getAllergyList());
		set.get(1).displayDisease(set.get(1).getDiseaseList());

	}

}
