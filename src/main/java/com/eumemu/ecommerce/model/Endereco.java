package com.eumemu.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Endereco {
    private String rua;
    private String cidade;
    @Id
    private Long cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }
}
