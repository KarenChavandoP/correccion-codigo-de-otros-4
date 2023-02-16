package com.generation;

import java.util.Scanner; //importo ya que usare Scanner

public class Codigo4 {

    public static void main(String[] args) { //Agrego main como publico y recibe el parametro de cadenas de texto

        Scanner s = new Scanner(System.in); //Agrego System.in para el constructor

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        //Scanner s2 = new Scanner():  quito esta línea porque considero que no hace falta

        String j2 = s.nextLine();

        ; if (j1.equals(j2)) { //uso equals para comparar cadenas en vez de == y retro un )
                System.out.println("Empate");
            } else {
                int g = 0;//inicializo en 0 para un posible empate
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) { //uso equals para comparar en vez de ==
                        g = 1;
                    }
                    break; //rompo con un break el case
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    } //cierro el case con una llave
                    break;
                case "tijeras": //escribo en plural tijera
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
                default:
                    break; // rompo con un break
            }
            if (g == 0) { //Agrego funcion para que imprima al ganador
                System.out.println("Gana el jugador 2");
            } else {
                System.out.println("Gana el jugador " + g);
            }
        }

    }

}
