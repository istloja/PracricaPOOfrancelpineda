/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber;

/**
 *
 * @author benito
 */
public class Valormasgrande {
      public static void main(String[] args) {
        double numeromayor;
        int posicion;
        String[] nombres = {"Ivan", "Elena", "Juan", "Sofia", "Jota", "Estela"};
        double[] sueldos = {1500.56, 1456.98, 1010.0, 2000, 1859.05, 2500, 2100.56, 1001.23};

        numeromayor = sueldos[0];

        for(int i=0; i<sueldos.length && i<nombres.length; i++){
//          System.out.println(nombres[i] + " " + sueldos[i]);
            if(sueldos[i]>numeromayor){ // 
                numeromayor = sueldos[i];
                System.out.println(numeromayor);
            }
        }

    }

}

