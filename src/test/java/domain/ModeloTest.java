package domain;

import repositories.ModeloRepository;

public class ModeloTest {
    public static void main(String[] args) throws Exception{

        ModeloRepository modeloRepository = new ModeloRepository();


        Modelo modelo = new Modelo();
        modelo.setDescricao("Carro de passeio");

        modeloRepository.save(modelo);

    }
}
