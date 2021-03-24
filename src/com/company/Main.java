package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Fie o multime de N cutii numerotate de la 1 la N.Fiecare cutie este caracterizata de un id(nr scris pe ea),
            //latime, lungime si inaltime.Cutiile sunt simulate folosind clasa Box.
            //*Implementati constructorul pentru aceasta clasa.
            //*Implementati o metoda ce intoarce volumul cutiei.

        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti numarul de cutii: ");
        int nrCutii=scan.nextInt();
        int[] boxArray=new int[nrCutii];
        for(int i=0; i<nrCutii;i++) { //citim de la tastatura detaliile despre cele N cutii
            System.out.println("Introduceti id cutiei " + (i + 1));
            int id = scan.nextInt();
            System.out.println("Introduceti latimea cutiei " + (i + 1));
            int latime = scan.nextInt();
            System.out.println("Introduceti lungimea cutiei " + (i + 1));
            int lungime = scan.nextInt();
            System.out.println("Introduceti inaltime cutiei " + (i + 1));
            int inaltime = scan.nextInt();
            Box box = new Box(id, latime, lungime, inaltime);
            System.out.println("Volumul cutiei " + (i + 1) + " = " + box.Volume());
        }
    }
}
