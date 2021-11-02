package com.geruman.politicasintergalacticas;

import java.util.Date;

public class PoliticasFacade {

	public Turno pedirTurnoParaEl(Date fecha) {
		SenadoIntergalactico senado = SenadoIntergalactico.getInstance();
		Boolean hayFechaLibre = senado.hayFechaDisponiblePara(fecha);
		if(hayFechaLibre) {
			return new Turno(fecha);
		}else {
			return senado.forzarSobreTurnoPara(fecha);
			
		}
	}
	
}
