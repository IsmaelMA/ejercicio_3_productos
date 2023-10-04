package com.ismaelmaldonado.ejercicio_3_servidor.controller;

import org.springframework.web.bind.annotation.RestController;
import com.ismaelmaldonado.ejercicio_3_servidor.model.Producto;
import com.ismaelmaldonado.ejercicio_3_servidor.service.producto.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Controlador REST que gestiona las operaciones relacionadas con la entidad
 * Producto.
 * Proporciona endpoints para recuperar productos, obtener el precio de un
 * producto
 * y actualizar el stock de un producto.
 * 
 * @see Producto
 * @see ProductoService
 */
@RestController
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    /**
     * Recupera la lista de todos los productos existentes en la base de datos.
     * 
     * @return Lista de productos.
     */
    @GetMapping(value = "/producto")
    public List<Producto> getListaProductosExistentes() {
        return productoService.recuperarTodosLosProductos();
    }

    /**
     * Obtiene el precio de un producto específico identificado por su ID.
     * 
     * @param id El ID del producto del cual se desea conocer el precio.
     * @return Precio del producto.
     */
    @GetMapping(value = "/producto/{id}")
    public double getPrecioProducto(@PathVariable("id") int id) {
        return productoService.obtenerPrecioProducto(id);
    }

    /**
     * Actualiza el stock de un producto específico identificado por su ID.
     * 
     * @param id       El ID del producto al que se desea actualizar el stock.
     * @param cantidad La nueva cantidad de stock para el producto.
     */
    @PutMapping(value = "/producto/{id}/{cantidad}")
    public void putActualizarStockProducto(@PathVariable("id") int id, @PathVariable("cantidad") int cantidad) {
        productoService.actualizarStockProducto(id, cantidad);
    }
}
