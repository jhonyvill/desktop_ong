/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Kamilla
 */
@Entity
@Table(name = "dinheiro")
public class Dinheiro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double dinheiro;

    @OneToOne
    @JoinColumn(name = "id_doacao")
    private Doacao doacao;

    public Dinheiro() {
    }

    public Dinheiro(Long id, Double dinheiro) {
        this.id = id;
        this.dinheiro = dinheiro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Doacao getDoacao() {
        return doacao;
    }

    public void setDoacao(Doacao doacao) {
        this.doacao = doacao;
    }
    
   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dinheiro)) {
            return false;
        }
        Dinheiro other = (Dinheiro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Dinheiro[ id=" + id + " ]";
    }

}