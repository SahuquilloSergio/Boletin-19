package com.sergio.metodos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos {

ArrayList<Libros> libreria = new ArrayList<>();

public void engadirlibro(Libros e){
    libreria.add(e);
}

public void venderlibro(String isbn){
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

public void darDeBaixa(int k){
    if(k>libreria.size()){
        System.out.println("Ese libro no existe");
    } else{
        if(libreria.get(k).nunidades>0){
            System.out.println("Ese libro no puede ser dado de baja");
        } else{
            libreria.remove(k);
        }
    }
}

public String consultar(int k){
    if(k>libreria.size()){
        System.out.println("Ese libro no existe");
    } else{
        JOptionPane.showMessageDialog(null, libreria.get(k).toString());
    }
    return libreria.get(k).toString();

}
}
