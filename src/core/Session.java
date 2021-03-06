package core;

import java.time.LocalDate;

public class Session {
	private LocalDate date;	
	private Client client;
	private String treatment;
	private String sessiondescription;
	private Animal animal;
	
	public Session(LocalDate date, Client client, String treatment, String sessiondescription, Animal animal) {
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
	
	public Client getClient() {
		return this.client;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
}
