package com.examplebr.com.techtaste.ms_pedidos.dto;

import com.examplebr.com.techtaste.ms_pedidos.entity.ItemPedido;
import com.examplebr.com.techtaste.ms_pedidos.entity.Status;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record PedidoResponseDto(UUID id,
                                Status status,
                                String cpf,
                                List<ItemPedido> itens,
                                BigDecimal valorTotal,
                                LocalDate data) {
}
