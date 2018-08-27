package test;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

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
    	assertArrayEquals(this.nome, this.cliente.getName());
    	assertArrayEquals(this.nome, this.cliente.getAddress());
    }
    @Test
    public void testSetAddress() {
    	this.cliente.setAddress("Numero 0");
    	assertArrayEquals("Numero 0", this.cliente.getAddress());
    }
    @Test
    public void addAnimal() {
    	Animal animal1 = new Animal("raca1", this.client, "nome1");
    	this.cliente.addAnimal("Numero 0");
    	assertArrayEquals("Numero 0", this.cliente.getAddress());
    }
}
