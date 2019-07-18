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
public class Mamifero extends Animal{
    private int tiempodegestacion;
    private boolean pelage;

    public Mamifero() {
    }

    public Mamifero(int tiempodegestacion, boolean pelage, String nombre, int edad, double peso, double altura, String color) {
        super(nombre, edad, peso, altura, color);
        this.tiempodegestacion = tiempodegestacion;
        this.pelage = pelage;
    }

  
    

    public int getTiempodegestacion() {
        return tiempodegestacion;
    }

    public void setTiempodegestacion(int tiempodegestacion) {
        this.tiempodegestacion = tiempodegestacion;
    }

    public boolean isPelage() {
        return pelage;
    }

    public void setPelage(boolean pelage) {
        this.pelage = pelage;
    }
    
}
