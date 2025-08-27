CREATE TABLE item_cardapio (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(1000),
    categoria ENUM('ENTRADAS', 'PRATOS_PRINCIPAIS', 'BEBIDAS', 'SOBREMESA') NOT NULL,
    preco DECIMAL(9, 2) NOT NULL,
    preco_promocional DECIMAL(9, 2)
);
