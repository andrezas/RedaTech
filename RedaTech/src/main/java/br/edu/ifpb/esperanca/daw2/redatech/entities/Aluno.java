package br.edu.ifpb.esperanca.daw2.redatech.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Aluno")
public class Aluno extends Usuario{
	
    @Column
	private String serie;
    
    @ManyToMany
	@JoinTable(name="aula_aluno", joinColumns=@JoinColumn(name="id_aluno"), inverseJoinColumns=@JoinColumn(name="id_aula"))
	private Set<Aula> aulas;
    
    @ManyToMany
	@JoinTable(name="material_aluno", joinColumns=@JoinColumn(name="id_aluno"), inverseJoinColumns=@JoinColumn(name="id_material"))
	private Set<Material> materiais;
    
    @OneToMany(mappedBy="aluno")
	private Set<Redacao> redacao;

	
	

}
