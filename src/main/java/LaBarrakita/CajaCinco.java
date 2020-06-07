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
public class CajaCinco extends Caja {

    private ArrayList<Productos> productosCaja = new ArrayList();
    private ArrayList<Productos> productosExistentes = new ArrayList();

    public CajaCinco() {
        descripcion = "La caja Cinco puede meterle lo que quiera de la lista que le mostramos";
        productosExistentes.add(Productos.azucar);
        productosExistentes.add(Productos.barraPan);
        productosExistentes.add(Productos.bolsaPapaDelta);
        productosExistentes.add(Productos.bolsaPatatasFritas);
        productosExistentes.add(Productos.botellaAceite);
        productosExistentes.add(Productos.botellaLejia);
        productosExistentes.add(Productos.cocaCola);
        productosExistentes.add(Productos.fideosChinos);
        productosExistentes.add(Productos.judiasLata);
        productosExistentes.add(Productos.kikos);
        productosExistentes.add(Productos.packCervezas);
        productosExistentes.add(Productos.papelHigienico);
        productosExistentes.add(Productos.paqueteGarbanzos);
        productosExistentes.add(Productos.paqueteLentejas);
        productosExistentes.add(Productos.pastaDiente);
        productosExistentes.add(Productos.toallitas);
    }

    public ArrayList añadirProductos(int codigo) {

        for (Productos productos : productosExistentes) {
            if (productos.getCodigo() == codigo) {
                productosCaja.add(productos);
            } else {
                System.out.println("El código no pertenece a nuestros productos existentes");
            }

        }

        return productosCaja;
    }

    @Override
    public double precio() {

        Double suma = 0.00;

        for (Productos pro : productosCaja) {
            suma += pro.getPrecio();
        }

        // Le devuelvo la suma menos el descuento
        return suma;
    }

    public ArrayList<Productos> getProductosCaja() {
        return productosCaja;
    }

    public ArrayList<Productos> getProductosExistentes() {
        return productosExistentes;
    }

}
