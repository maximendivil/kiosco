package clases;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Periodo {
	//Variables de instancia
	@Id
	private long id;
	private String periodo;
	@OneToMany(mappedBy="periodo")
	private List<Recaudacion> recaudaciones;
	@OneToMany(mappedBy="periodo")
	private List<Turno> turnos;
	
	//Constructores
	public Periodo() {
		// TODO Auto-generated constructor stub
	}
	public Periodo(String periodo){
		this.periodo = periodo;
		this.recaudaciones = new ArrayList<Recaudacion>();
		this.turnos = new ArrayList<Turno>();
	}
		
	//Getters y setters
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public List<Recaudacion> getRecaudaciones() {
		return recaudaciones;
	}
	public void setRecaudaciones(List<Recaudacion> recaudaciones) {
		this.recaudaciones = recaudaciones;
	}
	public List<Turno> getTurnos() {
		return turnos;
	}
	public void setTurnos(List<Turno> turnos) {
		this.turnos = turnos;
	}
}
