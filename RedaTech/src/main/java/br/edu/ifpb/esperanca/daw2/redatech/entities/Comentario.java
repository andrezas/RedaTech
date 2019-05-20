package br.edu.ifpb.esperanca.daw2.redatech.entities;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comentario {
	@Id
	private long id;
	
	private Calendar data;
	private Usuario usuario;
	

}
