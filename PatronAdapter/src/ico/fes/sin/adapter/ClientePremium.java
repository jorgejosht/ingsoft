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
public class ClientePremium {
    private String nombre;

    public ClientePremium() {
    }

    public ClientePremium(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void cobrarCuotaMensual(float cuota, float descuento){
        System.out.println("Señor(a) "+nombre+":");
        System.out.println("Por su buen historial, ud. es beneficiado con un"
                            +"descuento del "+descuento+"%");
        System.out.println("Cuota base: $"+cuota);
        System.out.println("Total: $"+(cuota-(cuota*(descuento/100))));
                  
    }
}
