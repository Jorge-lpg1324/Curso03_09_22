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


public class numero_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
          
     Scanner sp = new Scanner(System.in);
     
        System.out.println("Por favor ingrese un día: ");
        
        int dia = sp.nextInt();
        
        
        System.out.println("A continuación ingrese un mes: ");
        
      int mes = sp.nextInt();
        
      System.out.println("Por ultimo ingrese un año: ");
        
        int año = sp.nextInt();
        
       
        switch(mes){
            
            case 1 -> {
                if(dia < 31){
                    System.out.println("La fecha es valida");}
                else{
                    System.out.println("El dia no es valido");
                }
            }
            
            case 2 -> {
                if(dia < 28){
                    System.out.println("La fecha es valida");
                }else{
                    System.out.println("El dia no es valido");
                }
            }
            
             
            case 3 -> {
                if(dia < 31){
                    System.out.println("La fecha es valida");
                }else{
                    System.out.println("El dia no es valido");
                }
            }
            
            case 4 -> {
                if(dia < 30){
                    System.out.println("La fecha es valida");
                }else{
                    System.out.println("El dia no es valido");
                }
            }
            
            case 5 -> {
                if(dia < 31){
                    System.out.println("La fecha es valida");
                } else{
                    System.out.println("El dia no es valido");
                }
            }
            
            case 6 -> {
                if(dia < 30){
                    System.out.println("La fecha es valida");
                }else{
                    System.out.println("El dia no es valido");
                }
            }
            
             case 7 -> {
                 if(dia < 31){
                     System.out.println("La fecha es valida");
                 }else{
                     System.out.println("El dia no es valido");
                 }
            }
            
             case 8 -> {
                 if(dia < 31){
                     System.out.println("La fecha es valida");
                 }else{
                     System.out.println("El dia no es valido");
                 }
            }
            
             case 9 -> {
                 if(dia < 30){
                     System.out.println("La fecha es valida");
                 }else{
                     System.out.println("El dia no es valido");
                 }
            }
            
             case 10 -> {
                 if(dia < 31){
                     System.out.println("La fecha es valida");
                 }else{
                     System.out.println("El dia no es valido");
                 }
            }
            
             case 11 -> {
                 if(dia < 30){
                     System.out.println("La fecha es valida");
                 }else{
                     System.out.println("El dia no es valido");
                 }
            }
            
            case 12 -> {
                if(dia < 31){
                    System.out.println("La fecha es valida");
                }else{
                    System.out.println("El dia no es valido");
                }
            }

                        
            default -> System.out.println("La fecha no es invalida, intente nuevamente.");
               
          
            
        }
            
        
        
        
        
    }
    
}
