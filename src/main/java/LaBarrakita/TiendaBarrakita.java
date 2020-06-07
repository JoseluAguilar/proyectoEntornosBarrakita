/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaBarrakita;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class TiendaBarrakita {

    public static void main(String[] args) {
        CajaUno caja1 = new CajaUno();
        CajaDos caja2 = new CajaDos();
        CajaTres caja3 = new CajaTres();
        CajaCuatro caja4 = new CajaCuatro();
        CajaCinco caja5 = new CajaCinco();

        Scanner entrada = new Scanner(System.in);
        int eleccion;

        System.out.println("Bienvenido a la Barrakita");
        do {
            System.out.println("Seleccione una de las cajas que tenemos");
            System.out.println("------------------------------------------");
            System.out.println(caja1.getDescripcion());
            System.out.println("------------------------------------------");
            System.out.println(caja2.getDescripcion());
            System.out.println("------------------------------------------");
            System.out.println(caja3.getDescripcion());
            System.out.println("------------------------------------------");
            System.out.println(caja4.getDescripcion());
            System.out.println("------------------------------------------");
            System.out.println(caja5.getDescripcion());
            System.out.println("------------------------------------------");
            System.out.println("Si no desea nada pulse 6");

            eleccion = entrada.nextInt();
        } while (eleccion < 0 || eleccion > 7);

        switch (eleccion) {
            case 1:
                System.out.println("Este es el precio de que tiene que pagar por la caja 1: ");
                System.out.println(caja1.precio() + "€");
                break;
            case 2:
                System.out.println("Este es el precio de que tiene que pagar por la caja 2: ");
                System.out.println(caja2.precio() + "€");
                break;
            case 3:
                System.out.println("Este es el precio de que tiene que pagar por la caja 3: ");
                System.out.println(caja3.precio() + "€");
                break;
            case 4:
                System.out.println("Este es el precio de que tiene que pagar por la caja 4: ");
                System.out.println(caja4.precio() + "€");
                break;
            case 5:
                gestionCaja5();
                break;
            case 6:
                System.exit(0);
        }

    }

    public static void gestionCaja5() {
        CajaCinco caja5 = new CajaCinco();
        Scanner entrada = new Scanner(System.in);
        int limite = 6;
        System.out.println("PRODUCTOS DE LA CAJA 5");
        caja5.getProductosExistentes().forEach(System.out::println);
        do {

            System.out.println("El límite de productos es " + limite);

            int opcion = entrada.nextInt();

            caja5.añadirProductos(opcion);

            limite--;

        } while (limite != 0);

        caja5.precio();
        System.out.print("€");

    }

}
