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
public class PruebaSportCity {

    public static void main(String[] args) {
        float cuota = 500;
        float penalizacion = 5.0f;
        float descuento = 10.0f;
        Object[] carteraClientes = {
            new ClienteMoroso("Jesus"),
            new ClientePremium("David"),
            new ClientePremium("Diana"),
            new ClienteNuevo("Claudia"),
            new ClienteMoroso("Diego")
        };

        for (Object carteraCliente : carteraClientes) {
            if (carteraCliente.getClass().getSimpleName().equals("ClienteNuevo")) {//es cliente nuevo(?)
                //cobrar si es cliente nuevo
                ((ClienteNuevo) carteraCliente).cobrarCuotaMensual(cuota);
            }
            if (carteraCliente.getClass().getSimpleName().equals("ClienteMoroso")) {//es cliente nuevo(?)
                //cobrar si es cliente nuevo
                ((ClienteMoroso) carteraCliente).cobrarCuotaMensual(cuota,penalizacion);
            }
            if (carteraCliente.getClass().getSimpleName().equals("ClientePremium")) {//es cliente nuevo(?)
                //cobrar si es cliente nuevo
                ((ClientePremium) carteraCliente).cobrarCuotaMensual(cuota,descuento);
            }
        }
    }
}
