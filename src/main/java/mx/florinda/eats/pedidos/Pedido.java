package mx.florinda.eats.pedidos;

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

  private String nomeCliente;

  private String cpfCliente;

  private String celularCliente;

  private String enderecoCliente;

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

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public String getCpfCliente() {
    return cpfCliente;
  }

  public void setCpfCliente(String cpfCliente) {
    this.cpfCliente = cpfCliente;
  }

  public String getCelularCliente() {
    return celularCliente;
  }

  public void setCelularCliente(String celularCliente) {
    this.celularCliente = celularCliente;
  }

  public String getEnderecoCliente() {
    return enderecoCliente;
  }

  public void setEnderecoCliente(String enderecoCliente) {
    this.enderecoCliente = enderecoCliente;
  }

  public List<ItemPedido> getItensPedido() {
    return itensPedido;
  }

  public void setItensPedido(List<ItemPedido> itensPedido) {
    this.itensPedido = itensPedido;
  }
}
