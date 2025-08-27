package mx.florinda.eats.pedidos.controller.dto;

import mx.florinda.eats.pedidos.model.Pedido;
import mx.florinda.eats.pedidos.model.StatusPedido;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoDto {

    private Long id;
    private LocalDateTime dataHora;
    private StatusPedido status;
    private String nomeCliente;
    private String cpfCliente;
    private String celularCliente;
    private String enderecoCliente;
    private List<ItemPedidoDto> itensPedido;

    public PedidoDto() {
    }

    public PedidoDto(Pedido pedido) {
        this.id = pedido.getId();
        this.dataHora = pedido.getDataHora();
        this.status = pedido.getStatus();
        this.nomeCliente = pedido.getCliente().getNome();
        this.cpfCliente = pedido.getCliente().getCpf();
        this.celularCliente = pedido.getCliente().getCelular();
        this.enderecoCliente = pedido.getCliente().getEndereco();
        this.itensPedido = pedido.getItensPedido().stream()
                .map(ItemPedidoDto::new)
                .collect(Collectors.toList());
    }

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

    public List<ItemPedidoDto> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedidoDto> itensPedido) {
        this.itensPedido = itensPedido;
    }
}