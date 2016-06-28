package com.example.java8.interfaces.defaultmethods;

public interface PersonInterface {
	
	String getName();
	void setName(String name);
	int getAge();
	void setAge(int age);

	default String getInfo(){
		return  getName() + " " + getAge();
	}
	
}
