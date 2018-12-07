package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ClienteTest {


        public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste_hibernate_gui");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();


        et.begin();

        Cliente  cliente = new Cliente();

        cliente.setCpf("39771451565");
        cliente.setEmail("guilherme@gmail.com");
        cliente.setFone("3232323232");
        cliente.setNome("Guilherme");

        em.persist(cliente);

        et.commit();
    }
}
