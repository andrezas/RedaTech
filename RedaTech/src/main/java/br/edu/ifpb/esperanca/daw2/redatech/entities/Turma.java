package br.edu.ifpb.esperanca.daw2.redatech.entities;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Turma")
public class Turma implements Identificavel{
	
	@Id
	private Long id;
	
	@ManyToMany
	@JoinTable(name="aluno_turma", joinColumns=@JoinColumn(name="id_turma"), inverseJoinColumns=@JoinColumn(name="id_aluno"))
	private Set<Aluno> alunos;
	
	@ManyToOne
	@JoinColumn(name="id_professor")
	private Professor professor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Turma() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		if (alunos == null) {
			if (other.alunos != null)
				return false;
		} else if (!alunos.equals(other.alunos))
			return false;
		if (id != other.id)
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Turma [id=" + id + ", alunos=" + alunos + ", professor=" + professor + "]";
	}
	
	
	

}
