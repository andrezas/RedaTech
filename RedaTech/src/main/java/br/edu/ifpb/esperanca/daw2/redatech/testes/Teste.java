package br.edu.ifpb.esperanca.daw2.redatech.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.redatech.entities.Aluno;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Aula;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Comentario;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Nota;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Professor;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Redacao;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Turma;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.redatech.interfaces.RedaTechInt;

class Teste {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void  cadastrarUsu() {
		RedaTechInt a = null;
		Usuario usuario = new Usuario();
		Usuario u = a.cadastrarUsu(usuario);
		assertNotNull(u);
		assertEquals("", u.getId());
	}
	@Test
	void  enviarRedação() {
		RedaTechInt b = null;
		Redacao redacao = new Redacao();
		Aluno aluno =  new Aluno();
		Redacao r = b.enviarRedacao(aluno, redacao);
		assertNotNull(r);
		assertEquals("", r.getId());
   }
	
	
	@Test
	void  editarRedacao() {
		RedaTechInt d = null;
		Aluno aluno =  new Aluno();
		Redacao redacao = new Redacao();
		Redacao r = d.editarRedacao(aluno, redacao);
		assertNotNull(r);
		assertEquals("", r.getId());
	}	
	
	@Test
	void  postarAula() {
		RedaTechInt e = null;
		Professor prof =  new Professor();
		Aula aula = new Aula();
		Aula a = e.postarAula(prof, aula);
		assertNotNull(a);
		assertEquals("", a.getId());

	}
	
	@Test
	void  correcao() {
		RedaTechInt f = null;
		Redacao redacao =  new Redacao();
		Professor prof = new Professor();
		Nota nota = new Nota();
		Nota n = f.correcao(redacao, nota,prof);
		assertNotNull(n);
		assertEquals("", n.getId());

	}
	
	@Test
	void  enviarComentario() {
		RedaTechInt g = null;
		Professor prof =  new Professor();
		Redacao redacao = new Redacao();
		Comentario comentario =  new Comentario();
		Comentario c = g.enviarComentario(prof, redacao,comentario);
		assertNotNull(c);
		assertEquals("", c.getId());

	}
	
	@Test
	void  criarTurma() {
		RedaTechInt h = null;
		Set<Aluno> alunos =  new HashSet<Aluno>();
		Turma turma = new Turma();
		Professor prof = new Professor();
		Turma t = h.criarTurma(prof, turma, alunos);
		assertNotNull(t);
		assertNotNull(t.getId());

	}
	
	
}
