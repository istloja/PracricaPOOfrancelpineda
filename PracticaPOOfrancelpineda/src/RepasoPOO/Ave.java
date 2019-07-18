/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author ISTLOJA V
 */
public class Ave  extends Animal{
       private int Numerodehuevos;
       private boolean Vuela;

    public Ave() {
    }

    public Ave(int Numerodehuevos, boolean Vuela, String nombre, int edad, double peso, double altura, String color) {
        super(nombre, edad, peso, altura, color);
        this.Numerodehuevos = Numerodehuevos;
        this.Vuela = Vuela;
    }


    public int getNumerodehuevos() {
        return Numerodehuevos;
    }

    public void setNumerodehuevos(int Numerodehuevos) {
        this.Numerodehuevos = Numerodehuevos;
    }

    public boolean isVuela() {
        return Vuela;
    }

    public void setVuela(boolean Vuela) {
        this.Vuela = Vuela;
    }
}