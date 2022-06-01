package com.br.lets.vendasecommerce.domain;

import io.netty.util.internal.ObjectPool;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Document(collection = "vendas")
public class VendasEntity {

    @Id
    private String id;
    private Long total;
    private String carrinhoId;
    private Instant dataCriacao;

    @Field
    private Set<Long> lista = new HashSet<>();

    public VendasEntity(String id, Long total, String carrinhoId, Instant dataCriacao) {
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
