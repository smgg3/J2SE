package com.test.collections;

public class HashSetMethods {

	private int contactId;
	private String name;
	private String phoneNumber;
	
	
	public HashSetMethods(int contactId,String name,String phoneNumber) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contactId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	//	return 12*contactId+name.hashCode()+phoneNumber.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashSetMethods other = (HashSetMethods) obj;
		if (contactId != other.contactId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name)) 
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "HashSetMethods [contactId=" + contactId + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
		}


	public int getContactId() {
		return contactId;
	}


	public void setContactId(int contactId) {
		this.contactId = contactId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public static void main(String[] args) {
		

	}

}
