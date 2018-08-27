package core;

import java.awt.List;
import java.time.LocalDate;

public class Animal {
	private String name;
	private String animaltype;
	private Client client;
	private List<Session> sessions;
	
	public Animal(String name, String animaltype, Client client, Session session) {
		this.name = name;
		this.animaltype = animaltype;
		this.client = client;
		this.sessions = new List<Session>();
	}
	
	public void addSession(Session session) {
		this.sessions.add(session);
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
