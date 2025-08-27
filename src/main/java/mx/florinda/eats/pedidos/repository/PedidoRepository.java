package mx.florinda.eats.pedidos.repository;

import mx.florinda.eats.pedidos.model.CategoriaCardapio;
import mx.florinda.eats.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    @Query("select p from Pedido p join fetch p.itensPedido i join fetch i.itemCardapio order by p.id")
    List<Pedido> listaComItens();

    @Query("SELECT p FROM Pedido p JOIN fetch p.itensPedido i join fetch i.itemCardapio ic WHERE ic.categoria = :categoria")
    List<Pedido> buscaCategoriaDoCardapio(CategoriaCardapio categoria);
}
