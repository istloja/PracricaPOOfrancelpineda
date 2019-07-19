/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber34;


public class Ejecutar {
     public static void main(String[] args) {
        Deportes objeto;
        Deportes objeto4 = new Deportes(5,"pedro",200,600,"Amarillo");
        System.out.println(objeto.informacionDeportes());
        Individual objeto1 = new  Individual(8,true,5,"gallina",8,30,"cafe");
        System.out.println(objeto1.informacionDeportes();
        Grupal objeto2 = new Grupal(9,false,19,"elefante",600.5,400,"gris");
        System.out.println(objeto2.informacionDeportes());
       
}

}