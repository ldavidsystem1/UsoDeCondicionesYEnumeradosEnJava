package main;
import static enumerados.Valores.DOLAR;
import javax.swing.*;
import static enumerados.Constantes.*;


public class Main {

    public static void main(String[] args) {
        
        String valor= JOptionPane.showInputDialog(null,MENSAJE_INGRESO_VALOR.getMensaje());

        int val = Integer.parseInt(valor);

        if (val >= DOLAR.getValor()){
            JOptionPane.showMessageDialog(null,MENSAJE_DOLAR_ALTO.getMensaje());
        }
        else{
            JOptionPane.showMessageDialog(null,MENSAJE_DOLAR_BAJO.getMensaje());

        }


        JOptionPane.showMessageDialog(null, MENSAJE_CUADRO.getMensaje(), "Prueba de mensaje", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, MENSAJE_TITULO.getMensaje(), "Prueba de mensaje", JOptionPane.ERROR_MESSAGE);

    }
}
