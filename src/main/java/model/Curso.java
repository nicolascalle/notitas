package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class Curso {
	
	@Id
	private int idCurso;
	
	@Transient
	private List<Alumno> alumnos = new ArrayList<>();
	
	public Curso() {
		
	}

}
