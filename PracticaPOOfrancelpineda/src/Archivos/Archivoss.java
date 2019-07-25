/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ISTLOJA V
 */
public class Archivoss{
//    public static void main(String[] args) {
//        File archivo=new File("C://Users//IST.LOJA V//Dresktop/ejemplo.txt");//creando un objeto de la clase archivo
//       //en las comillas ba el nomnre y la direccion del archivo
//        System.out.println(archivo.exists());
//        //para saveer si es una carpeta o no
//        System.out.println(archivo.isDirectory());
//        //para saver si es un archivo o no
//        System.out.println(archivo.isFile());
//        //para saver si un archivo esta oculto o no
//        System.out.println(archivo.isHidden());
//        //para saver la ultima fechA DE MODIFICACUION
//        System.out.println(archivo.lastModified());
//        archivo.delete();
//        
//        File carpeta= new File("C://Users//IST.LOJA V//Dresktop/");
//        //carpeta.list devuelve unarreglo con los archivos de una carpeta
//        String [] arregloarchivos=carpeta.list();
//        for (int i = 0; 1 < arregloarchivos.length; i++){
//            System.out.println(arregloarchivos[i]);
//        }
//    }
    public static void main(String[] args) {
         Archivoss objeto=new Archivoss();
        objeto.leerArchivos("C:\\Users\\ISTLOJA V\\Desktop/ejemplo.txt");
        objeto.escribirArchivoss("C:\\Users\\ISTLOJA V\\Desktop/ejemplo.txt","texto");
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese un texto");
        texto=entrada.nextLine();
    }
    public void leerArchivos(String direccion){//nos convierte el archivo
    
        File archivo=new File(direccion);
        try{
        FileReader reader=new FileReader(archivo);
        BufferedReader recorrido=new BufferedReader( reader);
        String linea;
        while((linea=recorrido.readLine())!=null){
            System.out.println(linea);
        }
        }catch(Exception e){ //mostra en pantalla el mensaje
        System.out.println(e);
    }
    }
    public void escribirArchivoss(String direccion,String texto){

        try{
        FileWrite archivo=new FileWrite(direccion);
        PrintWriter escribir=new PrintWriter(archivo);
         escribir.println(texto);
         archivo.close();
        
        }catch(Exception e){
            System.out.println(e);
        }
         }


    }

    
        
    



