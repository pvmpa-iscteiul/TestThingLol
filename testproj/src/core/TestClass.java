package core;

import java.util.ArrayList;

public class TestClass {
	private double stupidity;
	private ArrayList<String> hopes_and_dreams = new ArrayList<String>();
	
	public TestClass(){
		stupidity = 100;
		hopes_and_dreams.add("Be a good object");
	}
	
	public TestClass(double arg0){
		stupidity = arg0;
		hopes_and_dreams.add("Be as stupid as the user tells him to be");
	}
	
	
}
