package com.qa.person;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private int age;
	private String job;
	private ArrayList<Person> people = new ArrayList<Person>();
	
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

	
	public ArrayList<Person> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}
	
	public void addPerson(Person x) {
		this.people.add(x);
	}
	
	public void removePerson(Person x) {
		this.people.remove(x);
	}

	@Override
	public String toString() {
		return "Person \n------ \n  Name: " + name + "\n   Age: " + age + "\n   Job: " + job + "\n";
	}

	
	public boolean searchName(String x) {
		
		boolean tru = false;
		
		for( Person p: people) {
			if (p.name.equals(x)) {
				tru = true;
			}
		}
		return tru;	
	}
	
	public void showList () {
		for (Person p: people) {
			System.out.println(p);
	}
	}
	
	
	
}
