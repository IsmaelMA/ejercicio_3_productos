package com.ismaelmaldonado.ejercicio_3_servidor.service.producto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ismaelmaldonado.ejercicio_3_servidor.model.Producto;
import com.ismaelmaldonado.ejercicio_3_servidor.repository.ProductoRepository;

/**
 * Implementación del servicio relacionado con la entidad Producto.
 * Proporciona operaciones CRUD sobre productos y otras operaciones
 * relacionadas.
 * 
 * @see IProductoService
 * @see Producto
 */
@Service
public class ProductoService implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    /**
     * Obtiene todos los productos existentes en la base de datos.
     * 
     * @return Lista de productos.
     */
    @Override
    public List<Producto> recuperarTodosLosProductos() {
        return productoRepository.findAll();
    }

    /**
     * Obtiene un producto específico por su ID desde la base de datos.
     * 
     * @param id ID del producto a recuperar.
     * @return Producto recuperado o null si no se encuentra.
     */
    @Override
    public Producto recuperarProductoPorId(int id) {
        return productoRepository.findById(id).orElse(null);
    }

    /**
     * Guarda un nuevo producto o actualiza uno existente en la base de datos.
     * 
     * @param producto Producto a guardar o actualizar.
     */
    @Override
    public void guardarProducto(Producto producto) {
        productoRepository.save(producto);
    }

    /**
     * Actualiza el stock de un producto específico en la base de datos.
     * 
     * @param id       ID del producto a actualizar.
     * @param cantidad Nueva cantidad de stock.
     */
    @Override
    public void actualizarStockProducto(int id, int cantidad) {
        Producto productoRecuperado = recuperarProductoPorId(id);
        productoRecuperado.setStock(cantidad);
        productoRepository.save(productoRecuperado);
    }

    /**
     * Obtiene el precio unitario de un producto específico desde la base de datos.
     * 
     * @param id ID del producto del cual obtener el precio.
     * @return Precio unitario del producto.
     */
    @Override
    public double obtenerPrecioProducto(int id) {
        Producto productoRecuperado = recuperarProductoPorId(id);
        return productoRecuperado.getPrecioUnitario();
    }
}
