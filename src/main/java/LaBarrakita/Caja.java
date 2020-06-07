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
public abstract class Caja {

    public String descripcion = "";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double precio();

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
