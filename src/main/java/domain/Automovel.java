package domain;

import domain.common.Common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Automovel extends Common {

    @Column(length = 4)
    private String ano;

    @Column(length = 17)
    private String chassi;

    @ManyToOne
    @JoinColumn()
    private Marca marca;

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
