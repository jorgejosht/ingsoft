/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.patito;

/**
 *Clase que simula una conexión a base de datos
 * @author jorge
 */
public class BaseDeDatos {

    private String url;
    private String bdName;
    private String user;
    private String password;

    public BaseDeDatos() {
        System.out.println("Simulando la conexión a base de datos");
        System.out.println("Conctandose a: "+url+" en la BD:"+bdName);
    }

    public BaseDeDatos(String url, String bdName, String user, String password) {
        this.url = url;
        this.bdName = bdName;
        this.user = user;
        this.password = password;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the bdName
     */
    public String getBdName() {
        return bdName;
    }

    /**
     * @param bdName the bdName to set
     */
    public void setBdName(String bdName) {
        this.bdName = bdName;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public void ConsultaClientes(String cadena){
        System.out.println("Id de este objeto: "+this.toString());
        
        System.out.println("ID      NOMBRE      TELEFONO");
        System.out.println("1       "+cadena+"      1111-1111-22");
        System.out.println("2       "+cadena+"      1111-1111-22");
        System.out.println("3       "+cadena+"      1111-1111-22");
        System.out.println("4       "+cadena+"      1111-1111-22");
        System.out.println("5       "+cadena+"      1111-1111-22");
    }
}
