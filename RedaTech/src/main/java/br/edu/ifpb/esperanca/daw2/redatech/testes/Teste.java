package br.edu.ifpb.esperanca.daw2.redatech.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

import br.edu.ifpb.esperanca.daw2.redatech.entities.Turma;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Professor;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Aula;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Aluno;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Material;
import br.edu.ifpb.esperanca.daw2.redatech.entities.Redacao;
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
	void  visualizarAula() {
		RedaTechInt c = null;
		Usuario usuario =  new Usuario();
		Aula a = c.visualizarAula(usuario, aula);
		assertNotNull(a);
		assertEquals("", a.getId());

	}
	
	@Test
	void  editarRedacao() {
		RedaTechInt d = null;
		Aluno aluno =  new Aluno();
		Redacao r = d.editarRedacao(aluno, redacao);
		assertNotNull(r);
		assertEquals("", r.getId());
	}	
	
	@Test
	void  postarAula() {
		RedaTechInt e = null;
		Professor prof =  new Professor();
		Aula a = e.postarAula(professor);
		assertNotNull(a);
		assertEquals("", a.getId());

	}
	
	@Test
	void  correcao() {
		RedaTechInt f = null;
		Redacao r =  new Redacao();
		Nota n = f.correcao(redacao);
		assertNotNull(n);
		assertEquals("", n.getId());

	}
	
	@Test
	void  enviarComentario() {
		RedaTechInt g = null;
		Professor prof =  new Professor();
		Redacao redacao = new Redacao();
		Comentario c = g.enviarComentario(professor, redacao);
		assertNotNull(c);
		assertEquals("", c.getId());

	}
	
	@Test
	void  criarTurma() {
		RedaTechInt h = null;
		Aluno aluno =  new Aluno();
		Turma turma = new Turma();
		Turma t = h.criarTurma(aluno, turma);
		assertNotNull(h);
		assertEquals("", h.getId());

	}
	
	@Test
	void  postarAula() {
		RedaTechInt i = null;
		Aula aula =  new Aula();
		Professor professor = new Professor();
		Aula a = i.postarAula(professor, aula);
		assertNotNull(i);
		assertEquals("", i.getId());

	}
}
