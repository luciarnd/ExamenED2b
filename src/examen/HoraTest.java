package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HoraTest {
	
	Hora h = new Hora();

	@Test
	void CP1() {
		boolean res = h.validarHora(37, 32, -1);
		assertFalse(res);
	}
	
	@Test
	void CP2() {
		boolean res = h.validarHora(48, 34, 27);
		assertFalse(res);
	}
	
	@Test
	void CP3() {
		boolean res = h.validarHora(41, 63, 20);
		assertFalse(res);
	}

	@Test
	void CP4() {
		boolean res = h.validarHora(28, 53, 9);
		assertTrue(res);
	}


}
