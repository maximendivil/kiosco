package clases;
import javax.persistence.*;

@Entity
public class Recaudacion {
	//Variables de instancia
	@Id
	private long id;
	private int total;
	private int gastos;
	private int alquiler;
	@OneToOne(optional = true, mappedBy="recaudado") 
	private Turno turno;
	@ManyToOne(optional=false)
	@JoinColumn(name="PERIODO_ID")
	private Periodo periodo;
	
	//Constructores
	public Recaudacion() {
		// TODO Auto-generated constructor stub
	}
	public Recaudacion(int total, int gastos, int alquiler){
		this.total = total;
		this.gastos = gastos;
		this.alquiler = alquiler;
	}
	
	//Getters y setters
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getGastos() {
		return gastos;
	}
	public void setGastos(int gastos) {
		this.gastos = gastos;
	}
	public int getAlquiler() {
		return alquiler;
	}
	public void setAlquiler(int alquiler) {
		this.alquiler = alquiler;
	}
}
