/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classess;

/**
 *
 * @author Esteban Bv
 */
public class Ventas {

    private int idventa;
    private int idcliente;
    private int idproducto;
    private int cantidad;

    public Ventas(int idventa, int idcliente, int idproducto, int cantidad) {
        this.idventa = idventa;
        this.idcliente = idcliente;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
