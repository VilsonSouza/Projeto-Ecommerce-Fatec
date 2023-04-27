package com.eumemu.ecommerce.model;

import jakarta.persistence.*;

@Entity
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Compra;
    @ManyToOne
    private Produto produto;
    private Integer quantidade;


}
