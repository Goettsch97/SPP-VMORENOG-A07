/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.vmorenog.a07;

import java.util.Scanner;

/**
 *
 * @author Jaime Jr
 */
public class SPPVMORENOGA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PROGRAMA DE ARREGLOS
        int num;
        String [] telefono = new String[10];
        Scanner kb = new Scanner (System.in);
        for (int i = 0; i < telefono.length; i++){
            System.out.println("Introduce el numero telefonico " + i);
            telefono[i] = kb.nextLine();
        }
        System.out.println("introduzca el numero ");
        num= kb.nextInt();
        if (num < telefono.length){
        System.out.println("El numero es " + telefono[num]);
        } else System.out.println("FUERA DE RANGO.");
        
        
        
        
        
    }
    
    public static void arrelgo(){
        
    }
    
}
