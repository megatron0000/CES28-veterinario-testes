package test;

import java.time.LocalDate;
import java.util.Date;
import org.junit.*;

public class ConsultaTest {
	private Consulta consulta;	
	private Client client;
	private Animal animal;
	private LocalDate dateNow;
	private String content;
	private String tratamento;
	
    @BeforeClass
    public static void setUpClass() {
// code executed before all test methods
    }
    @Before
    public void setUp() {
    	content = "meu animal Info";
    	dateNow = java.time.LocalDate.now();
    	tratamento = "Meu tratamento";
    	client = new Client("nome", "endereco");
    	animal = new Animal("raca", client, "nome");
    	consulta = new Consulta(content, dateNow, client, treatment, animal);
    }
    @Test
    public void testAdd() {
// test method
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
