package com.geruman;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.geruman.politicasintergalacticas.PoliticasFacade;
import com.geruman.politicasintergalacticas.Turno;

public class FacadeDemoMain {
	
	public static void main(String[] args) {
		PoliticasFacade politicas = new PoliticasFacade();
		String formato = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		
		try {
			Turno turno1 = politicas.pedirTurnoParaEl(sdf.parse("12/10/2134"));
			Turno turno2 = politicas.pedirTurnoParaEl(sdf.parse("03/03/2135"));
			Turno turno3 = politicas.pedirTurnoParaEl(sdf.parse("04/02/2142"));
			Turno turno4 = politicas.pedirTurnoParaEl(sdf.parse("15/05/2112"));
			System.out.println(turno1);
			System.out.println(turno2);
			System.out.println(turno3);
			System.out.println(turno4);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
