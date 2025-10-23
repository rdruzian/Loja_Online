package br.com.loja_online.service;

import br.com.loja_online.model.Cartao;
import br.com.loja_online.model.Produto;
import br.com.loja_online.model.Usuario;
import br.com.loja_online.repository.CartaoRepository;
import br.com.loja_online.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartaoService {
    @Autowired
    private CartaoRepository cartaoRepository;
    public Cartao findById(Integer id){
        return cartaoRepository.findById(id);
    }
    public void deleteById(Integer id){
        cartaoRepository.deleteById(id);
    }
    public void criaCartao(Cartao cartao){
        cartaoRepository.save(cartao);
    }

}
