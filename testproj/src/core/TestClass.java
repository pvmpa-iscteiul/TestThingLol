package core;

import java.util.ArrayList;

public class TestClass {
	private double stupidity;
	private String stupidity_name = stupidity + "% stupid Test Class";
	private String personal_name;
	private ArrayList<String> hopes_and_dreams = new ArrayList<String>();
	
	public TestClass(){
		stupidity = 100;
		hopes_and_dreams.add("Be a good object");
		setPersonal_name("Generic Test Class");
	}
	
	public TestClass(double arg0){
		stupidity = arg0;
		hopes_and_dreams.add("Be as stupid as the user tells him to be");
	}

	public String getStupidity_name() {
		return stupidity_name;
	}

	public String getPersonal_name() {
		return personal_name;
	}

	public void setPersonal_name(String personal_name) {
		this.personal_name = personal_name;
	}
	
	
}
