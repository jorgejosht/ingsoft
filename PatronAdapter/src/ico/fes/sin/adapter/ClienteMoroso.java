/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.sin.adapter;

/**
 *
 * @author jorge
 */
public class ClienteMoroso {
    private String nombre;

    public ClienteMoroso() {
    }

    public ClienteMoroso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void cobrarCuotaMensual(float cuota, float multa){
        System.out.println("Señor(a) "+this.nombre+":");
        System.out.println("Por ser cliente moroso, ud. tiene una penalización del 5%");
        System.out.println("Cuota base: $"+cuota);
        System.out.println("Total: $"+(cuota+(cuota*(multa/100))) );
    }
}
