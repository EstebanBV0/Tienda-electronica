/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classess.*;
import Model.*;

/**
 *
 * @author
 */
public class ProductoControlador {

    private ProductoModelo ProductoModelo;

    public ProductoControlador() {
        this.ProductoModelo = new ProductoModelo();

    }

    // este metodo sirve para enviar el objeto producto pro a la capa del modelo
    public boolean Createproducto(Productos prod) {
        try {
            this.ProductoModelo.Createproducto((Productos) prod);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // este metodo sirve para enviar el objeto producto prod a la capa del modelo y actualizar la información de la base datos
    public boolean Editproducto(Productos prod) {

        try {

            this.ProductoModelo.Editproducto((Productos) prod);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
// este metodo busca el producto en la base de datos y retorna un objeto
    public Productos Searproducto(String cod) {
        Productos prod = null;
        try {

            prod = this.ProductoModelo.Searproducto(cod);

            return prod;
        } catch (Exception e) {
            return null;
        }
    }
    // este metodo busca en el base de datos el proveedor por su ID y retorna el nombre

    public String Searnombreproveedor(int id) {
        String prov;
        try {

            prov = this.ProductoModelo.Searnombreproveedor(id);

            return prov;
        } catch (Exception e) {
            return "lolas";
        }
    }
// este metodo lleva el id del producto a borrar y lo envia a la capa modelo
    public Productos Deleteproductos(int Id) {
        Productos prod = null;

        try {

            prod = this.ProductoModelo.Deleteproductos(Id);
            return prod;

        } catch (Exception e) {
            return null;
        }
    }

}
