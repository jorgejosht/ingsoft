 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.adapter;

/**
 *
 * @author jorge
 */
public interface Cliente {
    public abstract void cobrarCuotaMensual(float cuota, float multa, float descuento);
}
