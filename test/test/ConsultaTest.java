package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Date;
import org.junit.*;

import core.Client;
import core.Animal;
import core.Session;

public class ConsultaTest {
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
    	this.consulta = new Consulta(this.sessionDescription, this.dateNow, this.cliente, this.treatment, this.animal);
    }
    @Test
    public void testConstructor() {
    	assertEquals(this.sessionDescription, this.consulta.getSessionDescription());
    	assertEquals(this.dateNow, this.consulta.getDate());
    	assertEquals(this.treatment, this.consulta.getTreatment());
    	assertEquals(this.cliente, this.consulta.getClient());
    	assertEquals(this.animal, this.consulta.getClient());
    }
    @Test
    public void testUpdateDescription() {
    	this.consulta.setSessionDescription("New description");
    	assertEquals("New description", this.consulta.getSessionDescription());
    }
}
