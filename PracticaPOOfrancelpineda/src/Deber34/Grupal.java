/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber34;

 class Grupal extends  Deportes {
     private boolean Seleciona;
    private boolean esarquero;
    private int numeroquelleva;
    private boolean tienetarjetasamarillas;
    private boolean juega;
    public Grupal(){
        
    }

    public Grupal(boolean Seleciona, boolean esarquero, int numeroquelleva, boolean tienetarjetasamarillas, boolean juega) {
        this.Seleciona = Seleciona;
        this.esarquero = esarquero;
        this.numeroquelleva = numeroquelleva;
        this.tienetarjetasamarillas = tienetarjetasamarillas;
        this.juega = juega;
    }

    public Grupal(boolean Seleciona, boolean esarquero, int numeroquelleva, boolean tienetarjetasamarillas, boolean juega, String nombre, int edad, double peso, double altura, String posicion) {
        super(nombre, edad, peso, altura, posicion);
        this.Seleciona = Seleciona;
        this.esarquero = esarquero;
        this.numeroquelleva = numeroquelleva;
        this.tienetarjetasamarillas = tienetarjetasamarillas;
        this.juega = juega;
    }
    public boolean isSeleciona() {
        return Seleciona;
    }

    public void setSeleciona(boolean Seleciona) {
        this.Seleciona = Seleciona;
    }

    public boolean isEsarquero() {
        return esarquero;
    }

    public void setEsarquero(boolean esarquero) {
        this.esarquero = esarquero;
    }

    public int getNumeroquelleva() {
        return numeroquelleva;
    }

    public void setNumeroquelleva(int numeroquelleva) {
        this.numeroquelleva = numeroquelleva;
    }

    public boolean isTienetarjetasamarillas() {
        return tienetarjetasamarillas;
    }

    public void setTienetarjetasamarillas(boolean tienetarjetasamarillas) {
        this.tienetarjetasamarillas = tienetarjetasamarillas;
    }

    public boolean isJuega() {
        return juega;
    }

    public void setJuega(boolean juega) {
        this.juega = juega;
    }

}
