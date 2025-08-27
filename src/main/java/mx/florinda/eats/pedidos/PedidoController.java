package mx.florinda.eats.pedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
    Optional<Pedido> optionalPedido = pedidoRepository.findById(id);
    if (optionalPedido.isEmpty()) {
     return ResponseEntity.notFound().build();
    }
    Pedido pedido = optionalPedido.get();
    return ResponseEntity.ok(pedido);
  }

}
