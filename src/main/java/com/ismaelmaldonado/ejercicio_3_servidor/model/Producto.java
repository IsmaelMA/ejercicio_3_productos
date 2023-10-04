package com.ismaelmaldonado.ejercicio_3_servidor.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

/**
 * Modelo de Producto para representar un producto en el sistema.
 */
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoProducto;

    private String producto;
    private double precioUnitario;
    private int stock;

    @OneToMany(mappedBy = "producto")
    @JsonBackReference
    private List<Pedido> pedidos;

    /**
     * @return Código del producto.
     */
    public int getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * @param codigoProducto Nuevo código del producto.
     */
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * @return Nombre del producto.
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto Nuevo nombre del producto.
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return Precio unitario del producto.
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario Nuevo precio unitario.
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return Stock disponible del producto.
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock Nuevo stock del producto.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return Lista de pedidos asociados al producto.
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * @param pedidos Nueva lista de pedidos asociados al producto.
     */
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoProducto;
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
        Producto other = (Producto) obj;
        if (codigoProducto != other.codigoProducto)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Producto [codigoProducto=" + codigoProducto + ", producto=" + producto + ", precioUnitario="
                + precioUnitario + ", stock=" + stock + ", pedidos=" + pedidos + "]";
    }
}
