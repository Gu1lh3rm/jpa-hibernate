package model;

import model.common.Common;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Modelo extends Common {

    @Column(length = 20)
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
