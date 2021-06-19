package Teste;

import static org.junit.Assert.*;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import TelaPrincipal.Main;

public class TesteMain {
	Main verificarValorProduto;
	@Before
	public void setUp() throws Exception {
		verificarValorProduto = new Main();
	}

	@Test
	public void test() {
		double total = 0.0; 
		boolean clienteVIP = false;
		
		if (clienteVIP) {   
            total *= 0.90;   }
        else {    total *= 0.95;   }     
        
        DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();   
        if (diaSemana == DayOfWeek.SUNDAY) {   
            total += 10.00;   } 
        else {    total += 5.00;   } 
        assertEquals(total);
        
	
	}

	private void assertEquals(double total) {
		// TODO Auto-generated method stub
		
	}
}