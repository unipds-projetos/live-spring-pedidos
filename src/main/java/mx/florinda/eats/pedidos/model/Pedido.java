package mx.florinda.eats.pedidos.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Pedido {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private LocalDateTime dataHora;

  @Enumerated(EnumType.STRING)
  private StatusPedido status;

  @Embedded
  private Cliente cliente;

  @OneToMany(mappedBy = "pedido")
  private List<ItemPedido> itensPedido;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getDataHora() {
    return dataHora;
  }

  public void setDataHora(LocalDateTime dataHora) {
    this.dataHora = dataHora;
  }

  public StatusPedido getStatus() {
    return status;
  }

  public void setStatus(StatusPedido status) {
    this.status = status;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public List<ItemPedido> getItensPedido() {
    return itensPedido;
  }

  public void setItensPedido(List<ItemPedido> itensPedido) {
    this.itensPedido = itensPedido;
  }
}
