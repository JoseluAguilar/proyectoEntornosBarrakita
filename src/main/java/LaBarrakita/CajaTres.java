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
public class CajaTres extends Caja {

    private ArrayList<Productos> productosCaja = new ArrayList();
    private int descuento = 2;

    public CajaTres() {
        descripcion = "La caja tres contiene: \n"
                + "bolsa de patatas fritas, pack de cervezas, paquete de garbanzos, fideos chinos rápidos, judías de lata litoral, azúcar";
        productosCaja.add(Productos.bolsaPatatasFritas);
        productosCaja.add(Productos.packCervezas);
        productosCaja.add(Productos.paqueteGarbanzos);
        productosCaja.add(Productos.fideosChinos);
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
