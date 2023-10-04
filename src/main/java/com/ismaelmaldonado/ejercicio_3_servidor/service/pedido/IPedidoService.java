package com.ismaelmaldonado.ejercicio_3_servidor.service.pedido;

import java.util.List;
import com.ismaelmaldonado.ejercicio_3_servidor.model.Pedido;

/**
 * Interface que define los servicios disponibles para la entidad Pedido.
 * 
 * @see Pedido
 */
public interface IPedidoService {

    /**
     * Guarda un nuevo pedido o actualiza uno existente.
     * 
     * @param pedido Pedido a guardar o actualizar.
     */
    public void guardarPedido(Pedido pedido);

    /**
     * Recupera la lista completa de pedidos en el sistema.
     * 
     * @return Lista de pedidos.
     */
    public List<Pedido> recuperarTodosLosPedidos();

    /**
     * Recupera un pedido específico por su ID.
     * 
     * @param id ID del pedido a recuperar.
     * @return Pedido recuperado o null si no se encuentra.
     */
    public Pedido recuperarPedidoPorId(int id);
}
