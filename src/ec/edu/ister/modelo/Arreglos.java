/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MARIA LOYA
 */
public class Arreglos {
      private Integer arrayTemperaturas[];
     
     public void dimensionar(){
     int dim=Integer.parseInt( JOptionPane.showInputDialog("Ingrese cuantas temperaturas"));
     arrayTemperaturas=new Integer[dim];
    }
    public int tamaño(){
        return arrayTemperaturas.length;
    }
     public void llenarArreglos(){
         for (int i = 0; i < tamaño(); i++) {
             arrayTemperaturas[i]=(int)(Math.random()*10);
             
         }
     }
     public void imprimir(){
         String acu="";
         for (int i = 0; i < arrayTemperaturas.length; i++) {
             acu +=" "+arrayTemperaturas[i];
            }
         JOptionPane.showMessageDialog(null, acu);
     }
    public void imprimirFacil(){
        
        JOptionPane.showMessageDialog(null,Arrays.toString(arrayTemperaturas));
        
    }
    public void ordenar(){
        Arrays.sort(arrayTemperaturas);
    }
    public void maximo(){
        List<Integer> arr = new ArrayList();
        arr=Arrays.asList(arrayTemperaturas);
        Integer max= Collections.max(arr);
        JOptionPane.showMessageDialog(null,max);
        }
    public void minimo(){
        List<Integer> arr=new ArrayList();
        arr=Arrays.asList(arrayTemperaturas);
        Integer min= Collections.min(arr);
        JOptionPane.showMessageDialog(null, min);
    }
    public void menu(){
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(""
            +"1.- dimensionar\n"
            +"2.- llenarArreglos\n"
            +"3.- imprimir\n"
            +"4.- imprimirFacil\n"
            +"5.- ordenar\n"
            +"6.- maximo\n"
            +"7.- minimo\n"
            +"8.- salir\n"));
            switch(op){
                case 1:
                    dimensionar();
                    break;
                case 2:
                    llenarArreglos();
                    break;
                case 3:
                    imprimir();
                    break;
                case 4:
                    imprimirFacil();
                    break;
                case 5:
                    ordenar();
                    break;
                case 6:
                    maximo();
                    break;
                case 7:
                    minimo();
                    break;
            }
            
        }while(op!=8);
    }
     
}
