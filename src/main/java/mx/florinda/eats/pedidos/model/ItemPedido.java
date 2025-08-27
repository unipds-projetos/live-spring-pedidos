package mx.florinda.eats.pedidos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class ItemPedido {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long quantidade;

  private BigDecimal precoUnitario;

  private String observacao;

  @JsonIgnore
  @ManyToOne
  private Pedido pedido;

  @ManyToOne
  private ItemCardapio itemCardapio;

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

  public Pedido getPedido() {
    return pedido;
  }

  public void setPedido(Pedido pedido) {
    this.pedido = pedido;
  }

  public ItemCardapio getItemCardapio() {
    return itemCardapio;
  }

  public void setItemCardapio(ItemCardapio itemCardapio) {
    this.itemCardapio = itemCardapio;
  }
}
