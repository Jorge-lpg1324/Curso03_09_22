/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany._09_2022;

/**
 *
 * @author jorge
 */

import java.util.Scanner;

public class numero_uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1, n2;
        
        
        Scanner comp = new Scanner(System.in);
        
        System.out.println("Por favor escriba la primer cantidad: ");
        
        n1 = comp.nextInt();
        
        System.out.println("Por favor escriba la segunda cantidad: ");
        n2 = comp.nextInt();
        
        
        if(n1 == n2){
            
            System.out.println("Las cantidades son iguales");  
            
        }else{
            
            System.out.println("Las cantidades no son iguales ");
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
