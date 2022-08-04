/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classess;

/**
 *
 * @author Esteban Bv
 */
public class Productos {
    
    private int provid;
    private String nombre;
    private float precio;
    private int existencia;
    private int ID;



    public Productos(int ID,int provid, String nombre, float precio, int existencia) {
        this.provid = provid;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
        this.ID= ID;
      
                
    }

    public int getProvid() {
        return provid;
    }

    public void setProvid(int provid) {
        this.provid = provid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
  public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    

}
