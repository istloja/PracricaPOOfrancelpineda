/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber34;


public class Individual extends  Deportes  {
   private boolean esindividualista;
    private boolean Nacenlasjugadasdeusted;
    private int numeroqueporta;
    private boolean esdelantero;
     public Individual() {
         
     }

    public Individual(boolean esindividualista, boolean Nacenlasjugadasdeusted, int numeroqueporta, boolean esdelantero, int tiempojugando) {
        this.esindividualista = esindividualista;
        this.Nacenlasjugadasdeusted = Nacenlasjugadasdeusted;
        this.numeroqueporta = numeroqueporta;
        this.esdelantero = esdelantero;
        this.tiempojugando = tiempojugando;
    }

    public Individual(boolean esindividualista, boolean Nacenlasjugadasdeusted, int numeroqueporta, boolean esdelantero, int tiempojugando, String nombre, int edad, double peso, double altura, String posicion) {
        super(nombre, edad, peso, altura, posicion);
        this.esindividualista = esindividualista;
        this.Nacenlasjugadasdeusted = Nacenlasjugadasdeusted;
        this.numeroqueporta = numeroqueporta;
        this.esdelantero = esdelantero;
        this.tiempojugando = tiempojugando;
    }
    public boolean isEsindividualista() {
        return esindividualista;
    }

    public void setEsindividualista(boolean esindividualista) {
        this.esindividualista = esindividualista;
    }

    public boolean isNacenlasjugadasdeusted() {
        return Nacenlasjugadasdeusted;
    }

    public void setNacenlasjugadasdeusted(boolean Nacenlasjugadasdeusted) {
        this.Nacenlasjugadasdeusted = Nacenlasjugadasdeusted;
    }

    public int getNumeroqueporta() {
        return numeroqueporta;
    }

    public void setNumeroqueporta(int numeroqueporta) {
        this.numeroqueporta = numeroqueporta;
    }

    public boolean isEsdelantero() {
        return esdelantero;
    }

    public void setEsdelantero(boolean esdelantero) {
        this.esdelantero = esdelantero;
    }

    public int getTiempojugando() {
        return tiempojugando;
    }

    public void setTiempojugando(int tiempojugando) {
        this.tiempojugando = tiempojugando;
    }
    private int tiempojugando;
}
