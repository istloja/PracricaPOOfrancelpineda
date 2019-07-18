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
public class Ejecutar {
    public static void main(String[] args) {
        Animal objeto=new Animal("jirafa",10,15,12,"amarillo");
        Ave objetoave=new Ave (10,false,"pato",2,8,2,"negro");
        Mamifero objetomamifero=new Mamifero(12,true,"vaca",5,3,45,"blanca ");
        Anfibios objetoanfibios=new Anfibios("es vertebrado",true,"sapo",2,4,8,"verde");
        Reptiles objetoreptiles=new Reptiles(5,true,"cocodrilo",2,4,3,"verde");
        
        System.out.println(objeto.informaciomAnimal());
        System.out.println(objetoave.informaciomAnimal());
        System.out.println(objetomamifero.informaciomAnimal());
        
       
    }
}
