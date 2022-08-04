/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Classess.*;
import Model.modelprevedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Esteban Bv
 */
public class ctlproveedor {

    private modelprevedor modelprevedor;

    public ctlproveedor() {
        this.modelprevedor = new modelprevedor();

    }

    // metodo que se le envia un objeto de tipo proveedor y este lo manda a la capa modelo para crearlo en la base de datos
    public boolean Createusuario(Proveedor prov) {
        try {
            this.modelprevedor.Createpersona((Proveedor) prov);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean Editproveedor(Proveedor prov) {

        try {

            this.modelprevedor.Editproveedor((Proveedor) prov);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Proveedor Deleteproveedor(int Id) {
        Proveedor prov = null;
       
        try {

            prov = this.modelprevedor.Deleteproveedor(Id);
            return prov;

        } catch (Exception e) {
            return null;
        }
    }

    public Proveedor Searproveedor(String cod) {
        Proveedor prov = null;
        try {

            prov = this.modelprevedor.Searproveedor(cod);

            return prov;
        } catch (Exception e) {
            return null;
        }
    }
    // metodo que retorna la lista de proveedores para usarla en el comboBox
        public List Searproveedores() {
      List proveedoress = new ArrayList();
        try {

          proveedoress = this.modelprevedor.Searproveedores();

            return proveedoress;
        } catch (Exception e) {
            return null;
        }
    }
        // metodo para buscar el ID del proveedor 
        
            public int Searnombreproveedor(String nombre) {
           int prov;
        try {

            prov = this.modelprevedor.Searnombreproveedor(nombre);

            return prov;
        } catch (Exception e) {
            return 1;
        }
    }
            

}
