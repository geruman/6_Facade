package com.geruman.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

import com.geruman.politicasintergalacticas.PoliticasFacade;
import com.geruman.politicasintergalacticas.Turno;

class PoliticasIntergalacticasTest {

	@Test
	void test() {
		PoliticasFacade facade = new PoliticasFacade();
		String formatoFecha = "dd/MM/yyyy";
		SimpleDateFormat simpleDate = new SimpleDateFormat(formatoFecha);
		try {
			Turno turno = facade.pedirTurnoParaEl(simpleDate.parse("22/11/2132"));
			assert turno.getFecha().equals(simpleDate.parse("22/11/2132"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
