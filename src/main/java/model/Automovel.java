package model;

import model.common.Common;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Automovel extends Common {

    @Column(length = 4)
    private String ano;

    @Column(length = 17)
    private String chassi;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
