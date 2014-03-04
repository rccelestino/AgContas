package br.com.agcontas.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author roberto
 */
@Entity
@Table(name = "Bairro")

public class Bairro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id", nullable = false)
    private Integer IdBairro;

    @Column(name = "Bairro", nullable = false, unique = false, length = 100)
    private String Cidade;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataCriacao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataAlteracao;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cidade_id", referencedColumnName = "id")
    private List<Cidade> cidades;

    public Bairro() {

    }

    public Integer getIdBairro() {
        return IdBairro;
    }

    public void setIdBairro(Integer IdBairro) {
        this.IdBairro = IdBairro;
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

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.IdBairro);
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
        final Bairro other = (Bairro) obj;
        if (!Objects.equals(this.IdBairro, other.IdBairro)) {
            return false;
        }
        return true;
    }

}
