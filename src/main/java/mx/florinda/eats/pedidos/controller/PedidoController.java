package mx.florinda.eats.pedidos.controller;

import mx.florinda.eats.pedidos.dto.PedidoDto;
import mx.florinda.eats.pedidos.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

  private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
  public List<PedidoDto> lista() {
    return pedidoService.lista();
  }

  @GetMapping("/{id}")
  public ResponseEntity<PedidoDto> porId(@PathVariable("id") Long id) {
    return pedidoService.buscaPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }

}
