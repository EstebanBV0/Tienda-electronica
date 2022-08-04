/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classess.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jotarlo
 */
public class ProductoModelo {

    dbdate dbdate;

    public ProductoModelo() {
        this.dbdate = new dbdate();
    }
    
    // crea el producto en la base de datos enviandole el objeto prod de tipo producto

    public boolean Createproducto(Productos prod) {
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String query = "INSERT INTO tb_productos(Nombre,PrecioActual,Existencia,Idp) VALUES(?, ?, ?, ?)";
            PreparedStatement statemenproducto = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statemenproducto.setString(1, prod.getNombre());
            statemenproducto.setFloat(2, prod.getPrecio());
            statemenproducto.setInt(3, prod.getExistencia());
            statemenproducto.setInt(4, prod.getProvid());

            int rowInserted = statemenproducto.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // edita un producto existente en la base de datos a partir del objeto prod tipo producto creado en la capa de la vista

    public boolean Editproducto(Productos prod) {
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String queryprove = "UPDATE tb_productos SET Nombre = ?,PrecioActual = ?,Existencia = ?, Idp = ? WHERE Idpd = ?";
            PreparedStatement statemenprov = conn.prepareStatement(queryprove);
            statemenprov.setString(1, prod.getNombre());
            statemenprov.setFloat(2, prod.getPrecio());
            statemenprov.setInt(3, prod.getExistencia());
            statemenprov.setInt(4, prod.getProvid());
            statemenprov.setInt(5, prod.getID());

            int rowUpdatedprov = statemenprov.executeUpdate();
            conn.close();
            return rowUpdatedprov > 0;

        } catch (Exception e) {
            return false;
        }
    }
    
    // elimina un producto enviandole el ID 

    //public Proveedor Deleteproducto(int Ids) {
      //  Proveedor provs = null; // se deja solo para que retorne el null
        //try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
          //  String query = "DELETE  FROM tb_proveedores WHERE Id = ?";
            //PreparedStatement statemenprov = conn.prepareStatement(query);
            //statemenprov.setInt(1, Ids);
            //statemenprov.executeUpdate();
            //conn.close();
            //return provs;
       // } catch (SQLException e) {
         //   return provs;

        //}
   // }
    
    
    // metodo para buscar el producto a partir del ID y retornar los atributos y se crea un bojeto

    public Productos Searproducto(String code) {
        int ids = Integer.parseInt(code);
        Productos prod = null;
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String query = "SELECT * FROM tb_productos AS p WHERE p.Idpd = ?";
            PreparedStatement statemenprov = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statemenprov.setInt(1, ids);
            ResultSet result = statemenprov.executeQuery();
            while (result.next()) {
                int proveid = result.getInt(1);
                String nombre = result.getString(2);
                float precioactual = result.getFloat(3);
                int cantidad = result.getInt(4);
                prod = new Productos(0, proveid, nombre, precioactual, cantidad);

            }

            conn.close();
            return prod;
        } catch (Exception e) {
            return prod;
        }
    }
    
    //metodo para buscar el nombre de un proveedor usando las llaves foraneas

    public String Searnombreproveedor(int id) {
        String nombrepr = null;
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String query = "SELECT RazonSocial FROM tb_productos AS p JOIN tb_proveedores AS pv ON p.Idp =pv.Id WHERE  p.Idpd = ? ";
            PreparedStatement statemenprov = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statemenprov.setInt(1, id);
            ResultSet result = statemenprov.executeQuery();

            while (result.next()) {
                nombrepr = result.getString(1);

            }

            conn.close();

            return nombrepr;
        } catch (Exception e) {
            return "aqui";
        }
    }
    // metodo para eliminar un producto enviandole el id

    public Productos Deleteproductos(int Ids) {
        Productos provs = null;
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String query = "DELETE  FROM tb_productos WHERE Idpd = ?";
            PreparedStatement statemenprov = conn.prepareStatement(query);
            statemenprov.setInt(1, Ids);
            statemenprov.executeUpdate();
            conn.close();
            return provs;
        } catch (SQLException e) {
            return provs;

        }
    }

}
