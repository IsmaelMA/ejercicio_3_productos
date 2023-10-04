package com.ismaelmaldonado.ejercicio_3_servidor.model;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

/**
 * Modelo de Pedido para representar un pedido en el sistema.
 */
@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPedido;

    @ManyToOne
    @JoinColumn(name = "codigoProducto")
    @JsonBackReference
    private Producto producto;

    private int unidades;
    private double total;
    private LocalDateTime fecha;

    /**
     * Constructor sin argumentos.
     */
    public Pedido() {
    }

    /**
     * Constructor utilizando sólo el ID del pedido.
     *
     * @param idPedido ID del pedido.
     */
    public Pedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * Constructor completo.
     *
     * @param idPedido ID del pedido.
     * @param producto Producto relacionado con el pedido.
     * @param unidades Número de unidades del producto.
     * @param fecha    Fecha del pedido.
     */
    public Pedido(int idPedido, Producto producto, int unidades, LocalDateTime fecha) {
        this.idPedido = idPedido;
        this.producto = producto;
        this.unidades = unidades;
        this.total = (producto.getPrecioUnitario() * unidades);
        this.fecha = fecha;
    }

    /**
     * @return el ID del pedido.
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido Nuevo ID del pedido.
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return Producto relacionado con el pedido.
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto Nuevo producto para el pedido.
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return Número de unidades del producto.
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades Nuevo número de unidades.
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return Total del pedido.
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total Nuevo total.
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return Fecha del pedido.
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * @param fecha Nueva fecha para el pedido.
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idPedido;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pedido other = (Pedido) obj;
        if (idPedido != other.idPedido)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pedido [idPedido=" + idPedido + ", producto=" + producto.getCodigoProducto() + ", unidades=" + unidades
                + ", total=" + total + ", fecha=" + fecha + "]";
    }

    /**
     * @return Código del producto si el producto no es null, de lo contrario
     *         retorna null.
     */
    public int getCodigoProducto() {
        return (producto != null) ? producto.getCodigoProducto() : null;
    }
}
