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


public class numero_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         int n1, n2, n3;
        
        
        Scanner ord = new Scanner(System.in);
        
        System.out.println("Por favor escriba la primer cantidad: ");
        
        n1 = ord.nextInt();
        
        System.out.println("Por favor escriba la segunda cantidad: ");
        n2 = ord.nextInt();
        
        System.out.println("Por favor escriba la tercer cantidad: ");
        n3 = ord.nextInt();
        
        if((n1 > n2) && (n2 > n3)){
            
            System.out.println(n1 + " - " + n2 + " - " + n3);  
           
           
        }
        
        else if((n1 > n3) && (n3 > n2)){
            
            System.out.println(n1 + " - " + n3 + " - " + n2);  
           
           
        }
        
        else if((n2 > n1) && (n1 > n3)){
            
            System.out.println(n2 + " - " + n1 + " - " + n3);  
           
           
        }
        
        else if((n2 > n3) && (n3 > n1)){
            
            System.out.println(n2 + " - " + n3 + " - " + n1);  
           
           
        }
        
        else if((n3 > n1) && (n1 > n2)){
            
            System.out.println(n3 + " - " + n1 + " - " + n2);  
           
           
        }
        
        else if((n3 > n2) && (n2 > n1)){
            
            System.out.println(n3 + " - " + n2 + " - " + n1);  
           
           
        }
        
        
        
        
        
        else{
            
            System.out.println("Las cantidades son iguales");   
        }
        
        
        
        
    }
    
}
