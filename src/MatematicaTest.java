import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MatematicaTest {

	@Test
	public void sumaTest() {
		
		Matematica matematica = new Matematica();
		int resultado = matematica.suma(5, 3);
		
		int resultadoEsperado = 8;
		
		assertEquals(resultado, resultadoEsperado);
	}
	
	@Test
	public void mayorTest(){
		Matematica matematica = new Matematica();
		boolean mayor = matematica.mayor(5, 4);
		
		assertTrue(mayor);
	}
	
	@Test
	public void sumasTest(){
		Matematica matematica = new Matematica();
		
		matematica.suma(5, 5);
		matematica.suma(10, 6);
		
		ArrayList<Integer> sumas = matematica.sumas();
		
		assertNotNull(sumas);
	
	}

}
