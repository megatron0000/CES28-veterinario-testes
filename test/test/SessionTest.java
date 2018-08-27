package test;

import java.time.LocalDate;
import java.util.Date;
import org.junit.*;

import core.Client;
import core.Animal;
import core.Session;

public class SessionTest {
	private Session consulta;	
	private Client cliente;
	private Animal animal;
	private LocalDate dateNow;
	private String sessionDescription;
	private String treatment;

    @Before
    public void setUp() {
    	this.sessionDescription = "A session description";
    	this.dateNow = java.time.LocalDate.now();
    	this.treatment = "Meu tratamento";
    	this.cliente = new Client("nome", "endereco");
    	this.animal = new Animal("rex", "pitbull", this.cliente);
    	this.consulta = new Session(this.sessionDescription, this.dateNow, this.cliente, this.treatment, this.animal);
    }
    @Test
    public void testConstructor() {
    	assertArrayEquals(this.sessionDescription, this.consulta.getSessionDescription());
    	assertArrayEquals(this.dateNow, this.consulta.getDate());
    	assertArrayEquals(this.treatment, this.consulta.getTreatment());
    	assertArrayEquals(this.cliente, this.consulta.getClient());
    	assertArrayEquals(this.animal, this.consulta.getClient());
    }
    @Test
    public void testUpdateDescription() {
    	this.consulta.setSessionDescription("New description");
    	assertArrayEquals("New description", this.consulta.getSessionDescription());
    }
}
