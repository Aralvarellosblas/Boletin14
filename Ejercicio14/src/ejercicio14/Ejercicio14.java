package ejercicio14;

import javax.swing.JOptionPane;

/**
 * @author Arturo
 */
public class Ejercicio14{

    public static void main(String[] args){
        Garage g1=new Garage();

        Coche coche1=new Coche(JOptionPane.showInputDialog("Introdicir Matrícula Coche 1"));
        Coche coche2=new Coche(JOptionPane.showInputDialog("Introdicir Matrícula Coche 2"));
        Coche coche3=new Coche(JOptionPane.showInputDialog("Introdicir Matrícula Coche 3"));
//        Coche coche4=new Coche(JOptionPane.showInputDialog("Introdicir Matrícula Coche 4"));
//        Coche coche5=new Coche(JOptionPane.showInputDialog("Introdicir Matrícula Coche 5"));
//        Coche coche6=new Coche(JOptionPane.showInputDialog("Introdicir Matrícula Coche 6"));
        
        g1.entradaGaraxe(coche1);
        g1.entradaGaraxe(coche2);
        g1.entradaGaraxe(coche3);
        g1.saidaGaraxe(coche2);
        
        
        
    }

}
