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
		Person person = new Person();
		
		person.addPerson(john);
		person.addPerson(claire);
		person.addPerson(dustin);
		person.addPerson(amber);
		person.addPerson(kevin);
		person.removePerson(john);
		
		person.showList();
		
		System.out.println(person.searchName("John"));

		
	}

}
