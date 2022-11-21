package org.senai.prjjava.entity;

import java.text.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String nproduto;
    private String Descricao;
    private Double valor;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNproduto() {
        return nproduto;
    }
    public void setNproduto(String Nproduto) {
        this.nproduto = Nproduto;
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
        System.out.println(NumberFormat.getCurrencyInstance().format(valor));
    }

}