/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Classess.Proveedor;
import Classess.Productos;
import Controller.ctlproveedor;
import Controller.ProductoControlador;
import javax.swing.JOptionPane;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jotarlo
 */
public class frmProductos extends javax.swing.JFrame {

    ctlproveedor ctlproveedor;
    ProductoControlador ProductoControlador;

    /**
     * Creates new form frmProduct
     */
    public frmProductos() {
        initComponents();
        this.ctlproveedor = new ctlproveedor();
        this.ProductoControlador = new ProductoControlador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtExistencia = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cbProveedor = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Administración de Productos");

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio Actual");

        jLabel4.setText("Existencia");

        jLabel5.setText("Proveedor");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton5.setText("Volver al Inicio");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        cbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recargar para ver" }));
        cbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedorActionPerformed(evt);
            }
        });

        jButton1.setText("Recargar para obtener los proveedores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        textID.setText("Solo para buscar");
        textID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(34, 34, 34)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jButton5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton5)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frmMenu menu = new frmMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedorActionPerformed

    }//GEN-LAST:event_cbProveedorActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
          //se limpia el comboBox y se reciben los datos del id del producto
            cbProveedor.removeAllItems();
            String codep = textID.getText();
            Productos prod = (Productos) ProductoControlador.Searproducto(codep);
            int ids = Integer.parseInt(codep);
            String nameprov = ProductoControlador.Searnombreproveedor(ids);
            if (prod == null) {
                JOptionPane.showMessageDialog(this, "code not found");
            } else {
                txtNombre.setText(prod.getNombre());
                txtPrecio.setText(Float.toString(prod.getPrecio()));
                txtExistencia.setText(Integer.toString(prod.getExistencia()));
                cbProveedor.addItem(nameprov);
                //se llena el formulario  con los atributos del objeto prod buscado en la base de datos
            }

        } catch (Exception e) { //capta el error y lo muestra
            JOptionPane.showMessageDialog(null, "Code no found" + e);
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        // este boton cumple la función de ir a la base de datos y traer los proveedores actuales 
        List proveedoress = new ArrayList();
        //carga en una lista los proveedores encontrados a partir de la consulta de la base de datos
        proveedoress = ctlproveedor.Searproveedores();
        Iterator iter = proveedoress.iterator();

        //variable para tomar el nombre
        String nombre;
        cbProveedor.removeAllItems();//limpia el combobox
        //try por si fallara al momento de rellenar
        try {
            //Se recorre con un for la lista de proveedores
            for (int i = 0; i < proveedoress.size(); i++) {
                /**
                 * Se le da el valor sacado desde el Array proveedoress a la
                 * variable nombre, la cual recibe y y se rellena el combobox
                 */
                nombre = (String) proveedoress.get(i);
                //Se arega un nuevo ítem al combobox
                cbProveedor.addItem(nombre);
            }
        } catch (Exception e) { //capta el error y lo muestra
            JOptionPane.showMessageDialog(null, "Error al cargar ComboBox" + e);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
            // se reciben los datos del formulario y los comboBox
            String proved = cbProveedor.getSelectedItem().toString();
            // a partir del nombre dle proveedor ubicado en el comboBox se busca el id
            int provid = ctlproveedor.Searnombreproveedor(proved);
            
            if (provid == 99) {
                JOptionPane.showMessageDialog(this, "code not found");
            } else {

                String nombre = txtNombre.getText();
                String precio = txtPrecio.getText();
                float prec = Integer.parseInt(precio);
                String existencias = txtExistencia.getText();
                int existenc = Integer.parseInt(existencias);
                // se crea el objeto producto con los datos
                Productos prod = new Productos(0, provid, nombre, prec, existenc);
                // se envia el objeto producto a al metodo crear producto
                ProductoControlador.Createproducto(prod);
                JOptionPane.showMessageDialog(this, "Se agregó con éxito el Producto+" + provid);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el proveedor");
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void textIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// limpia el formulario
        txtNombre.setText("");
        txtPrecio.setText("");
        txtExistencia.setText("");
        textID.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String provedeedor = cbProveedor.getSelectedItem().toString();
        int provedid = ctlproveedor.Searnombreproveedor(provedeedor);
        String idproducto = textID.getText();
        int ID = Integer.parseInt(idproducto);
        String nombre = txtNombre.getText();
        String precio = txtPrecio.getText();
        float prec = Float.parseFloat(precio);
        String existencias = txtExistencia.getText();
        int existenc = Integer.parseInt(existencias);

        try {
            // se crea el objeto producto actualizado y se envia al metodo editar producto

            Productos prod = new Productos(ID, provedid, nombre, prec, existenc);
            boolean response = ProductoControlador.Editproducto(prod);
            if (response) {
                JOptionPane.showMessageDialog(this, "Se ha completado la actualización");
            } else {
                JOptionPane.showMessageDialog(this, "no se pudo actualizar la información");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se pudo editar  el Producto");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
// toma el id del producto y hace uso del metodo Deleteproducto retorna un booleano para saber si se elimino o no
        try {
            int proId = Integer.parseInt(textID.getText());

            Productos prod = (Productos) ProductoControlador.Deleteproductos(proId);

            if (prod == null) {
                // se limpian los campo
                cbProveedor.removeAllItems();
                JOptionPane.showMessageDialog(this, "Se eliminó con Éxito el Producto");
                txtNombre.setText("");
                txtPrecio.setText("");
                txtExistencia.setText("");
                textID.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Tiene que insertar el ID correspondiente");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tiene que insertar el ID correspondiente");
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}