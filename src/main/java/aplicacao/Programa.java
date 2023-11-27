package aplicacao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Programa {

	public static void main(String[] args) {
/*
		Pessoa p1 = new Pessoa(null, "Julio", "julio@email.com");
		Pessoa p2 = new Pessoa(null, "Paulo", "paulo@email.com");
		Pessoa p3 = new Pessoa(null, "Ana", "ana@email.com");
*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
/*
 		Inserir os dados no banco de dados
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
*/
		/*
		Buscar um dado pelo id
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		*/
		
		/*
		Remover um dado pelo id (Sempre que ocorrer uma operação que não seja uma simles consulta é necessário colocar a transação
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		*/
		
		System.out.println("Pronto!");
		
		
		em.close();
		emf.close();
	}

}
