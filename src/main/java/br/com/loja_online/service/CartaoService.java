package br.com.loja_online.service;

import br.com.loja_online.model.Cartao;
import br.com.loja_online.repository.CartaoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartaoService {
    private final CartaoRepository cartaoRepository;

    public CartaoService(CartaoRepository cartaoRepository) {
        this.cartaoRepository = cartaoRepository;
    }

    public Optional<Cartao> findById(Integer id){
        return cartaoRepository.findById(id);
    }
    public void deleteById(Integer id){
        cartaoRepository.deleteById(id);
    }
    public void criaCartao(Cartao cartao){
        cartaoRepository.save(cartao);
    }

}
