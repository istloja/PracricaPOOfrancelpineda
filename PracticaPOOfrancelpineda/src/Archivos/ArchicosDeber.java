/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ISTLOJA V
 */
public class ArchicosDeber {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1 para en listar los archivos que estan en los documentos");
        System.out.println("2 para en listar los archivos de imagen");
        System.out.println("3  para en listar los archivos de musica");
        System.out.println("4 para en listar los archivos de musica");
        System.out.println("5  para en listar los archivos de netbeans");
        int opc = 0;
        try {
            opc = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese el numero correcto");
        }
        switch (opc) {
            case 1:
                File carpeta = new File("C:\\Users\\ISTLOJA V\\Documents");
                String[] arregloarchivos = carpeta.list();
                for (int i = 0; i < arregloarchivos.length; i++) {
                    System.out.println(arregloarchivos[i]);
                }
                break;
            case 2:
                File carpeta2 = new File("C:\\Users\\ISTLOJA V\\Pictures");
                String[] arregloarchivoss = carpeta2.list();
                for (int i = 0; i < arregloarchivoss.length; i++) {
                    System.out.println(arregloarchivoss[i]);
                }
                break;
            case 3:
                File carpeta3 = new File("C:\\Users\\ISTLOJA V\\Music");
                String[] arregloarchivosss = carpeta3.list();
                for (int i = 0; i < arregloarchivosss.length; i++) {
                    System.out.println(arregloarchivosss[i]);
                }
                break;
            case 4:
                File carpeta4 = new File("C:\\Users\\ISTLOJA V\\Videos");
                String[] arregloarchivos4 = carpeta4.list();
                for (int i = 0; i < arregloarchivos4.length; i++) {
                    System.out.println(arregloarchivos4[i]);
                }
                break;
            case 5:
                File carpeta5 = new File("C:\\Users\\ISTLOJA V\\Documents/NetBeansProjects");
                String[] arregloarchivosr = carpeta5.list();
                for (int i = 0; i < arregloarchivosr.length; i++) {
                    System.out.println(arregloarchivosr[i]);
                }
                break;

        }
    }

}


