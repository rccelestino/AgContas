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
@Table(name = "TipoLogradouro")

public class TipoLogradouro implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id", nullable = false)
    private Integer IdTipo;

    @Column(name = "descricao", nullable = false, unique = true, length = 2)
    private Integer Descricao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataCriacao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataAlteracao;
    
    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private List<Logradouro> logradouros;

    public TipoLogradouro() {
        
    }

    public Integer getIdTipo() {
        return IdTipo;
    }

    public void setIdTipo(Integer IdTipo) {
        this.IdTipo = IdTipo;
    }

    public Integer getDescricao() {
        return Descricao;
    }

    public void setDescricao(Integer Descricao) {
        this.Descricao = Descricao;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.IdTipo);
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
        final TipoLogradouro other = (TipoLogradouro) obj;
        if (!Objects.equals(this.IdTipo, other.IdTipo)) {
            return false;
        }
        return true;
    }
    
}
