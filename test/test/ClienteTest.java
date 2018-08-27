package test;

import java.time.LocalDate;

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
    	Animal animal1 = new Animal("nome1", "raca1", this.cliente);
    	this.cliente.addAnimal(animal1);
    	
    	assertEquals(animal1, this.cliente.getAnimals());
    	this.cliente.addAnimal(animal2);
    	assertEquals(animal1, this.cliente.getAnimals());

    }
}
