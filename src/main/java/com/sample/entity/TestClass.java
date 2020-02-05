package com.sample.entity;


public class TestClass {

	public String name;
	public String value;
	
	public TestClass() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public TestClass(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	
	
}
