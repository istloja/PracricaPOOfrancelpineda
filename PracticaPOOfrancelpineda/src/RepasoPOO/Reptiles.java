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
public class Reptiles  extends Animal{
    private double animalesvertebrados;
    private  boolean Escamas;

    public Reptiles() {
    }

    public Reptiles(double animalesvertebrados, boolean Escamas, String nombre, int edad, double peso, double altura, String color) {
        super(nombre, edad, peso, altura, color);
        this.animalesvertebrados = animalesvertebrados;
        this.Escamas = Escamas;
    }
    

    public double getAnimalesvertebrados() {
        return animalesvertebrados;
    }

    public void setAnimalesvertebrados(double animalesvertebrados) {
        this.animalesvertebrados = animalesvertebrados;
    }

    public boolean isEscamas() {
        return Escamas;
    }

    public void setEscamas(boolean Escamas) {
        this.Escamas = Escamas;
    }
    
    
}
