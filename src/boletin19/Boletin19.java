package boletin19;

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
         case 1: M1.engadirlibro();
                    break;
         case 2: M1.venderlibro();
                    break;
         case 3: M1.amosar();
                    break;
         case 4: M1.darDeBaixa();
                    break;
         case 5: M1.consultar();
                    break;
         case 6: System.exit(0);
                    break;

}}while(op>=6);
    
    }
}
