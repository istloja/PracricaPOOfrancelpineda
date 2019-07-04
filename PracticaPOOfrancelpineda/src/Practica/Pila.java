/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

/**
 *
 * @author ISTLOJA V
 */
class Pila {
    private int[] pila;
 private int top;
 private int tamanioPila;
  
 public Pila(){
  tamanioPila = 1;
  top = -1;
  pila = new int[tamanioPila];
 }
  
 //las operaciones basicas de la pila
 public void push(int dato){
  if (top == (tamanioPila -1))
   redimensionar();
  pila[++top] = dato;
 }
  
 public Integer pop(){
  if(top < 0)
   return null;
  return pila[top--];
 }
  
 private void redimensionar(){
  int[] temp = pila;
  tamanioPila *= 2;
  pila = new int[tamanioPila];
   
  for(int i = 0; i <= top; i++)
   pila[i] = temp[i];
 }
}

