package tarea.pkg1;

import javax.swing.*;

public class Tarea1 {

    public static void main(String[] args) {

        int suma = 0;
        int resta = 0;
        int division = 0;
        int multi = 0;
        boolean NumPrimo = true;
        int menu;

        menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu: \n 1. Suma \n 2.Resta"
                + "\n 3. División \n 4. Multiplicación \n 5. Numero primo"));

        if (menu == 1) {

            JOptionPane.showMessageDialog(null, "Vamos a sumar");
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor para sumar."));
            int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor para sumar."));

            suma = x + y;

            JOptionPane.showMessageDialog(null, "La suma es: " + suma);
            
        }
        if (menu == 2) {
            JOptionPane.showMessageDialog(null, "Vamos a restar");
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor para restar."));
            int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor para restar."));

            resta = x - y;

            JOptionPane.showMessageDialog(null, "La restar es: " + resta);
        }
        if (menu == 3) {
            JOptionPane.showMessageDialog(null, "Vamos a dividir ");
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dividendo."));
            int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el divisor."));

            division = x / y;

            JOptionPane.showMessageDialog(null, "La dividisón es: " + division);
        }

        if (menu == 4) {
            JOptionPane.showMessageDialog(null, "Vamos a multiplicar ");
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un digito."));
            int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el multiplicador."));

            multi = x * y;

            JOptionPane.showMessageDialog(null, "La multiplicación es: " + multi);
        }
        if (menu == 5) {
            JOptionPane.showMessageDialog(null, "Sera un numero primo ");
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número."));

            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    NumPrimo = false;
                    break;
                }
            }
            if (NumPrimo) {
                JOptionPane.showMessageDialog(null, "El numero es primo.");
            } else {
                JOptionPane.showMessageDialog(null, "El numero no es primo.");
            }
        }

    }
}
