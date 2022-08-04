/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classess;

/**
 *
 * @author Esteban Bv
 */
public class Proveedor {
    private int provid;
    private String cod;
    private String nit;
    private String razonsocial;
    private String telefono;
    private String email;
    private String reprelegal;
    private String linkweb;
    private String callec;
    private String barrio;
    private String numero ;
    private String city;

    public Proveedor(int provid, String cod, String nit, String razonsocial, String telefono, String email, String reprelegal, String linkweb, String callec, String barrio, String numero, String city) {
        this.provid = provid;
        this.cod = cod;
        this.nit = nit;
        this.razonsocial = razonsocial;
        this.telefono = telefono;
        this.email = email;
        this.reprelegal = reprelegal;
        this.linkweb = linkweb;
        this.callec = callec;
        this.barrio = barrio;
        this.numero = numero;
        this.city = city;
    }

 
    
    

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReprelegal() {
        return reprelegal;
    }

    public void setReprelegal(String reprelegal) {
        this.reprelegal = reprelegal;
    }

    public String getLinkweb() {
        return linkweb;
    }

    public void setLinkweb(String linkweb) {
        this.linkweb = linkweb;
    }
    /**
     * @return the provid
     */
    public int getProvid() {
        return provid;
    }

    /**
     * @param provid the provid to set
     */
    public void setProvid(int provid) {
        this.provid = provid;
    }

    /**
     * @return the callec
     */
    public String getCallec() {
        return callec;
    }

    /**
     * @param callec the callec to set
     */
    public void setCallec(String callec) {
        this.callec = callec;
    }

    /**
     * @return the barrio
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * @param barrio the barrio to set
     */
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    
}
