package mx.florinda.eats.pedidos.controller.dto;

import mx.florinda.eats.pedidos.model.ItemCardapio;
import mx.florinda.eats.pedidos.model.ItemPedido;

import java.math.BigDecimal;

public class ItemPedidoDto {

    private Long id;
    private Long quantidade;
    private BigDecimal precoUnitario;
    private String observacao;
    private ItemCardapioDto itemCardapio;

    public ItemPedidoDto() {
    }

    public ItemPedidoDto(ItemPedido item) {
        this.id = item.getId();
        this.quantidade = item.getQuantidade();
        this.precoUnitario = item.getPrecoUnitario();
        this.observacao = item.getObservacao();
        this.itemCardapio = new ItemCardapioDto(item.getItemCardapio());
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public ItemCardapioDto getItemCardapio() {
        return itemCardapio;
    }

    public void setItemCardapio(ItemCardapioDto itemCardapio) {
        this.itemCardapio = itemCardapio;
    }
}