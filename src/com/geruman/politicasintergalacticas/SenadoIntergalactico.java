package com.geruman.politicasintergalacticas;

import java.util.Date;
import java.util.Random;

public class SenadoIntergalactico {
	private static SenadoIntergalactico instance;
	public static SenadoIntergalactico getInstance() {
		if(instance==null) {
			instance = new SenadoIntergalactico();
		}
		return instance;
	}
	private SenadoIntergalactico() {
		
	}
	public Boolean hayFechaDisponiblePara(Date fecha) {
		Random r = new Random();
		int randomInt = r.nextInt(0, 100);
		System.out.println("Simulando complejas interacciones para verificar fecha disponible");
		System.out.println("Randomizado un:"+randomInt);
		if(randomInt>50) {
			return false;
		}
		return true;
	}
	public Turno forzarSobreTurnoPara(Date fecha, Autorizacion autorizacion) {
		System.out.println("Verificar que esta autorizado el sobreturno..."+autorizacion.autorizada);
		Turno turno = new Turno(fecha);
		turno.setEsSobreTurno(true);
		return turno;
	}
	
}
