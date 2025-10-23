package br.com.loja_online.controller;

import br.com.loja_online.model.Cartao;
import br.com.loja_online.model.Usuario;
import br.com.loja_online.service.CartaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cartao")
@RequiredArgsConstructor
public class CartaoController {
    private final CartaoService cartaoService;

    @PostMapping("/create")
    public ResponseEntity<Void> criar(@RequestBody Cartao cartao) {
        cartaoService.criaCartao(cartao);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/deleteById")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        cartaoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @GetMapping("/findById")
    public ResponseEntity<Cartao> findById(@PathVariable Integer id) {
        cartaoService.findById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
