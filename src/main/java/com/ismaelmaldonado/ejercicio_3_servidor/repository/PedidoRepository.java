package com.ismaelmaldonado.ejercicio_3_servidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ismaelmaldonado.ejercicio_3_servidor.model.Pedido;

/**
 * Repositorio para operaciones CRUD en la entidad Pedido.
 * Utiliza Spring Data JPA para proporcionar implementaciones
 * automáticas de métodos comunes.
 * 
 * @see Pedido
 */
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
