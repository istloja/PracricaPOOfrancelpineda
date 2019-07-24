/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;

/**
 *
 * @author ISTLOJA V
 */
public class Archivoss{
    public static void main(String[] args) {
        File archivo=new File("C://Users//IST.LOJA V//Dresktop/ejemplo.txt");//creando un objeto de la clase archivo
       //en las comillas ba el nomnre y la direccion del archivo
        System.out.println(archivo.exists());
        //para saveer si es una carpeta o no
        System.out.println(archivo.isDirectory());
        //para saver si es un archivo o no
        System.out.println(archivo.isFile());
        //para saver si un archivo esta oculto o no
        System.out.println(archivo.isHidden());
        //para saver la ultima fechA DE MODIFICACUION
        System.out.println(archivo.lastModified());
        archivo.delete();
        
        File carpeta= new File("C://Users//IST.LOJA V//Dresktop/");
        //carpeta.list devuelve unarreglo con los archivos de una carpeta
        String [] arregloarchivos=carpeta.list();
        for (int i = 0; 1 < arregloarchivos.length; i++){
            System.out.println(arregloarchivos[i]);
        }
    }
}
