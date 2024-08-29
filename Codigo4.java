
package com.generation;

import java.util.Scanner; /*Se importa scanner*/


//El programa recibe dos inputs (jugador 1 y jugador 2) con respuesta (piedra, papel, tijeras) y responde (empate, en caso de haber ingresado la misma respuesta o "Gana el jugador + (número del jugador)", con el ganador, en caso de respuestas diferentes.

public class Codigo4 {

	public static void main(String[] args) {

    Scanner s = new Scanner(System.in); /*(System.in)*/

    
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");/*println para que el nextLine tenga sentido*/
    String j1 = s.nextLine();
    

    /*Scanner s2 = new Scanner(System.in); No es necesario un segundo scanner*/ 
    
    System.out.println("Turno del jugador 2  (introduzca piedra, papel o tijeras): ");/*jugador 1 repetido, se cambia a 2*/
    String j2 = s.nextLine();
    
    if (j1.equals (j2)) { /*Se cambia operador == por .equals ya que String no permite ==*/
    System.out.println("Empate");
  } else {
    int g = 2;
    
    switch(j1) {
      case "piedra":
        if (j2.equals("tijeras")) { /*se cambia == por .equals*/
          g = 1;
        }

      case "papel":
        if (j2.equals("piedra")) {
          g = 1;
        }
        
      case "tijera":
        if (j2.equals("papel")) {
          g = 1;
        }
        break;
      default:
    }
    System.out.println("Gana el jugador " + g);
  
    s.close();
    /*s2.close();*/
    
    }
  
  
}}