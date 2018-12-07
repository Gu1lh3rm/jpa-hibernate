package model;

import model.common.Common;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cliente extends Common {
    @Column(length = 50)
    private String nome;

    @Column(length = 40)
    private String email;

    @Column(length = 14)
    private String cpf;

    @Column(length = 13)
    private String fone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
