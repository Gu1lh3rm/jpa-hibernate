package domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import domain.common.Common;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Locacao extends Common {

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
