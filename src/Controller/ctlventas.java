/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import java.util.List;
import Classess.*;
import Model.*;

/**
 *
 * @author Esteban Bv
 */
public class ctlventas {

    private modelventas modelventas;

    public ctlventas() {
        this.modelventas = new modelventas();

    }
    // metodo para retornar la lista de productos de la base de datos

    public List Searproductos() {
        List productos = new ArrayList();
        try {

            productos = this.modelventas.Searproductos();

            return productos;
        } catch (Exception e) {
            return null;
        }
    }
// metodo para retornar la lista de usuarios de la base de datos
    public List searcompradores() {
        List usuarios = new ArrayList();
        try {

            usuarios = this.modelventas.searcompradores();

            return usuarios;
        } catch (Exception e) {
            return null;
        }
    }

    // metodo para retornar un objeto producto a partir del nombre "el cual estaba en el comboBox"
    public Productos seaexistencias(String produc) {
        Productos prod = null;
        try {

            prod = this.modelventas.seaexistencias(produc);

            return prod;
        } catch (Exception e) {
            return null;
        }
    }
// metodo para editar las existencias en la basee de datos del producto cuando se haga una venta
    public boolean Editexistencias(Productos prod) {

        try {

            this.modelventas.Editexistencias((Productos) prod);

            return true;
        } catch (Exception e) {
            return false;
        }
    }
// metodo para crear una venta, se le envia un objeto tipo venta
    public boolean creatventa(Ventas prov) {
        try {
            this.modelventas.creatventa((Ventas) prov);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    // metodo para retornar el id de un comprador enviandole el nombre presente en el combo Box

    public int searIDcomprador(String name) {
        int IDc = 99;
        try {

            IDc = this.modelventas.searIDcomprador(name);

            return IDc;
        } catch (Exception e) {
            return 99;
        }
    }
}
