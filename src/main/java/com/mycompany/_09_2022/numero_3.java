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

public class numero_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int n1, n2;
        
        Scanner ord = new Scanner(System.in);
        
        System.out.println("Por favor escriba la primer cantidad: ");
        
        n1 = ord.nextInt();
        
        System.out.println("Por favor escriba la segunda cantidad: ");
        n2 = ord.nextInt();
        
        
        if(n1 > n2){
            
            System.out.println(n1 + " es un número mayor ya que " + n2 + " es  un número menor");  
            
        }else{
            
            System.out.println(n2 + " es un número mayor ya que " + n1 + " es un número menor");   
        }
        
        
        
    }
    
}
