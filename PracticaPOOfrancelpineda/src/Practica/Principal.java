/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ISTLOJA V
 */
public class Principal {
    public static void main(String[] args) {
Stack pila = new Stack();
Scanner leer = new Scanner(System.in);
System.out.println("ingrese cantidad de la pila..");
int n=leer.nextInt();
int i0 = 2;
for(int i=1; i<n;i++){

System.out.println("Ingrese numero…");
i0=leer.nextInt();
pila.push(Integer.toString(i0));

}
System.out.println(i0);

System.out.println("Desapilar");

while(!pila.empty())
System.out.println(pila.pop());
}

}