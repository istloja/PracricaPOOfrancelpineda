/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber34;


public class Deportes {
    private int  nombre;
    private int edad;
    private double peso;
    public Deportes(){
        
    }

    

    public Deportes(String nombre, int edad, double peso, double altura, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.posicion = posicion;
    }

   

    public int getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    private double altura;
    private String posicion;
    
    public  void nombreFutbol() {
        System.out.println("hola soy un Futbolista");
    }
    public String informacionFutbol(){
        String informacion= nombre+" "+posicion+" "+edad+" "+altura+" "+peso;
        return informacion;
    }
    public static void main(String[] args) {
        Deportes objeto=new Deportes ();
        objeto.setNombre("Pedro");
        objeto.setEdad(18);
        objeto.setAltura(175);
        objeto.setPeso(64);
        objeto.setPosicion("Defenza");
        System.out.println(objeto.informacionFutbol());
        
    }

    boolean InformacionAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean informacionDeportes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    





    

