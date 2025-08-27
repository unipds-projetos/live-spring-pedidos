package mx.florinda.eats.pedidos.dto;

import mx.florinda.eats.pedidos.model.CategoriaCardapio;
import mx.florinda.eats.pedidos.model.ItemCardapio;

import java.math.BigDecimal;

public class ItemCardapioDto {

    private Long id;
    private String nome;
    private String descricao;
    private CategoriaCardapio categoria;
    private BigDecimal preco;
    private BigDecimal precoPromocional;

    public ItemCardapioDto() {
    }

    public ItemCardapioDto(ItemCardapio item) {
        this.id = item.getId();
        this.nome = item.getNome();
        this.descricao = item.getDescricao();
        this.categoria = item.getCategoria();
        this.preco = item.getPreco();
        this.precoPromocional = item.getPrecoPromocional();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaCardapio getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCardapio categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(BigDecimal precoPromocional) {
        this.precoPromocional = precoPromocional;
    }
}