package domain;

import domain.common.Common;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Modelo extends Common {

    @Column(length = 20)
    private String descricao;

//    private List<Automovel> automoveis = new ArrayList<>();


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
