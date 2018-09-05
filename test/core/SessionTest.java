package core;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Date;
import org.junit.*;

import core.Client;
import core.Animal;
import core.Session;

public class SessionTest {
	private Session session;	
	private Client client;
	private Animal animal;
	private LocalDate dateNow;
	private String sessionDescription;
	private String treatment;

    @Before
    public void setUp() {
    	this.sessionDescription = "A session description";
    	this.dateNow = java.time.LocalDate.now();
    	this.treatment = "Meu tratamento";
    	this.client = new Client("nome", "endereco");
    	this.animal = new Animal("rex", "pitbull", this.client);
    	this.session = new Session(this.dateNow, this.client, this.treatment, this.sessionDescription, this.animal);
    }
    @Test
    public void testConstructor() {
    	assertEquals(this.sessionDescription, this.session.getSessionDescription());
    	assertEquals(this.dateNow, this.session.getDate());
    	assertEquals(this.treatment, this.session.getTreatment());
    	assertEquals(this.client, this.session.getClient());
    	assertEquals(this.animal, this.session.getAnimal());
    }
    @Test
    public void testUpdateDescription() {
    	this.session.setSessionDescription("New description");
    	assertEquals("New description", this.session.getSessionDescription());
    }
}
