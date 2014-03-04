package br.com.agcontas.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author roberto
 */
@Entity
@Table(name = "Cidade")

public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id", nullable = false)
    private Integer IdCidade;

    @Column(name = "Cidade", nullable = false, unique = false, length = 100)
    private String Cidade;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataCriacao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataAlteracao;

    @ManyToOne(optional = false)
    @JoinColumn(name = "IdUf", referencedColumnName = "id")
    private List<Uf> ufs;

    @OneToMany(mappedBy = "cidade_id", fetch = FetchType.LAZY)
    private List<Bairro> bairros;
        
    public Cidade() {

    }

    public Integer getIdCidade() {
        return IdCidade;
    }

    public void setIdCidade(Integer IdCidade) {
        this.IdCidade = IdCidade;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public Date getDataCriacao() {
        return DataCriacao;
    }

    public void setDataCriacao(Date DataCriacao) {
        this.DataCriacao = DataCriacao;
    }

    public Date getDataAlteracao() {
        return DataAlteracao;
    }

    public void setDataAlteracao(Date DataAlteracao) {
        this.DataAlteracao = DataAlteracao;
    }

    public List<Uf> getUfs() {
        return ufs;
    }

    public void setUfs(List<Uf> ufs) {
        this.ufs = ufs;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairros = bairros;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.IdCidade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if (!Objects.equals(this.IdCidade, other.IdCidade)) {
            return false;
        }
        return true;
    }

}
