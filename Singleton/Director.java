/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author andre
 */
public class Director {
     private static volatile Director instance = new Director();
     
     public void convocarAsamblea(){
         System.out.println("Todos los estudiantes deben asistir a la asamblea");
     }
     public void detention(){
         System.out.println("Se notifica detencion por faltar a asamblea");
     }
     public void rondarPasillo(){
         System.out.println("El director ronda los pasillos para cerciorarse que las reglas se cumplan (molestar porque no tiene nada que hacer)");
     }
     public static Director getInstance() {
        return instance;
    }
}
