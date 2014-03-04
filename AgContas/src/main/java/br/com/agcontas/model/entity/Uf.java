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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author roberto
 */
@Entity
@Table(name = "Uf")

public class Uf implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id", nullable = false)
    private Integer IdUf;

    @Column(name = "Uf", nullable = false, unique = true, length = 2)
    private Integer Uf;

    @Column(name = "Nome", nullable = false, unique = false, length = 72)
    private String Nome;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataCriacao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataAlteracao;

    @OneToMany(mappedBy = "IdUf", fetch = FetchType.LAZY)
    private List<Cidade> cidades;

    public Uf() {

    }

    public Integer getIdUf() {
        return IdUf;
    }

    public void setIdUf(Integer IdUf) {
        this.IdUf = IdUf;
    }

    public Integer getUf() {
        return Uf;
    }

    public void setUf(Integer Uf) {
        this.Uf = Uf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
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
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.IdUf);
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
        final Uf other = (Uf) obj;
        if (!Objects.equals(this.IdUf, other.IdUf)) {
            return false;
        }
        return true;
    }

}
