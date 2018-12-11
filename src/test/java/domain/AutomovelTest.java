package domain;

import repositories.AutomovelRepository;
import services.persistence.JpaGeneric;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AutomovelTest extends JpaGeneric<Automovel>{

        private AutomovelRepository automovelRepository = new AutomovelRepository();

        public static void main(String[] args) throws Exception {
        AutomovelRepository automovelRepository = new AutomovelRepository();


        Automovel automovel = new Automovel();

        automovel.setChassi("teste");
        automovel.setAno("2018");
        automovelRepository.save(automovel);


    }
}
