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
@Table(name = "SituacaoTelefone")

public class SituacaoTelefone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id", nullable = false)
    private Integer IdSituacao;

    @Column(name = "Descricao", nullable = false, unique = true, length = 2)
    private Integer Descricao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataCriacao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataAlteracao;

    @OneToMany(mappedBy = "Id", fetch = FetchType.LAZY)
    private List<Telefone> telefones;

    public SituacaoTelefone() {
        
    }

    public Integer getIdSituacao() {
        return IdSituacao;
    }

    public void setIdSituacao(Integer IdSituacao) {
        this.IdSituacao = IdSituacao;
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

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.IdSituacao);
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
        final SituacaoTelefone other = (SituacaoTelefone) obj;
        if (!Objects.equals(this.IdSituacao, other.IdSituacao)) {
            return false;
        }
        return true;
    }
    
}
