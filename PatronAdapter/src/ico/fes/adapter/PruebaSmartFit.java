/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.adapter;

import ico.fes.sin.adapter.ClienteMoroso;
import ico.fes.sin.adapter.ClienteNuevo;
import ico.fes.sin.adapter.ClientePremium;

/**
 *
 * @author jorge
 */
public class PruebaSmartFit {

    public static void main(String[] args) {
        float cuota = 500;
        float penalizacion = 5.0f;
        float descuento = 10.0f;
        Cliente[] carteraClientes = {
            new ClienteMorosoAdapter(new ClienteMoroso("Jose")),
            new ClienteNuevoAdapter(new ClienteNuevo("Claudia")),
            new ClientePremiumAdapter(new ClientePremium("Juan"))
        };
        for (Cliente carteraCliente : carteraClientes) {
            carteraCliente.cobrarCuotaMensual(cuota, penalizacion, descuento);
        }
    }
}
