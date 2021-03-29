package com.company;

public class Box  implements Comparable<Box>{
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
    public int Area(){
        int area=2*(lungime*inaltime+lungime*latime+inaltime*latime);
        return area;
    }
    public int Volume(){
        int volum=latime*lungime*inaltime;
        return volum;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }

    public int getLatime() {
        return this.latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public int getLungime() {
        return this.lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getInaltime() {
        return this.inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public String toString(){
        return "Id: "+this.id+" latime: "+this.latime+" lungime: "+this.lungime+" inaltime: "+ this.inaltime;
    }

    @Override
    public int compareTo(Box o) {
        if(lungime < o.lungime)
            return 1;
        else if (lungime == o.lungime) return 0;
        else return -1;

    }
}
