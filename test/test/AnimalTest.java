package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import core.Animal;
import core.Client;
import core.Session;

public class AnimalTest {
	private Client cliente;
	private Animal animal;
	private String nome;	
	private String raca;

    @Before
    public void setUp() {
    	this.nome = "Joao";
    	this.raca = "raca_teste";
    	this.cliente = new Client("nome", "endereco");
    	this.animal = new Animal(this.nome, this.raca, this.cliente);
    }
    @Test
    public void testConstructor() {
    	assertEquals(this.nome, this.animal.getName());
    	assertEquals(this.raca, this.animal.getAnimalType());
    	assertEquals(this.cliente, this.animal.getClient());
    }
    @Test
    public void addSession() {
    	ArrayList<Session> sessions = new ArrayList<Session>();

    	Session session1 = new Session(java.time.LocalDate.now(), this.cliente, "treatment1", "description1", this.animal);
    	this.animal.addSession(session1);
    	sessions.add(session1);
    	assertEquals(sessions, this.animal.getSessions());
    	
    	Session session2 = new Session(java.time.LocalDate.now(), this.cliente, "treatment2", "description2", this.animal);
    	this.animal.addSession(session2);
    	sessions.add(session2);
    	assertEquals(sessions, this.animal.getSessions());
    }
}
