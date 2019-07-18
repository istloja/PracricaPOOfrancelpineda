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
public class Anfibios extends Animal {
    private  String vertebradosTerrestres;
    private boolean piel;

    public Anfibios() {
    }

    public Anfibios(String vertebradosTerrestres, boolean piel, String nombre, int edad, double peso, double altura, String color) {
        super(nombre, edad, peso, altura, color);
        this.vertebradosTerrestres = vertebradosTerrestres;
        this.piel = piel;
    }
    

    public String getVertebradosTerrestres() {
        return vertebradosTerrestres;
    }

    public void setVertebradosTerrestres(String vertebradosTerrestres) {
        this.vertebradosTerrestres = vertebradosTerrestres;
    }

    public boolean isPiel() {
        return piel;
    }

    public void setPiel(boolean piel) {
        this.piel = piel;
    }
    
}
