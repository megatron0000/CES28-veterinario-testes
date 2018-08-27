package test;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import core.Animal;
import core.Client;

public class ClienteTest {
	private Client cliente;
	private String nome;	
	private String address;

    @Before
    public void setUp() {
    	this.nome = "Joao";
    	this.address = "Rua dos bobos";
    	cliente = new Client(this.nome, this.address);
    }
    @Test
    public void testConstructor() {
    	assertEquals(this.nome, this.cliente.getName());
    	assertEquals(this.nome, this.cliente.getAddress());
    }
    @Test
    public void testSetAddress() {
    	this.cliente.setAddress("Numero 0");
    	assertEquals("Numero 0", this.cliente.getAddress());
    }
    @Test
    public void addAnimal() {
    	ArrayList<Animal> animals = new ArrayList<Animal>();
    	
    	Animal animal1 = new Animal("nome1", "raca1", this.cliente);
    	this.cliente.addAnimal(animal1);
    	animals.add(animal1);
    	assertEquals(animals, this.cliente.getAnimals());
    	
    	Animal animal2 = new Animal("nome2", "raca2", this.cliente);
    	this.cliente.addAnimal(animal2);
    	animals.add(animal2);
    	assertEquals(animals, this.cliente.getAnimals());
    }
}
