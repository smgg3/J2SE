package com.test.immutableobjects;

public class Allergy {
	private String aName;
	private String aReporter;
	enum Severity{LOW,MEDIUM,HIGH}
	private Severity severity;
	public Allergy() {
		// TODO Auto-generated constructor stub
	}
	public String getaName() {
		return aName;
	}
	public String getaReporter() {
		return aReporter;
	}
	public Severity getSeverity() {
		return severity;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public void setaReporter(String aReporter) {
		this.aReporter = aReporter;
	}
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

}
