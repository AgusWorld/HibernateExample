package test;

import java.util.List;

import jakarta.persistence.*;
import world.agus.domain.*;

public class HelloWorldHibernate {

	public static void main(String[] args) {

		String hql = "SELECT c FROM Client c"; // HibernateQueryLanguage

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("HibernateEjemplo1");
		EntityManager entityManager = factory.createEntityManager();

		Query query = entityManager.createQuery(hql);

		List<Client> clientList = query.getResultList();
		
		for (Client client : clientList) {
			System.out.println(client);
		}
	}

}
