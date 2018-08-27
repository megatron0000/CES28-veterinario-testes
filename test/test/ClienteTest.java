package test;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import core.Animal;
import core.Client;

public class ClienteTest {
	private Client client;
	private String nome;	
	private String address;

    @Before
    public void setUp() {
    	this.nome = "Joao";
    	this.address = "Rua dos bobos";
    	client = new Client(this.nome, this.address);
    }
    @Test
    public void testConstructor() {
    	assertEquals(this.nome, this.client.getName());
    	assertEquals(this.nome, this.client.getAddress());
    }
    @Test
    public void testSetAddress() {
    	this.client.setAddress("Numero 0");
    	assertEquals("Numero 0", this.client.getAddress());
    }
    @Test
    public void addAnimal() {
    	Animal animal1 = new Animal("nome1", "raca1", this.client);

    	this.client.addAnimal(animal1);

    	ArrayList<Animal> animals = new ArrayList<Animal>();
    	animals.add(animal1);
    	
    	System.out.println(animals.size());
    	System.out.println(this.client.getAnimals().size());
    	
    	assertEquals(animals, this.client.getAnimals());
    	
    	Animal animal2 = new Animal("nome2", "raca2", this.client);
    	this.client.addAnimal(animal2);
    	animals.add(animal2);
    	assertEquals(animals, this.client.getAnimals());
    }
}
