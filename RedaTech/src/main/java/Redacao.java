import javax.persistence.Entity;

@Entity
public class Redacao {
	
	private long id;
	private String tema;
	private Aluno autor;

}
