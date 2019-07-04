/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ISTLOJA V
 */
public class Colas {
    public static void main(String[] args) {
         

        Queue cola=new LinkedList();

            cola.offer(3);
            cola.add(14);
            cola.offer(12);
            cola.add(7);
            cola.offer(10);
  
        System.out.println("Cola llena: " + cola);
  
        while(cola.poll()!=null){
            System.out.println(cola.peek());
        }

        System.out.println(cola.peek());     
    }
     
}
 

