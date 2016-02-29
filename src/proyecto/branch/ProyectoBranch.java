/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.branch;

import javax.swing.JOptionPane;

/**
 *
 * @author balva
 */
public class ProyectoBranch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce o 1º numero"));
       int pedido=Integer.parseInt(JOptionPane.showInputDialog("Introduce o 2º numero"));
       JOptionPane.showMessageDialog(null, numero +"+"+ pedido+" = " + (numero*pedido));
    }
    
}
