package com.qa.person;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Person john = new Person ("John", 35, "Doctor");
		Person claire = new Person("Claire", 26, "Systems Administrator");
		Person dustin = new Person("Dustin", 22, "Retail Assistant");
		Person amber = new Person("Amber", 39, "Architect");
		Person kevin = new Person("Kevin", 41, "Lawyer");
		
		List<Person> people = new ArrayList<>();
		
		people.add(john);
		people.add(claire);
		people.add(dustin);
		people.add(amber);
		people.add(kevin);
		
		boolean ok = false;
		for(Person p: people) {
			if (p.searchName("Kevin")) {
				ok = true;
			}
			System.out.println(p);
		}
		if (ok) {
			System.out.println("The person you are looking for is in this list.");
		} else {
			System.out.println("The person you are looking for isn't here.");
		}
	}

}
