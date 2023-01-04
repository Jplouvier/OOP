package oop;

public class Trainee {
	
	public String name;
	
	public int age;
	
	public String study;
	
	public boolean programmingExperience;
	
	public String programmingLanguage;

	public void printPersonalInfo() { 
		System.out.println("Naam is "+ name + " Leeftijd is " + age +" Studie is "+ study);
	}
	public void printProgrammingExperience() {
		System.out.println("Programmeerervaring " + programmingExperience + " Programmeertaal " + programmingLanguage);		
	}
	
	public int increaseAge(int increase) {
		age = age + increase;	
		return age;	
	}
	
	public void changeLanguage(String newLanguage) {
		programmingLanguage = newLanguage;
		}
	
	public String addLanguage(String extraLanguage) {
		programmingLanguage = programmingLanguage + extraLanguage;
		
		return programmingLanguage;
	}
	
	
	public Trainee() {
		
	}
	public Trainee(String newName) {
		name = newName;
	}
	
	public Trainee(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
}

