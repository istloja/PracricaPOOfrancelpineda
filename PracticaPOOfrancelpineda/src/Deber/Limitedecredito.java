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
public class Limitedecredito {
      public void calcularSaldo(double saldoInicio, 
            double totalArticulos, double totalCreditos) {
        double nuevoSaldo = saldoInicio + totalArticulos - totalCreditos;
        System.out.println("Su nuevo saldo es: " + nuevoSaldo);
          double limiteCredito = 0;
        if (nuevoSaldo > limiteCredito) {
            System.out.println("Se excedió el límite de su crédito");
        }
    }

}
