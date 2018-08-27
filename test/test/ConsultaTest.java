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
	
    @BeforeClass
    public static void setUpClass() {
// code executed before all test methods
    }
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
    	assertArrayEquals(sessionDescription, consulta.getSessionDescription());
    	assertArrayEquals(dateNow, consulta.getDate());
    	assertArrayEquals(treatment, consulta.getTreatment());
    	assertArrayEquals(cliente, consulta.getClient());
    }
    @Test
    public void testUpdateDescription() {

    }
    @After
    public void tearDown() {
// code executed after each test method
    }
    @AfterClass
    public static void tearDownClass() {
// code executed after all test methods
    }
}
