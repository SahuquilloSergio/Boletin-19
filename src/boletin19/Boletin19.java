package boletin19;

import com.sergio.metodos.Libros;
import com.sergio.metodos.Metodos;
import javax.swing.JOptionPane;

public class Boletin19 {

    public static void main(String[] args) {



Metodos M1 = new Metodos();
        int opcion=0;
      int op;
do{
    op = Integer.parseInt(JOptionPane.showInputDialog("***MENÚ***\n"
                               + "1: Engadir Libro\n"
                               + "2: Vender Libro\n"
                               + "3: Amosar Todos Los Libros\n"
                               + "4: Dar Libro De Baixa\n"
                               + "5: Consultar Libro\n"
                               + "6: Salir\n"));
     switch(op){
         case 1: M1.engadirlibro(new Libros(
                 JOptionPane.showInputDialog("Inserte Titulo"),
                 JOptionPane.showInputDialog("Inserte Autor"),
                 JOptionPane.showInputDialog("Inserte ISBN"),
                 Integer.parseInt(JOptionPane.showInputDialog("Inserte Precio")),
                 Integer.parseInt(JOptionPane.showInputDialog("Inserte o numero de unidades"))));
                    break;
         
         case 2: M1.venderlibro((JOptionPane.showInputDialog("Inserte el ISBN de el libro a vender")));
                    break;
         case 3: 
         case 4: M1.darDeBaixa(Integer.parseInt(JOptionPane.showInputDialog("Inserte el libro que desea dar de baja")));
                    break;
         case 5: M1.consultar(Integer.parseInt(JOptionPane.showInputDialog("Inserte el libro a consultar")));
                    break;
         case 6: System.exit(0);
                    break;

}}while(op<=6);
    
    }
}
