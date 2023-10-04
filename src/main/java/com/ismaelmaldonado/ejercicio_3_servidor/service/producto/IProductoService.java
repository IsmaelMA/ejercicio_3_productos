package com.ismaelmaldonado.ejercicio_3_servidor.service.producto;

import java.util.List;
import com.ismaelmaldonado.ejercicio_3_servidor.model.Producto;

/**
 * Interface que define los servicios disponibles para la entidad Producto.
 * 
 * @see Producto
 */
public interface IProductoService {

    /**
     * Recupera la lista completa de productos en el sistema.
     * 
     * @return Lista de productos.
     */
    public List<Producto> recuperarTodosLosProductos();

    /**
     * Recupera un producto específico por su ID.
     * 
     * @param id ID del producto a recuperar.
     * @return Producto recuperado o null si no se encuentra.
     */
    public Producto recuperarProductoPorId(int id);

    /**
     * Guarda un nuevo producto o actualiza uno existente.
     * 
     * @param producto Producto a guardar o actualizar.
     */
    public void guardarProducto(Producto producto);

    /**
     * Actualiza el stock de un producto específico.
     * 
     * @param id       ID del producto a actualizar.
     * @param cantidad Nueva cantidad de stock.
     */
    public void actualizarStockProducto(int id, int cantidad);

    /**
     * Obtiene el precio unitario de un producto específico.
     * 
     * @param id ID del producto del cual obtener el precio.
     * @return Precio unitario del producto.
     */
    public double obtenerPrecioProducto(int id);
}
