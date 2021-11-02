package com.geruman.politicasintergalacticas;

import java.util.Date;

public class Turno {
	private Date fecha;
	private Boolean esSobreTurno;
	public Boolean getEsSobreTurno() {
		return esSobreTurno;
	}
	public void setEsSobreTurno(Boolean esSobreTurno) {
		this.esSobreTurno = esSobreTurno;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Turno(Date fecha) {
		this.fecha = fecha;
		this.esSobreTurno = false;
	}
	@Override
	public String toString() {
		return this.fecha.toString()+" Es sobreturno: "+esSobreTurno;
	}
}
