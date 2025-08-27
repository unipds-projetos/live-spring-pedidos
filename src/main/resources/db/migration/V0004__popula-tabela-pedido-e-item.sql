-- pedidos
INSERT INTO pedido (id, data_hora, status, nome_cliente, cpf_cliente, celular_cliente, endereco_cliente)
VALUES
(1, '2024-10-13 12:30:00', 'REALIZADO', 'Chaves', '123.456.789-00', '(11) 91234-5678', 'Vila 8, Barril do Chaves'),
(2, '2024-10-13 13:00:00', 'REALIZADO', 'Seu Madruga', '234.567.890-11', '(11) 92345-6789', 'Vila 8, Casa 72'),
(3, '2024-10-13 13:15:00', 'REALIZADO', 'Seu Madroga, Primo do Seu Madruga', '345.678.901-22', '(11) 93456-7890', 'Vila 8, Casa 14'),
(4, '2024-10-13 14:00:00', 'REALIZADO', 'Quico', '456.789.012-33', '(11) 94567-8901', 'Vila 8, Casa 14'),
(5, '2024-10-13 14:30:00', 'REALIZADO', 'Professor Girafales', '567.890.123-44', '(11) 95678-9012', 'Vila 8, Sala dos Professores'),
(6, '2024-10-13 15:00:00', 'REALIZADO', 'Dona Clotilde', '678.901.234-55', '(11) 96789-0123', 'Vila 8, Casa 71'),
(7, '2024-10-13 15:15:00', 'REALIZADO', 'Seu Barriga', '789.012.345-66', '(11) 97890-1234', 'Vila 8, Casa 20'),
(8, '2024-10-13 15:30:00', 'REALIZADO', 'Nhonho', '890.123.456-77', '(11) 98901-2345', 'Vila 8, Casa 20'),
(9, '2024-10-13 16:00:00', 'REALIZADO', 'Paty', '901.234.567-88', '(11) 99012-3456', 'Vila 8, Casa 15'),
(10, '2024-10-13 16:30:00', 'REALIZADO', 'Godinez', '012.345.678-99', '(11) 90123-4567', 'Vila 8, Casa 13'),
(11, '2024-10-13 17:00:00', 'REALIZADO', 'Dona Neves', '123.678.901-00', '(11) 91123-4567', 'Vila 8, Casa 72'),
(12, '2024-10-13 17:15:00', 'REALIZADO', 'Pópis', '234.789.012-11', '(11) 92234-5678', 'Vila 8, Casa 14'),
(13, '2024-10-13 17:30:00', 'REALIZADO', 'Jaiminho', '345.890.123-22', '(11) 93345-6789', 'Correios, Vila 8'),
(14, '2024-10-13 18:00:00', 'REALIZADO', 'Chiquinha', '456.901.234-33', '(11) 94456-7890', 'Vila 8, Casa 73'),
(15, '2024-10-13 18:30:00', 'REALIZADO', 'Malicha', '567.012.345-44', '(11) 95567-8901', 'Vila 8, Casa 71');

-- Itens dos pedidos
-- pedido do Chaves
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(1, 1, 3.50, 'Com bastante presunto, por favor!', 1, 1), -- Sanduíche de Presunto do Chaves
(2, 2, 2.99, 'Bem gelado', 1, 2); -- Refresco

-- pedido do Seu Madruga
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(3, 1, 5.99, 'Pode ser bem queimadinho!', 2, 3), -- Tostadas do Seu Madruga
(4, 1, 1.99, NULL, 2, 8); -- Café da Dona Florinda

-- pedido da Seu Madroga, Primo do Seu Madruga'
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(5, 1, 12.99, 'Sem pimenta, por favor.', 3, 5), -- Torta de Frango da Dona Florinda
(6, 1, 5.99, NULL, 3, 11); -- Bolo de Chocolate da Dona Clotilde

-- pedido do Quico
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(7, 1, 4.99, 'Capriche na pipoca!', 4, 6), -- Pipoca do Quico
(8, 1, 2.50, 'Bem doce', 4, 7); -- Água de Jamaica

-- pedido do Professor Girafales
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(9, 1, 4.99, NULL, 5, 9), -- Churros do Chaves
(10, 1, 5.99, 'Para levar', 5, 11); -- Bolo de Chocolate da Dona Clotilde

-- Itens dos pedidos
-- pedido da Dona Clotilde
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(11, 2, 6.99, 'Bem temperada, por favor.', 6, 4), -- Salada de Pepino da Dona Clotilde
(12, 1, 3.50, 'A sobremesa favorita!', 6, 10); -- Gelatina Colorida do Nhonho

-- pedido do Seu Barriga
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(13, 1, 5.99, 'Extra doce, por favor.', 7, 11), -- Bolo de Chocolate da Dona Clotilde
(14, 2, 2.99, 'Sem gelo.', 7, 2); -- Refresco do Chaves

-- pedido do Nhonho
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(15, 1, 4.99, 'Recheado com extra doce de leite.', 8, 9), -- Churros do Chaves
(16, 3, 4.99, NULL, 8, 6); -- Pipoca do Quico

-- pedido da Paty
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(17, 1, 12.99, 'Sem cebola, por favor.', 9, 5), -- Torta de Frango da Dona Florinda
(18, 2, 2.50, 'Com pouco açúcar.', 9, 7); -- Água de Jamaica

-- pedido do Godinez
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(19, 2, 3.50, 'Para viagem.', 10, 10), -- Gelatina Colorida do Nhonho
(20, 1, 4.99, 'Com cobertura extra.', 10, 9); -- Churros do Chaves

-- Itens dos pedidos
-- pedido da Dona Neves
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(21, 1, 3.50, 'Extra crocante', 11, 1), -- Sanduíche de Presunto do Chaves
(22, 2, 5.99, 'Bem servido', 11, 11); -- Bolo de Chocolate da Dona Clotilde

-- pedido da Pópis
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(23, 1, 6.99, 'Com limão extra', 12, 4), -- Salada de Pepino da Dona Clotilde
(24, 1, 2.50, 'Bem doce', 12, 7); -- Água de Jamaica

-- pedido do Jaiminho
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(25, 1, 4.99, 'Para viagem', 13, 9), -- Churros do Chaves
(26, 1, 3.50, NULL, 13, 10); -- Gelatina Colorida do Nhonho

-- pedido da Chiquinha
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(27, 1, 5.99, 'Sem açúcar', 14, 11), -- Bolo de Chocolate da Dona Clotilde
(28, 1, 4.99, 'Bem salgada', 14, 6); -- Pipoca do Quico

-- pedido de Malicha
INSERT INTO item_pedido (id, quantidade, preco_unitario, observacao, pedido_id, item_cardapio_id)
VALUES
(29, 3, 2.99, 'Com gelo', 15, 2), -- Refresco do Chaves
(30, 1, 3.50, 'Colorida', 15, 10); -- Gelatina Colorida do Nhonho
