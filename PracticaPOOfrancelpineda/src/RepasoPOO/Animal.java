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
public class Animal {
    private String  nombre;
    private int edad;
    private double peso;
    private double altura;
    private String color;
//contructor para inicialisar
    public Animal() {
    }

    public Animal(String nombre, int edad, double peso, double altura, String color) {
        this.nombre = nombre;
        this.edad= edad;
        this.peso = peso;
        this.altura = altura;
        this.color = color;
    }
    

    public String getNombre() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public  void nombreAnimal() {
        System.out.println("hola soy un animal");
    }
    public String informaciomAnimal(){
        String informacion= nombre+" "+color+" "+edad+" "+altura+" "+peso;
        return informacion;
    }
    public static void main(String[] args) {
        Animal objeto=new Animal ();
        objeto.setNombre("perro");
        objeto.setEdad(10);
        objeto.setAltura(15);
        objeto.setPeso(15);
        objeto.setColor("negro");
        System.out.println(objeto.informaciomAnimal());
        Animal objeto1= new  Animal("gato",5,8,10,"verde");
        System.out.println(objeto1.informaciomAnimal());
    }
    
}

