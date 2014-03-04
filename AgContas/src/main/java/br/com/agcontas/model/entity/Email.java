package br.com.agcontas.model.entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "Email")

public class Email implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id", nullable = false)
    private Integer IdEmail;

    @Column(name = "Email", nullable = false, unique = true, length = 100)
    private String Email;

    @Column(name = "AtivoOuInativo", length = 1, nullable = false)
    private String AtivoOuInativo;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataCriacao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataAlteracao;

    @ManyToOne
    @JoinColumn(name = "IdPessoa")
    private Pessoa pessoa;

    public Email() {

    }

    public Integer getIdEmail() {
        return IdEmail;
    }

    public void setIdEmail(Integer IdEmail) {
        this.IdEmail = IdEmail;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAtivoOuInativo() {
        return AtivoOuInativo;
    }

    public void setAtivoOuInativo(String AtivoOuInativo) {
        this.AtivoOuInativo = AtivoOuInativo;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.IdEmail);
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
        final Email other = (Email) obj;
        if (!Objects.equals(this.IdEmail, other.IdEmail)) {
            return false;
        }
        return true;
    }

}
