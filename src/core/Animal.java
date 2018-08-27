package core;

import java.time.LocalDate;
import java.util.ArrayList;

public class Animal {
	private String name;
	private String animaltype;
	private Client client;
	private ArrayList<Session> sessions;
	
	public Animal(String name, String animaltype, Client client) {
		this.name = name;
		this.animaltype = animaltype;
		this.client = client;
		this.sessions = new ArrayList<Session>();
	}
	
	public void addSession(Session session) {
		this.sessions.add(session);
	}
	
	public String getName() {
		return this.name;
	}
	
	public Client getClient() {
		return this.client;
	}
	
	public String getAnimalType() {
		return this.animaltype;
	}
	
	public ArrayList<Session> getSessions() {
		return this.sessions;
	}
}
