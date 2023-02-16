/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "clientes")
public class Clientes implements Serializable {

    @Id
    @SequenceGenerator(name = "CLIENTE_SEQ", sequenceName = "seq_cliente", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "CLIENTE_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "cli_cod", nullable = false)
    private Long cliCod;

    @Column(name = "cli_nome", length = 50, nullable = false)
    private String cliNome;

    @Column(name = "cli_tel", length = 50, nullable = false)
    private String cliTel;

    @Column(name = "cli_status")
    private Boolean cliAtv;

    @Column(name = "cli_datainsert")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar cliAdded;

    public Clientes() {
    }

    public Long getCliCod() {
        return cliCod;
    }

    public void setCliCod(Long cliCod) {
        this.cliCod = cliCod;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public String getCliTel() {
        return cliTel;
    }

    public void setCliTel(String cliTel) {
        this.cliTel = cliTel;
    }

    public Boolean getCliAtv() {
        return cliAtv;
    }

    public void setCliAtv(Boolean cliAtv) {
        this.cliAtv = cliAtv;
    }

    public Calendar getCliAdded() {
        return cliAdded;
    }

    public void setCliAdded(Calendar cliAdded) {
        this.cliAdded = cliAdded;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cliCod);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clientes other = (Clientes) obj;
        if (!Objects.equals(this.cliCod, other.cliCod)) {
            return false;
        }
        return true;
    }

}
