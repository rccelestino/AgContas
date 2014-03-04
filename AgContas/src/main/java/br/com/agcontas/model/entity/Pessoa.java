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
@Table(name = "Pessoa")

public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Integer idPessoa;

    @Column(name = "tipopessoa_id", length = 1, nullable = false)
    private Integer TipoPessoa;

    @Column(name = "cnpjcpf", length = 14, nullable = false, unique = true)
    private String CNPJCPF;

    @Column(name = "nomerazao", length = 100, nullable = false)
    private String NomeRazao;

    @Column(name = "nomefantasia", length = 100, nullable = false)
    private String NomeFantasia;

    @Column(name = "ativoouinativo", length = 1, nullable = false)
    private String AtivoOuInativo;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataCriacao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataAlteracao;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private List<Email> emails;
    
    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private List<Logradouro> logradouros;
    
    
    public Pessoa() {

    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Integer getTipoPessoa() {
        return TipoPessoa;
    }

    public void setTipoPessoa(Integer TipoPessoa) {
        this.TipoPessoa = TipoPessoa;
    }

    public String getCNPJCPF() {
        return CNPJCPF;
    }

    public void setCNPJCPF(String CNPJCPF) {
        this.CNPJCPF = CNPJCPF;
    }

    public String getNomeRazao() {
        return NomeRazao;
    }

    public void setNomeRazao(String NomeRazao) {
        this.NomeRazao = NomeRazao;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
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

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Logradouro> getLogradouros() {
        return logradouros;
    }

    public void setLogradouros(List<Logradouro> logradouros) {
        this.logradouros = logradouros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idPessoa);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.idPessoa, other.idPessoa)) {
            return false;
        }
        return true;
    }

}
