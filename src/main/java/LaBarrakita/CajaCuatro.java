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
public class CajaCuatro extends Caja {

    private ArrayList<Productos> productosCaja = new ArrayList();
    private int descuento = 2;

    public CajaCuatro() {
        descripcion = "La caja tres contiene: \n"
                + "pack de cervezas, toallitas, papel higiénico, coca-cola, 2 barras de pan, botella de lejía, pasta de dientes";
        productosCaja.add(Productos.toallitas);
        productosCaja.add(Productos.packCervezas);
        productosCaja.add(Productos.papelHigienico);
        productosCaja.add(Productos.cocaCola);
        productosCaja.add(Productos.barraPan);
        productosCaja.add(Productos.botellaLejia);
        productosCaja.add(Productos.pastaDiente);

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
