package domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import domain.common.Common;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;


@Entity
public class Locacao extends Common {

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date data;

    @ManyToOne
    @JoinColumn(name = "automovel_id")
    private Automovel automovel;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
