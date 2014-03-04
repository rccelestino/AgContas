package br.com.agcontas.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "Endereco")

public class Logradouro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id", nullable = false)
    private Integer IdLogradouro;

    @Column(name = "TipoRua_id", nullable = false)
    private Integer TipoRua_id;
    
    @Column(name = "TipoLogradouro", nullable = false)
    private Integer TipoLogradouro;
    
    @Column(name = "Logradouro", nullable = false, length = 100)
    private String Logradouro;
    
    @Column(name = "Numero", nullable = false)
    private Integer Numero;
    
    @Column(name = "Complemento", nullable = true, length = 60)
    private Integer Complemento;
    
    @Column(name = "Cep", nullable = false, length = 10)
    private Integer Cep;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "uf_id", referencedColumnName = "id")
    private Uf uf;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "cidade_id", referencedColumnName = "id")
    private Cidade cidade;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "bairro_id", referencedColumnName = "id")
    private Bairro bairro;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataCriacao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataAlteracao;

    public Logradouro() {
        this.bairro = new Bairro();
        this.cidade = new Cidade();
        this.uf = new Uf();
    }

    public Integer getIdLogradouro() {
        return IdLogradouro;
    }

    public void setIdLogradouro(Integer IdLogradouro) {
        this.IdLogradouro = IdLogradouro;
    }

    public Integer getTipoRua_id() {
        return TipoRua_id;
    }

    public void setTipoRua_id(Integer TipoRua_id) {
        this.TipoRua_id = TipoRua_id;
    }

    public Integer getTipoLogradouro() {
        return TipoLogradouro;
    }

    public void setTipoLogradouro(Integer TipoLogradouro) {
        this.TipoLogradouro = TipoLogradouro;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer Numero) {
        this.Numero = Numero;
    }

    public Integer getComplemento() {
        return Complemento;
    }

    public void setComplemento(Integer Complemento) {
        this.Complemento = Complemento;
    }

    public Integer getCep() {
        return Cep;
    }

    public void setCep(Integer Cep) {
        this.Cep = Cep;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        this.uf = uf;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
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
        hash = 83 * hash + Objects.hashCode(this.IdLogradouro);
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
        final Logradouro other = (Logradouro) obj;
        if (!Objects.equals(this.IdLogradouro, other.IdLogradouro)) {
            return false;
        }
        return true;
    }
   
}
