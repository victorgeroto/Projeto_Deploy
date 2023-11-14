package com.ProjetoGerenciamentoPedidos2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoGerenciamentoPedidos2.entites.Pedido;

public interface PedidoRepository extends JpaRepository <Pedido, Long>{

}

