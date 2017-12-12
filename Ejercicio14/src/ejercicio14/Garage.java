package ejercicio14;

import javax.swing.JOptionPane;

/**
 * @author Arturo
 */
public class Garage{

    private int numeroCoches=0, totalGarage=5;

    public Garage(){
    }

    public void entradaGaraxe(Object Coche){
        if(numeroCoches<totalGarage){
            JOptionPane.showMessageDialog(null, "Plazas Disponibles entra: "+Coche);
            System.out.println(Coche.toString());
            numeroCoches++;
            
        }else{
            JOptionPane.showMessageDialog(null, "COMPLETO!!");
        }
    }

    public void saidaGaraxe(Object Coche){
        float tiempo, precio, pago;
        if(numeroCoches!=0){
            tiempo=Float.parseFloat(JOptionPane.showInputDialog("Tiempo en el garaje? en horas"));
            if(tiempo<=3){
                precio=1.5f;
            }else{
                precio=1.5f+((tiempo-3)*0.20f);
            }
            JOptionPane.showMessageDialog(null, "Precio de la estancia: "+precio+" €");
            pago=Float.parseFloat(JOptionPane.showInputDialog("Dinero entregado €"));
            JOptionPane.showMessageDialog(null, "Factura\n------------------\n"
                    + "Matricula Coche "+Coche.toString()+"\n"
                    + "Tiempo "+tiempo+" h\n"
                    + "Precio "+precio+" €\n"
                    + "Dinero entregado "+pago+" €\n"
                    + "Dinero devuelto "+(pago-precio)+" €");
            numeroCoches--;
            JOptionPane.showMessageDialog(null,"Gracias por usar nuestro aparcamiento");
        }else{
            JOptionPane.showMessageDialog(null, "Garage vacio");
        }
    }

    public void rexistroMatricula(){

    }

    public void plazasRestantes(){
        JOptionPane.showMessageDialog(null, "Plazas Restantes: "+(totalGarage-numeroCoches));
    }
}
