package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MarcaTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste_hibernate_gui");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        et.begin();

        Marca  marca = new Marca();

        marca.setDescricao("Ford");

        em.persist(marca);

        et.commit();
    }
}
