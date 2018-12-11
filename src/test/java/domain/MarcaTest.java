package domain;

import repositories.MarcaRepository;

public class MarcaTest{


    public static void main(String[] args) throws Exception{


        MarcaRepository marcaRepository = new MarcaRepository();

        Marca marca = new Marca();

        marca.setDescricao("Ford");

        marcaRepository.save(marca);

    }
}
