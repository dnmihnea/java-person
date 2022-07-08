package com.qa.person;

public class Person {

	private String name;
	private int age;
	private String job;
	
	public Person () {
	}
	
	public Person (String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person \n------ \n  Name: " + name + "\n   Age: " + age + "\n   Job: " + job + "\n";
	}
	
	public boolean searchName(String x) {
		
		boolean tru = false;
		
		if (this.name.equals(x)) {
			tru = true;
		}
		
		return tru;
		
	}
	
	
	
}
