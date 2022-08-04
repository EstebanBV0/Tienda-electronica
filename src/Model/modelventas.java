/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Classess.*;

/**
 *
 * @author Esteban Bv
 */
public class modelventas {

    dbdate dbdate;

    public modelventas() {
        this.dbdate = new dbdate();
    }

    // buscar y crea una lista de los productos disponibles ubicados en la base de datos
    public List Searproductos() {
        try {
            List productos = new ArrayList();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reto4", "root", "");

            Statement statement = connection.createStatement();
            String query = "SELECT Nombre FROM tb_productos";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                productos.add(rs.getString("Nombre"));
            }//end while
            connection.close();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
// Busca y retorna una lista de todos los clientes

    public List searcompradores() {
        try {
            List usuarios = new ArrayList();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reto4", "root", "");

            Statement statement = connection.createStatement();
            String query = "SELECT Nombre FROM tb_cliente";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                usuarios.add(rs.getString("Nombre"));
            }//end while
            connection.close();
            return usuarios;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
// consulta las existencias y crea un objeto del producto comprado

    public Productos seaexistencias(String nombre) {
        Productos prod = null;
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String query = "SELECT * FROM tb_productos WHERE Nombre = ?";
            PreparedStatement statemenprov = conn.prepareStatement(query);
            statemenprov.setString(1, nombre);
            ResultSet result = statemenprov.executeQuery();
            while (result.next()) {
                int prodeid = result.getInt(1);
                String nombrep = result.getString(2);
                float precioactual = result.getFloat(3);
                int exist = result.getInt(4);
                int idprove = result.getInt(5);
                prod = new Productos(prodeid, idprove, nombrep, precioactual, exist);
            }
            conn.close();
            return prod;
        } catch (Exception e) {
            return prod;

        }
    }
// Modifica las existencias de la tabla productos cuando se realice la compra

    public boolean Editexistencias(Productos prod) {
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String queryprove = "UPDATE tb_productos SET Existencia = ? WHERE Idpd = ?";
            PreparedStatement statemenprov = conn.prepareStatement(queryprove);
            statemenprov.setInt(1, prod.getExistencia());
            statemenprov.setInt(2, prod.getID());

            int rowUpdatedprov = statemenprov.executeUpdate();
            conn.close();
            return rowUpdatedprov > 0;

        } catch (Exception e) {
            return false;
        }
    }
// crea la venta en la tabla ubicada en la base de datos

    public boolean creatventa(Ventas venta) {
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String query = "INSERT INTO tb_ventas(id_cliente,id_productos,cantidad) VALUES(?, ?, ?)";
            PreparedStatement statemenventa = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statemenventa.setInt(1, venta.getIdcliente());
            statemenventa.setInt(2, venta.getIdproducto());
            statemenventa.setInt(3, venta.getCantidad());
            statemenventa.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
// consulta y retorna el ID el cliente que realizó la compra
    public int searIDcomprador(String name) {
        int Idproducto = 99;
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String queryprove = "SELECT id_cliente FROM tb_cliente WHERE Nombre =  ?";
            PreparedStatement statemenprov = conn.prepareStatement(queryprove);
            statemenprov.setString(1, name);
            ResultSet result = statemenprov.executeQuery();
            while (result.next()) {
                Idproducto = result.getInt(1);
            }
            conn.close();
            return Idproducto;
        } catch (Exception e) {
            return 0;
        }
    }

}
