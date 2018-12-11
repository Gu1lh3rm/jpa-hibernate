package domain;

import repositories.LocacaoRepository;

import java.text.SimpleDateFormat;

public class LocacaoTest {

    public static void main(String[] args) throws Exception {

        LocacaoRepository locacaoRepository = new LocacaoRepository();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");


        Locacao locacao = new Locacao();

        locacao.setData(sdf.parse("30/09/2017 10:32"));

        locacaoRepository.save(locacao);
    }
}
