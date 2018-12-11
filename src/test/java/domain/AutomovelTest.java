package domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AutomovelTest {


        public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste_hibernate_gui");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();


        et.begin();

        Automovel  automovel = new Automovel();

        automovel.setAno("2014");
        automovel.setChassi("1235646");

        em.persist(automovel);

        et.commit();
    }
}
