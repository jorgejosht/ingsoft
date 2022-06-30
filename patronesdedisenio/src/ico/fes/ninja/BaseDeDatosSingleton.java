/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.ninja;

/**
 *
 * @author jorge
 */
public class BaseDeDatosSingleton {
    String url;
    String bdName;
    String login;
    String password;
    private static BaseDeDatosSingleton _instance;
    private BaseDeDatosSingleton() {
        System.out.println("Simulando la conexión a base de datos");
        System.out.println("Conctandose a: "+url+" en la BD:"+bdName);
    }

    private BaseDeDatosSingleton(String url, String bdName, String login, String password) {
        this.url = url;
        this.bdName = bdName;
        this.login = login;
        this.password = password;
    }
    
    public static BaseDeDatosSingleton getInstance(){
        if(_instance == null ){
            _instance= new BaseDeDatosSingleton();
        }else{
            System.out.println("El objeto ya estaba creado, se regresa el existente");
        }
        return _instance;
}
    public void ConsultaClientes(String cadena) {
        System.out.println("Id de este objeto: " + this.toString());

        System.out.println("ID      NOMBRE      TELEFONO");
        System.out.println("1       " + cadena + "      1111-1111-22");
        System.out.println("2       " + cadena + "      1111-1111-22");
        System.out.println("3       " + cadena + "      1111-1111-22");
        System.out.println("4       " + cadena + "      1111-1111-22");
        System.out.println("5       " + cadena + "      1111-1111-22");
    }   

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBdName() {
        return bdName;
    }

    public void setBdName(String bdName) {
        this.bdName = bdName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
