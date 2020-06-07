/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaBarrakita;

/**
 *
 * @author josel
 */
public enum Productos {

    // Aquí tenemos una clase Enum donde vamos a meter los productos y sus precios
    toallitas(1, "Toallitas", 2.0),
    papelHigienico(2, "Papel Higienico", 2.0),
    cocaCola(3, "Coca-Cola", 1.7),
    barraPan(4, "2 Barras de Pan", 1.0),
    botellaLejia(5, "Botella de lejía", 2.0),
    pastaDiente(6, "pasta de dientes", 2.0),
    botellaAceite(7, "botella de aceite", 4.0),
    bolsaPatatasFritas(8, "Bolsa de patatas fritas", 2.0),
    packCervezas(9, "Pack de Cervezas", 3.0),
    bolsaPapaDelta(10, "Bolsa de Papa Delta", 1.0),
    kikos(11, "Kikos Mistercorn", 1.5),
    paqueteLentejas(12, "Paquete de lentejas", 1.5),
    paqueteGarbanzos(13, "Paquete de garbanzos", 1.5),
    fideosChinos(14, "Fideos Chinos rápidos", 1.5),
    judiasLata(15, "Judías de lata litoral", 1.5),
    azucar(16, "Azúcar", 1.5);

    private int codigo;
    private String descripcion;
    private double precio;

    // Constructor con por parametros para 
    private Productos(int codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Código del producto: " + getCodigo() + ""
                + "\n Detalles del producto: " + getDescripcion() + ""
                + "\n Precio: " + getPrecio();
    }

}
