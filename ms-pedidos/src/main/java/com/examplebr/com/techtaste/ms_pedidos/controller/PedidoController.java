package com.examplebr.com.techtaste.ms_pedidos.controller;

import com.examplebr.com.techtaste.ms_pedidos.dto.PedidoRequestDto;
import com.examplebr.com.techtaste.ms_pedidos.dto.PedidoResponseDto;
import com.examplebr.com.techtaste.ms_pedidos.service.PedidoService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    @CircuitBreaker(name = "verificaAutorizacao", fallbackMethod = "erroAoCadastrarPedido")
    public ResponseEntity<PedidoResponseDto> cadastrarPedido(@RequestBody PedidoRequestDto pedidoDto, Throwable throwable) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoService.cadastrarPedido(pedidoDto, false));
    }

    @GetMapping
    public List<PedidoResponseDto> obterTodos() {
        return pedidoService.obterTodos();
    }

    @GetMapping("/response")
    public String obterPorta(@Value("${local.server.port}") String porta) {
        return String.format("Resposta vinda da porta %s", porta);

    }
}
