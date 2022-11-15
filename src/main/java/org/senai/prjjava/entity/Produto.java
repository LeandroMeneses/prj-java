package org.senai.prjjava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String Nproduto;
    private String Descricao;
    private Double valor;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNproduto() {
        return Nproduto;
    }
    public void setNproduto(String Nproduto) {
        this.Nproduto = Nproduto;
    }

    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

}