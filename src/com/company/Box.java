package com.company;

public class Box {
    // Fie o multime de N cutii numerotate de la 1 la N.Fiecare cutie este caracterizata de un id(nr scris pe ea),
    //latime, lungime si inaltime.Cutiile sunt simulate folosind clasa Box.
    //*Implementati constructorul pentru aceasta clasa.
    //*Implementati o metoda ce intoarce volumul cutiei.
    //*Verificati daca putem pune toate cutiile una in interiorul celeilalte astfel incat la final sa avem o singura
    //cutie .Daca se poate printati ordinea cutiilor, de la exterior spre interior, folosind formatul dat.
    //In caz contrar, printati "Nu se poate".
    private int id;
    private int latime;
    private int lungime;
    private int inaltime;

    public Box(int id, int latime, int lungime,int inaltime){
        this.id=id;
        this.latime=latime;
        this.lungime=lungime;
        this.inaltime=inaltime;
    }
    public int Volume(){
        int volum=latime*lungime*inaltime;
        return volum;
    }
}
