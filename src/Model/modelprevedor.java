/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Classess.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Esteban Bv
 */
public class modelprevedor {

    dbdate dbdate;

    public modelprevedor() {
        this.dbdate = new dbdate();
    }
// metodo para crear un un proveedor

    public boolean Createpersona(Proveedor prov) {
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String query = "INSERT INTO tb_proveedores(codigo,Nit,RazonSocial,Telefono,CorreoElectronico,RepresentanteLegal,SitioWeb,Calle,barrio,numero,ciudad) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statemenuser = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statemenuser.setString(1, prov.getCod());
            statemenuser.setString(2, prov.getNit());
            statemenuser.setString(3, prov.getRazonsocial());
            statemenuser.setString(4, prov.getTelefono());
            statemenuser.setString(5, prov.getEmail());
            statemenuser.setString(6, prov.getReprelegal());
            statemenuser.setString(7, prov.getLinkweb());
            statemenuser.setString(8, prov.getCallec());
            statemenuser.setString(9, prov.getBarrio());
            statemenuser.setString(10, prov.getNumero());
            statemenuser.setString(11, prov.getCity());

            int rowInserted = statemenuser.executeUpdate();
            if (rowInserted > 0) {
                ResultSet generatedKeys = statemenuser.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int iduprov = generatedKeys.getInt(1);
                }
            }
            conn.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
// metodo para editar un proveedor

    public boolean Editproveedor(Proveedor prov) {
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String queryprove = "UPDATE tb_proveedores SET codigo = ?,Nit = ?,RazonSocial = ?,Telefono = ?,CorreoElectronico = ?,RepresentanteLegal = ?,SitioWeb = ?,Calle = ?,barrio = ?,numero = ?,ciudad =? WHERE Id = ?";
            PreparedStatement statemenprov = conn.prepareStatement(queryprove);
            statemenprov.setString(1, prov.getCod());
            statemenprov.setString(2, prov.getNit());
            statemenprov.setString(3, prov.getRazonsocial());
            statemenprov.setString(4, prov.getTelefono());
            statemenprov.setString(5, prov.getEmail());
            statemenprov.setString(6, prov.getReprelegal());
            statemenprov.setString(7, prov.getLinkweb());
            statemenprov.setString(8, prov.getCallec());
            statemenprov.setString(9, prov.getBarrio());
            statemenprov.setString(10, prov.getNumero());
            statemenprov.setString(11, prov.getCity());
            statemenprov.setInt(12, prov.getProvid());

            int rowUpdatedprov = statemenprov.executeUpdate();
            conn.close();
            return rowUpdatedprov > 0;

        } catch (Exception e) {
            return false;
        }
    }
// metodo para borrar un proveedor

    public Proveedor Deleteproveedor(int Ids) {
        Proveedor provs = null;
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String query = "DELETE  FROM tb_proveedores WHERE Id = ?";
            PreparedStatement statemenprov = conn.prepareStatement(query);
            statemenprov.setInt(1, Ids);
            statemenprov.executeUpdate();
            conn.close();
            return provs;
        } catch (SQLException e) {
            return provs;

        }
    }
// metodo para bucar un proveedor

    public Proveedor Searproveedor(String code) {
        Proveedor provs = null;
        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String query = "SELECT * FROM tb_proveedores AS p WHERE p.codigo = ?";
            PreparedStatement statemenprov = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statemenprov.setString(1, code);
            ResultSet result = statemenprov.executeQuery();
            while (result.next()) {
                int proveid = result.getInt(1);
                String procode = result.getString(2);
                String prnit = result.getString(3);
                String prrazon = result.getString(4);
                String prtelefono = result.getString(5);
                String premail = result.getString(6);
                String prrepresentante = result.getString(7);
                String prweb = result.getString(8);
                String prcalle = result.getString(9);
                String prbarrio = result.getString(10);
                String prnumero = result.getString(11);
                String prciudad = result.getString(12);

                provs = new Proveedor(proveid, procode, prnit, prrazon, prtelefono, premail, prrepresentante, prweb, prcalle, prbarrio, prnumero, prciudad);

            }
            conn.close();
            return provs;
        } catch (Exception e) {
            return provs;
        }
    }

    // metodo para objetener la lista de proveedores 
    public List Searproveedores() {
        try {
            List proveedoress = new ArrayList();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reto4", "root", "");

            Statement statement = connection.createStatement();
            String query = "SELECT RazonSocial FROM tb_proveedores";
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                proveedoress.add(rs.getString("RazonSocial"));
            }//end while
            connection.close();
            return proveedoress;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
// metodo para buscar el id de un proveedor enviandole el nombre
    public int Searnombreproveedor(String nombre) {
        int proveid = 2;

        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {
            String query = "SELECT * FROM tb_proveedores AS p WHERE p.RazonSocial = ?";
            PreparedStatement statemenprov = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statemenprov.setString(1, nombre);
            ResultSet result = statemenprov.executeQuery();
            while (result.next()) {
                proveid = result.getInt(1);

            }
            conn.close();

            return proveid;
        } catch (Exception e) {
            return 10;
        }
    }

}
