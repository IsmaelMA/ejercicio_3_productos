package com.ismaelmaldonado.ejercicio_3_servidor.service.producto;

import java.util.List;

import com.ismaelmaldonado.ejercicio_3_servidor.model.Producto;

public interface IProductoService {

    public List<Producto> recuperarTodosLosPedidos();

    public Producto recuperarProductoPorId(int id);

    public void guardarProducto(Producto producto);

}
