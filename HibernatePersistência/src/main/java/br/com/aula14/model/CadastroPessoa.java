package br.com.aula14.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.aula14.model.Pessoa;

public class CadastroPessoa {
	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		p.setNome("Nome 4");
		p.setIdade(16);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("aula14");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		
	}

}
