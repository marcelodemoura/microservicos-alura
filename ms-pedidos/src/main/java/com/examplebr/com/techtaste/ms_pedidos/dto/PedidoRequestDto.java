package com.examplebr.com.techtaste.ms_pedidos.dto;

import com.examplebr.com.techtaste.ms_pedidos.entity.ItemPedido;

import java.util.List;

public record PedidoRequestDto(String cpf,
                               List<ItemPedido> itens) {
}
