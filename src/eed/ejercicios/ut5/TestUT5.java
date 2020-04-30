package eed.ejercicios.ut5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestUT5 {

	@Test
	void testIngresar() throws Exception {
		Account account = new Account(10);
	    double cantidad=1;
	    account.ingresar(cantidad);
	    double esperado=11;
	    double obtenido=account.getBalance();
	    assertEquals(esperado, obtenido);
	}

	@Test
	void testRetirar() throws Exception {
		Account account = new Account(10);
	    double cantidad=1;
	    account.retirar(cantidad);
	    double esperado=9;
	    double obtenido=account.getBalance();
	    assertEquals(esperado, obtenido);
	}
}
