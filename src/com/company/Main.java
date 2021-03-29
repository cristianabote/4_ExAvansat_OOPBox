package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Fie o multime de N cutii numerotate de la 1 la N.Fiecare cutie este caracterizata de un id(nr scris pe ea),
            //latime, lungime si inaltime.Cutiile sunt simulate folosind clasa Box.
            //*Implementati constructorul pentru aceasta clasa.
            //*Implementati o metoda ce intoarce volumul cutiei.
        //*Verificati daca putem pune toate cutiile una in interiorul celeilalte astfel incat la final sa avem o singura
        //cutie .Daca se poate printati ordinea cutiilor, de la exterior spre interior, folosind formatul dat.
        //In caz contrar, printati "Nu se poate".

        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti numarul de cutii: ");
        int nrBox=scan.nextInt();
        Box [] boxCollection=new Box[nrBox];
        for(int i=0; i<nrBox;i++) { //citim de la tastatura detaliile despre cele N cutii
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
            System.out.println("Aria cutiei " + (i + 1) + " = " + box.Area());
            boxCollection[i] = box;
            //System.out.println(boxCollection[i].toString());
            System.out.println(" ");
        }
        Arrays.sort(boxCollection);
        int found=0;
        Box current=boxCollection[0];
        for(int i=0; i<nrBox&&found==0;i++) {
            System.out.println(boxCollection[i].toString());
            if ((current.getLatime() < boxCollection[i].getLatime()) || (current.getInaltime() < boxCollection[i].getInaltime())) {
                found = 1;
                current = boxCollection[i];
            }
        }
        if(found==1){
            System.out.println("Nu se pot introduce cutiile unele in celelalte.");
        }else{
            System.out.println("Cutiile intra una in cealalta iar ordinea lor este cea de mai sus. ");
            }
        }
    }

