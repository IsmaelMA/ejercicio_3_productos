package com.ismaelmaldonado.ejercicio_3_servidor.controller;

import org.springframework.web.bind.annotation.RestController;
import com.ismaelmaldonado.ejercicio_3_servidor.model.Pedido;
import com.ismaelmaldonado.ejercicio_3_servidor.service.pedido.PedidoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador REST que gestiona las operaciones relacionadas con la entidad
 * Pedido.
 * Proporciona endpoints para crear y recuperar pedidos.
 * 
 * @see Pedido
 * @see PedidoService
 */
@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    /**
     * Crea un nuevo pedido y lo almacena en la base de datos.
     * 
     * @param pedido Datos del pedido a guardar.
     */
    @PostMapping(value = "/pedido")
    public void postDarAltaPedido(@RequestBody Pedido pedido) {
        pedidoService.guardarPedido(pedido);
    }

    /**
     * Obtiene todos los pedidos existentes en la base de datos.
     * 
     * @return Lista de pedidos.
     */
    @GetMapping(value = "/pedido")
    public List<Pedido> getRecuperarPedidos() {
        return pedidoService.recuperarTodosLosPedidos();
    }
}
