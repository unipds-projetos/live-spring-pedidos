package mx.florinda.eats.pedidos.controller;

import mx.florinda.eats.pedidos.model.Pedido;
import mx.florinda.eats.pedidos.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

  @Autowired
  private PedidoRepository pedidoRepository;

  @GetMapping
  public List<Pedido> lista() {
    return pedidoRepository.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Pedido> porId(@PathVariable("id") Long id) {
    return pedidoRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }

}
