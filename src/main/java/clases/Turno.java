package clases;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Turno {
	//Variables de instancia
	@Id
	private long id;
	private Date fecha;
	@ManyToMany(mappedBy="turnos")
	private List<Persona> personas;
	@OneToOne(optional=false)
	private Recaudacion recaudado;
	@ManyToOne(optional=false)
	@JoinColumn(name="PERIODO_ID")
	private Periodo periodo;
	
	//Constructores
	public Turno() {
		
	}
	public Turno(Date fecha){
		this.fecha = fecha;
		this.personas = new ArrayList<Persona>();
		this.recaudado = new Recaudacion();
	}
	
	//Getters y setters
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public List<Persona> getPersonas() {
		return personas;
	}
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	public Recaudacion getRecaudado() {
		return recaudado;
	}
	public void setRecaudado(Recaudacion recaudado) {
		this.recaudado = recaudado;
	}
	
	
}
