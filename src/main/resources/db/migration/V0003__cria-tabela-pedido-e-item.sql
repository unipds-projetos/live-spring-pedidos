-- tabela Pedido
CREATE TABLE pedido (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    data_hora DATETIME NOT NULL,
    status ENUM('REALIZADO', 'PAGO', 'CONFIRMADO', 'PRONTO', 'SAIU_PRA_ENTREGA', 'ENTREGUE') NOT NULL,
    nome_cliente VARCHAR(100) NOT NULL,
    cpf_cliente VARCHAR(14) NOT NULL,
    celular_cliente VARCHAR(16) NOT NULL,
    endereco_cliente VARCHAR(300) NOT NULL
);

-- tabela ItemPedido
CREATE TABLE item_pedido (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    quantidade BIGINT NOT NULL,
    preco_unitario DECIMAL(9, 2) NOT NULL,
    observacao VARCHAR(300),
    pedido_id BIGINT NOT NULL,
    item_cardapio_id BIGINT NOT NULL,
    FOREIGN KEY (pedido_id) REFERENCES pedido(id),
    FOREIGN KEY (item_cardapio_id) REFERENCES item_cardapio(id)
);
