package com.br.lets.vendasecommerce.domain;

import java.time.Instant;

public class VendasResponse {
    private String id;
    private Long total;
    private String carrinhoId;
    private Instant dataCriacao;

    public VendasResponse(String id, Long total, String carrinhoId, Instant dataCriacao) {
        this.id = id;
        this.total = total;
        this.carrinhoId = carrinhoId;
        this.dataCriacao = dataCriacao;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getCarrinhoId() {
        return carrinhoId;
    }

    public void setCarrinhoId(String carrinhoId) {
        this.carrinhoId = carrinhoId;
    }

    public Instant getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Instant dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
