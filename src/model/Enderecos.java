/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "enderecos")
public class Enderecos implements Serializable {

    @Id
    @SequenceGenerator(name = "ENDERECO_SEQ", sequenceName = "seq_endereco", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "ENDERECO_SEQ", strategy = GenerationType.SEQUENCE)

    @Column(name = "end_cod", nullable = false)
    private Long endCod;

    @Column(name = "end_bairro", length = 30)
    private String endBairro;

    @Column(name = "end_rua", length = 30)
    private String endRua;

    @Column(name = "end_num")
    private Integer endNum;

    @Column(name = "end_comp", length = 30)
    private String endComp;

    public Enderecos() {
    }

    public Long getEndCod() {
        return endCod;
    }

    public void setEndCod(Long endCod) {
        this.endCod = endCod;
    }

    public String getEndBairro() {
        return endBairro;
    }

    public void setEndBairro(String endBairro) {
        this.endBairro = endBairro;
    }

    public String getEndRua() {
        return endRua;
    }

    public void setEndRua(String endRua) {
        this.endRua = endRua;
    }

    public Integer getEndNum() {
        return endNum;
    }

    public void setEndNum(Integer endNum) {
        this.endNum = endNum;
    }

    public String getEndComp() {
        return endComp;
    }

    public void setEndComp(String endComp) {
        this.endComp = endComp;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.endCod);
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
        final Enderecos other = (Enderecos) obj;
        if (!Objects.equals(this.endCod, other.endCod)) {
            return false;
        }
        return true;
    }
    
    
}
