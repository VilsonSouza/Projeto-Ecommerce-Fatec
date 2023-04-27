package com.eumemu.ecommerce.service.impl;

import com.eumemu.ecommerce.model.Produto;
import org.springframework.stereotype.Service;

@Service
public interface ProdutoService {
    Produto buscarPorId(Integer id);
    void adicionarNoCarrinho(Integer id,Integer quantidade);




}
