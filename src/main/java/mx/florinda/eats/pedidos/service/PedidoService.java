package mx.florinda.eats.pedidos.service;

import mx.florinda.eats.pedidos.dto.PedidoDto;
import mx.florinda.eats.pedidos.model.CategoriaCardapio;
import mx.florinda.eats.pedidos.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<PedidoDto> lista() {
        return pedidoRepository.listaComItens().stream().map(PedidoDto::new).toList();
    }

    public Optional<PedidoDto> buscaPorId(Long id) {
        return pedidoRepository.findById(id).map(PedidoDto::new);
    }

    public List<PedidoDto> buscaPorCategoria(String nomeCategoria) {
        return pedidoRepository.buscaCategoriaDoCardapio(CategoriaCardapio.valueOf(nomeCategoria.toUpperCase()))
                .stream()
                .map(PedidoDto::new)
                .toList();
    }
}
