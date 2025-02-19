package com.loja.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    private int id;
    private java.sql.Date dataVenda; //Gerar data e hora automaticamente
    private List<ItemVenda> itens = new ArrayList<>();
    private Double totalVenda;

    public Venda () {}

    public Venda(List<ItemVenda> itens, Double totalVenda) {
        this.dataVenda = new java.sql.Date(new Date().getTime());
        this.itens = itens;
        this.totalVenda = totalVenda;
    }

    public void adicionarItemVenda(ItemVenda itemVenda) {
        this.itens.add(itemVenda);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.sql.Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(java.sql.Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }
    
}
