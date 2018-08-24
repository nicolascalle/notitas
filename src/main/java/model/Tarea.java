package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Profesor")
public class Tarea {
	
	@Id
	@GeneratedValue
	@Column(name = "idTarea")
	private int idTarea;
	
	@Column(name = "fechaLimiteEntrega")
	private Date fechaLimiteDeEntrega;
	
	@Column(name = "enunciado")
	private String enunciado;
	
	public Tarea() {
		
	}
	
	public Tarea(Date fechaLimiteDeEntrega, String enunciado) {
		super();
		this.fechaLimiteDeEntrega = fechaLimiteDeEntrega;
		this.enunciado = enunciado;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public Date getFechaLimiteDeEntrega() {
		return fechaLimiteDeEntrega;
	}

	public void setFechaLimiteDeEntrega(Date fechaLimiteDeEntrega) {
		this.fechaLimiteDeEntrega = fechaLimiteDeEntrega;
	}

}
