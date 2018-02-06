package com.sergio.metodos;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Metodos {

ArrayList<Libros> libreria = new ArrayList<>();

public void engadirlibro(){
    Libros lib = new Libros(
                 JOptionPane.showInputDialog("Inserte Titulo"),
                 JOptionPane.showInputDialog("Inserte Autor"),
                 JOptionPane.showInputDialog("Inserte ISBN"),
                 Integer.parseInt(JOptionPane.showInputDialog("Inserte Precio")),
                 Integer.parseInt(JOptionPane.showInputDialog("Inserte o numero de unidades")));
    
    libreria.add(lib);
}

public void venderlibro(){
    System.out.println(libreria.get(0).toString());
    String isbn = (JOptionPane.showInputDialog("Inserte el ISBN de el libro a vender"));
    if(libreria.size()==0){
        JOptionPane.showMessageDialog(null, "Primero Añada un Libro");
         int r = JOptionPane.showConfirmDialog(null, "Deseas añadir un libro ahora?");
            if(r== JOptionPane.YES_OPTION){
                this.engadirlibro();
            }else{
                System.exit(0);
            }
    } else{
    for(int i =0; i<libreria.size();i++){
        if(isbn==libreria.get(i).getIsbn()){
            if(libreria.get(i).getNunidades()>0){
                libreria.get(i).setNunidades(libreria.get(i).getNunidades()-1);
            }
    }else{
            System.out.println("Ese libro no existe");
        }
}
    }
}

public void amosar(){
    if(libreria.size()>=1){
            Collections.sort(libreria);
            for(Libros variable: libreria)
                JOptionPane.showMessageDialog(null, variable.toString());
            }else
            JOptionPane.showMessageDialog(null,"No hay libros para mostrar.");
            int r = JOptionPane.showConfirmDialog(null, "Deseas añadir un libro ahora?");
            if(r== JOptionPane.YES_OPTION){
                this.engadirlibro();
            }else{
                System.exit(0);
            }
    }


public void darDeBaixa(){
    String isbn = (JOptionPane.showInputDialog("Inserte el ISBN del libro que desea dar de baja"));
    if(libreria.size()==0){
        JOptionPane.showMessageDialog(null, "Primero se han de añadir libros");
         int r = JOptionPane.showConfirmDialog(null, "Deseas añadir un libro ahora?");
            if(r== JOptionPane.YES_OPTION){
                this.engadirlibro();
            }else{
                System.exit(0);
            }
    }
    for(int i =0; i<libreria.size(); i++){
    if(isbn==libreria.get(i).getIsbn()){
        libreria.remove(isbn);
    } else{
        if(libreria.get(i).nunidades>0){
            System.out.println("Ese libro no puede ser dado de baja");
        } else{
            System.out.println("Ese libro no existe");
        }
    }}
}

public String consultar(){
    int k = Integer.parseInt(JOptionPane.showInputDialog("Inserte el libro a consultar"));
    if(libreria.size()==0){
        JOptionPane.showMessageDialog(null, "Primero se ha de añadir un Libro");
         int r = JOptionPane.showConfirmDialog(null, "Deseas añadir un libro ahora?");
            if(r== JOptionPane.YES_OPTION){
                this.engadirlibro();
            }else{
                System.exit(0);
            }
    }else{
        if(k>libreria.size()){
        System.out.println("Ese libro no existe");
    } else{
        JOptionPane.showMessageDialog(null, libreria.get(k).toString());
    }}
    return libreria.get(k).toString();
    
}
}
