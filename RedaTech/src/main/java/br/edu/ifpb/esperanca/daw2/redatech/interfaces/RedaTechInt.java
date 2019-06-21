package br.edu.ifpb.esperanca.daw2.redatech.interfaces;

import java.util.Set;


import br.edu.ifpb.esperanca.daw2.redatech.entities.Aluno;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Aula;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Comentario;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Material;
import br.edu.ifpb.esperanca.daw2.redatech.entities.NotaCompetencia;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Professor;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Redacao;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Turma;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Usuario;

public interface RedaTechInt {
	
	
	public Usuario cadastrarUsu(Usuario usuario);
	public void acessarMaterial(Aluno aluno, Material material);
	public Redacao enviarRedacao(Aluno aluno, Redacao redacao);
	public Aula visualizarAula(Usuario usuario, Aula aula);
	public Redacao editarRedacao(Aluno aluno, Redacao redacao);
	public Material postarMaterial(Professor professor, Material material);
	public NotaCompetencia correcao(Redacao redacao, NotaCompetencia nota, Professor professor);
	public Comentario enviarComentario(Professor professor, Redacao redacao,Comentario comentario);
	public Turma criarTurma(Professor professor, Turma turma,Set<Aluno> alunos);
	public void addAlunoTurma(Aluno aluno, Turma turma);
	public Aula postarAula(Professor professor, Aula aula);

	 

}
