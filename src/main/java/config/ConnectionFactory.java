package config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste_hibernate_gui");

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
