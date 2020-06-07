/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaBarrakita;

import java.util.ArrayList;

/**
 *
 * @author josel
 */
public class CajaDos extends Caja {

    private ArrayList<Productos> productosCaja = new ArrayList();
    private int descuento = 2;

    public CajaDos() {
        descripcion = "La caja dos contiene: \n"
                + "bolsa de patatas fritas, pack de cervezas, bolsa de papa-delta, kikos mistercorn, paquete de lentejas";
        productosCaja.add(Productos.bolsaPatatasFritas);
        productosCaja.add(Productos.packCervezas);
        productosCaja.add(Productos.bolsaPapaDelta);
        productosCaja.add(Productos.kikos);
        productosCaja.add(Productos.paqueteLentejas);

    }

    @Override
    public double precio() {

        Double suma = 0.00;

        for (Productos pro : productosCaja) {
            suma += pro.getPrecio();
        }

        // Le devuelvo la suma menos el descuento
        return suma - descuento;
    }

    public ArrayList<Productos> getProductosCaja() {
        return productosCaja;
    }

}
