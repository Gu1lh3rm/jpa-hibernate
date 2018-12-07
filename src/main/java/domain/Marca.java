package domain;


import domain.common.Common;

import javax.persistence.Entity;

@Entity
public class Marca extends Common {

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
