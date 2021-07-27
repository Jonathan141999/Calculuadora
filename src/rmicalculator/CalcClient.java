/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicalculator;

import java.rmi.Naming;
import java.util.Scanner;

public class CalcClient {
    public static void main(String args[]){
        System.out.println("MENU");
        System.out.println("");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- Division");
        System.out.println("");
        System.out.println("Escoge un opción");
        
        Scanner sc = new Scanner(System.in);
        try{
            CalcInterface c = (CalcInterface)Naming.lookup("//localhost/Calc");
            int choice = sc.nextInt();
            int x,y;
            switch(choice){
                case 1:{
                    System.out.println("Ingrese el primer número");
                    x=sc.nextInt();
                    System.out.println("Ingrese el segundo número");
                    y=sc.nextInt();
                    System.out.println("El resultado es : "+c.suma(x, y));
                    break;
                }
                case 2:{
                    System.out.println("Ingrese el primer número");
                    x=sc.nextInt();
                    System.out.println("Ingrese el segundo número");
                    y=sc.nextInt();
                    System.out.println("El resultado es : "+c.resta(x, y));
                    break;
                }
                case 3:{
                    System.out.println("Ingrese el primer número");
                    x=sc.nextInt();
                    System.out.println("Ingrese el segundo número");
                    y=sc.nextInt();
                    System.out.println("Resultado es "+c.mul(x, y));
                    break;
                }
                case 4:{
                    System.out.println("Ingrese el primer número");
                    x=sc.nextInt();
                    System.out.println("Ingrese el segundo número");
                    y=sc.nextInt();
                    System.out.println("El resultado es: "+c.div(x, y));
                    break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
