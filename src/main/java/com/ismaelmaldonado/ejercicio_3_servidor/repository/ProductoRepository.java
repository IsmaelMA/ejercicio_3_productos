package com.ismaelmaldonado.ejercicio_3_servidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ismaelmaldonado.ejercicio_3_servidor.model.Producto;

/**
 * Repositorio para operaciones CRUD en la entidad Producto.
 * Utiliza Spring Data JPA para proporcionar implementaciones
 * automáticas de métodos comunes.
 * 
 * @see Producto
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
