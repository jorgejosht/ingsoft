/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdedisenio;

import ico.fes.ninja.BaseDeDatosSingleton;
import ico.fes.patito.BaseDeDatos;

/**
 *
 * @author jorge
 */
public class Patronesdedisenio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BaseDeDatos bd1=new BaseDeDatos();
        BaseDeDatos bd2=new BaseDeDatos();
        BaseDeDatos bd3=new BaseDeDatos();
        //...
        BaseDeDatos bdn=new BaseDeDatos();
        
        bd1.ConsultaClientes("Jose");
        bd1.ConsultaClientes("Marco");
        bd1.ConsultaClientes("Diana");
        
        bd2.ConsultaClientes("Juan");
        
        bd3.ConsultaClientes("Jose");
        
        bdn.ConsultaClientes("Joaquin");
        
        System.out.println("-----------PATRON SINGLETON----------");
        /*
        BaseDeDatosSingleton bds1= BaseDeDatosSingleton.getInstance();
        BaseDeDatosSingleton bds2= BaseDeDatosSingleton.getInstance();
        BaseDeDatosSingleton bds3= BaseDeDatosSingleton.getInstance();
        BaseDeDatosSingleton bdsn= BaseDeDatosSingleton.getInstance();
    
        bds1.ConsultaClientes("Jose");
        bds1.ConsultaClientes("Marco");
        bds1.ConsultaClientes("Diana");
        
        bds2.ConsultaClientes("Juan");
        
        bds3.ConsultaClientes("Jose");
        
        bdsn.ConsultaClientes("Joaquin");
        */
        BaseDeDatosSingleton.getInstance().ConsultaClientes("Jose");
        BaseDeDatosSingleton.getInstance().ConsultaClientes("Marco");
        BaseDeDatosSingleton.getInstance().ConsultaClientes("Diana");
    }
    
}
