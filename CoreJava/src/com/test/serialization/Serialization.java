package com.test.serialization;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s1=new Student(1,"sai",20);
		File f=new File("C://Users//Sravani Chowdary//Documents//GitHub//Sravani//CoreJava//src//com//test//serialization//object.txt");
		if(!f.exists())
			f.createNewFile();
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(f));
		os.writeObject(s1);
		os.close();
		System.out.println(s1);
		ObjectInputStream is=new ObjectInputStream(new FileInputStream(f));
		Student s2=(Student) is.readObject();
		is.close();
		System.out.println(s2);
		
		File f2=new File("C://Users//Sravani Chowdary//Documents//GitHub//Sravani//CoreJava//src//com//test//serialization//externalobject.txt");
		if(!f2.exists())
			f2.createNewFile();
		Teacher t=new Teacher(30,"sravani");
		os=new ObjectOutputStream (new FileOutputStream(f2));
		os.writeObject(t);
		os.close();
		is=new ObjectInputStream(new FileInputStream(f2));
		Teacher t2=(Teacher) is.readObject();
		
		is.close();
		System.out.println(t2);

	}

}
class Student implements Serializable{
	transient int id;
	String name;
	int age;
	Student(int id,String name,int age){
		super();
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@override
	private void writeObject(ObjectOutputStream stream) throws IOException{
		stream.writeObject(age);
		stream.writeObject(name);
	}
	
	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException{
		this.age=(int) stream.readObject();
		this.name=(String) stream.readObject();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+age+" "+name+" "+this.hashCode();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class Teacher implements Externalizable{
	int age;
	String name;
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public void writeExternal(ObjectOutput o) throws IOException{
		o.writeInt(age);
		o.writeUTF(name);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void readExternal(ObjectInput o) throws IOException,ClassNotFoundException{
	
		age=o.readInt();
		name=o.readUTF();
	}
	
}