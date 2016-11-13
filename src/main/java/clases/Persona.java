package clases;
import java.util.List;

import javax.persistence.*;

@Entity
public class Persona {
	//Variables de instancia
	@Id
	private long id;
	private String nombre;
	private String apellido;
	@ManyToMany
	@JoinTable(name="turnospersona",
		joinColumns=@JoinColumn(name="PERSONA_ID",referencedColumnName="id"),
		inverseJoinColumns=@JoinColumn(name="TURNO_ID",referencedColumnName="id")
		)
	private List<Turno> turnos;
	//Constructores
	public Persona() {
		
	}
	public Persona(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	//Getters y setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
