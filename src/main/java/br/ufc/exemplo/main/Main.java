package br.ufc.exemplo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.ufc.exemplo.modelo.Aluno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulaJpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Lucas Bertoldo");
		aluno.setMatricula("892301");
		
		em.persist(aluno);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
