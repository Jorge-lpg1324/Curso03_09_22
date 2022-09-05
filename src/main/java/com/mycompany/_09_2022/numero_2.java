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


public class numero_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
        
        Scanner comp = new Scanner(System.in);
        
        System.out.println("Por favor escriba una cantidad: ");
        
        num = comp.nextInt();
        
        if(num < 0){
            
            System.out.println(num + " Es un número negativo." );  
            
        }else{
            
            System.out.println(num + " Es un número positivo." );
            
        }
        
        
    }
    
}
