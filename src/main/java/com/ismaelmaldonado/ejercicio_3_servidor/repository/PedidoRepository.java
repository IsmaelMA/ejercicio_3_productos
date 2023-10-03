package com.ismaelmaldonado.ejercicio_3_servidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismaelmaldonado.ejercicio_3_servidor.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
