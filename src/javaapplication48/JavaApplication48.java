/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Notebook
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          Scanner leer = new Scanner(System.in);
          String resp1 = "";
          String resp2 = "";
          int numerorandom;
          String jugador1 = "";
          String jugador2 = "BOT";
          Random RD = new Random();
          numerorandom = RD.nextInt(3)+1;
          
          System.out.println("PIEDRA, PAEL O TIJERA \n");
          
          System.out.print("Ingrese el nombre del Jugador 1: ");
          
          jugador1 = leer.next();
          
          System.out.println("Iniciar el juego\n");
          System.out.println("La P es Piedra");
          System.out.println("La L es Papel");
          System.out.println("La T es Tijera");
          
          // pedir a los jugadores que ingrese una opcion 
          
          System.out.println("\nINTRODUCE OPCION P/L/T\n" + jugador1 + ":");
          resp1 = leer.next();
          
          
          switch(numerorandom){
              case 1: resp2 = "P";
                break;
              case 2: resp2 = "T";
                break;
              case 3: resp2 = "L";
                break;
          
          }
          
          
          System.out.println("\n La opcion de BOT fue: " + resp2);
          
          //Comparar el dato ingresado
          
          if(resp1.equals("P") && resp2.equals("P")){
              System.out.println("\nEMPATE\n");
          }
          if(resp1.equals("P") && resp2.equals("L")){
              System.out.println("\nGANADOR\n" + jugador2 + "\n");
          }
          if(resp1.equals("P") && resp2.equals("T")){
              System.out.println("\nGanador\n" + jugador1 + "\n");
          }
          
          //*
          if(resp1.equals("L") && resp2.equals("L")){
              System.out.println("\nEMPATE\n");
          }
          if(resp1.equals("L") && resp2.equals("P")){
              System.out.println("\nGANADOR\n" + jugador1 + "\n");
          }
          if(resp1.equals("L") && resp2.equals("T")){
              System.out.println("\nGanador\n" + jugador2 + "\n");
          }
          
          //*
          if(resp1.equals("T") && resp2.equals("T")){
              System.out.println("\nEMPATE\n");
          }
          if(resp1.equals("T") && resp2.equals("P")){
              System.out.println("\nGANADOR\n" + jugador2 + "\n");
          }
          if(resp1.equals("T") && resp2.equals("L")){
              System.out.println("\nGanador\n" + jugador1 + "\n");
          }
          
          System.out.println("Gracias por jugar!!!");
          
          
          
          
    }
    
}
