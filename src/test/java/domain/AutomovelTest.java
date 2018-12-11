package domain;

import repositories.AutomovelRepository;
import repositories.persistence.JpaGeneric;

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
