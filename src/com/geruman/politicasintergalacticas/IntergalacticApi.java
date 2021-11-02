package com.geruman.politicasintergalacticas;

import java.util.Date;

public class IntergalacticApi {

	public void inizializar() {
		System.out.println("Simulando complejas interacciones");
		
	}

	public Autorizacion pedirAutorizacionParaSobreTurno(Date fecha) {
		System.out.println("Simulacion sobre proceso de autorizacion");
		return new Autorizacion(true);
	}

}
