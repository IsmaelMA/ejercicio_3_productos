package com.ismaelmaldonado.ejercicio_3_servidor.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPedido;

    @ManyToOne
    @JoinColumn(name = "codigoProducto")
    private Producto producto;

    private int unidades;

    private double total;

    private LocalDateTime fecha;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Pedido() {
    }

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(int idPedido, Producto producto, int unidades, double total, LocalDateTime fecha) {
        this.idPedido = idPedido;
        this.producto = producto;
        this.unidades = unidades;
        this.total = total;
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
                + ", total=" + total
                + ", fecha=" + fecha + "]";
    }

}
