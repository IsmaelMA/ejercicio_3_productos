package com.ismaelmaldonado.ejercicio_3_servidor.service.pedido;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ismaelmaldonado.ejercicio_3_servidor.model.Pedido;
import com.ismaelmaldonado.ejercicio_3_servidor.repository.PedidoRepository;

/**
 * Implementación del servicio relacionado con la entidad Pedido.
 * Proporciona operaciones CRUD sobre pedidos.
 * 
 * @see IPedidoService
 * @see Pedido
 */
@Service
public class PedidoService implements IPedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    /**
     * Guarda o actualiza un pedido en la base de datos.
     * 
     * @param pedido Pedido a guardar o actualizar.
     */
    @Override
    public void guardarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    /**
     * Obtiene todos los pedidos existentes en la base de datos.
     * 
     * @return Lista de pedidos.
     */
    @Override
    public List<Pedido> recuperarTodosLosPedidos() {
        return pedidoRepository.findAll();
    }

    /**
     * Obtiene un pedido específico por su ID desde la base de datos.
     * 
     * @param id ID del pedido a recuperar.
     * @return Pedido recuperado o null si no se encuentra.
     */
    @Override
    public Pedido recuperarPedidoPorId(int id) {
        return pedidoRepository.findById(id).orElse(null);
    }
}
