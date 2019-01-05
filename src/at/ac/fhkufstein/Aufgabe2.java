package at.ac.fhkufstein;

import javax.swing.*;
import java.util.Random;

public class Aufgabe2 {

    public static void main(String[] args)
    {
        int groesse = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));//Grösse bestimmen indem man den Benutzer auffordert eine zahl einzugeben
        int[] array = new int[groesse];//array erstellen

        for(int i = 0; i < groesse; i++)
        {
            Random zahl = new Random();//zufallszahl erzeugen

            array[i] = zahl.nextInt(1000);//wie gross die obergrenze ist
        }

        for(int i = array.length-1; i >= 0; i--)//rückwärts ausgeben
        {
            System.out.println(array[i]);
        }
    }
}