package core;

import java.time.LocalDate;

public class Animal {
	private String name;
	private String animaltype;
	private Client client;
	private Session[] sessions;
	
	public Animal(String name, String animaltype, Client client,  ) {
		this.date = date;
		this.client = client;
		this.treatment = treatment;
		this.sessiondescription = sessiondescription;
		this.animal = animal;
	}
	
	public void setSessionDescription(String sessiondescription) {
		this.sessiondescription = sessiondescription;
	}
	
	public Animal getAnimal() {
		return this.animal;
	}
	
	public String getSessionDescription() {
		return this.sessiondescription;
	}
	
	public String getTreatment() {
		return this.treatment;
	}
	
	public String getClient() {
		return this.client;
	}
}
