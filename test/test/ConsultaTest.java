package test;

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
    	sessionDescription = "A session description";
    	dateNow = java.time.LocalDate.now();
    	treatment = "Meu tratamento";
    	cliente = new Client("nome", "endereco");
    	animal = new Animal("raca", cliente, "nome");
    	consulta = new Consulta(sessionDescription, dateNow, cliente, treatment, animal);
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
