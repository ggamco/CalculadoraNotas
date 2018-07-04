package com.company.logica;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraNotas {

    //Variable local de la clase. Accesible desde cualquier metodo de la clase.
    private ArrayList<Integer> listaPrecios = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int opcion = 0;

    /**
     * Metodo que inicia el flujo de la aplicacion
     */
    public void iniciarApp() {

        do {
            showMenu();
            comprobarOpcion(opcion);
        } while(opcion != 6);

    }

    /**
     *
     */
    private void showMenu() {
        System.out.println("============================");
        System.out.println("1. Nuevo Precio");
        System.out.println("2. Precio Medio");
        System.out.println("3. Precio Máximo");
        System.out.println("4. Precio Mínimo");
        System.out.println("5. Mostrar todos los precios");
        System.out.println("6. Salir del programa");
        System.out.println();
        System.out.print("Elije una opción: ");
        opcion = sc.nextInt();
        System.out.println("============================");
    }

    /**
     *
     * @param opcion
     */
    private void comprobarOpcion(int opcion){
        switch (opcion) {
            case 1:
                nuevoPrecio();
                break;
            case 2:
                precioMedio();
                break;
            case 3:
                precioMaximo();
                break;
            case 4:
                precioMinimo();
                break;
            case 5:
                mostrarPrecios();
                break;
            case 6:
                //SALIMOS DEL PROGRAMA
                break;
            default:
                System.out.println("La opcion elegida no es valida");
        }
    }

    /**
     *
     */
    private void nuevoPrecio(){
        System.out.print("Introduce un precio: ");
        int nuevoPrecio = sc.nextInt();
        listaPrecios.add(nuevoPrecio);
        System.out.println("============================");
        System.out.println("##### TEST: " + listaPrecios);
        System.out.println("============================");
    }

    /**
     *
     */
    private void precioMedio(){
        int aux = 0;
        for(int precio : listaPrecios){
            aux += precio;
        }
        System.out.println("El precio medio es: " + aux/listaPrecios.size());
    }

    /**
     *
     */
    private void precioMaximo(){
        int aux = 0;
        for(int precio : listaPrecios){
            if(precio > aux){
                aux = precio;
            }
        }
        System.out.println("El precio maximo es: " + aux);
    }

    /**
     *
     */
    private void precioMinimo(){
        int aux = listaPrecios.get(0);
        for(int i = 1; i < listaPrecios.size(); i++){
            if(listaPrecios.get(i) < aux){
                aux = listaPrecios.get(i);
            }
        }
        System.out.println("El precio minimo es: " + aux);
    }

    /**
     *
     */
    private void mostrarPrecios(){
        System.out.println(listaPrecios);
    }


}
