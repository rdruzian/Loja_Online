package br.com.loja_online.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="tb_usuario")
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Numero;
    private String Cvv;
    private String Validade;
    private Boolean Default;
    @OneToMany
    @JoinColumn(name = "IdUsuario")
    private Usuario IdUsuario;
}
