package com.company;
import java.util.Scanner;

class Osoba {
    Scanner myObj = new Scanner(System.in);
    String imie;
    String nazwisko;
    String ulica;
    String kod;
    String miasto;

    void inicjuj() {

        System.out.println("Podaj imie: ");
        this.imie = myObj.nextLine();

        System.out.println("Podaj nazwisko: ");
        this.nazwisko = myObj.nextLine();

        System.out.println("Podaj ulica: ");
        this.ulica = myObj.nextLine();

        System.out.println("Podaj kod pocztowy: ");
        this.kod = myObj.nextLine();

        System.out.println("Podaj miasto: ");
        this.miasto = myObj.nextLine();
    }
    void drukuj() {
        System.out.println("Imie: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Ulica: " + this.ulica);
        System.out.println("Kod pocztowy: " + this.kod);
        System.out.println("Miasto: " + this.miasto);
    }
}

class Kadra extends Osoba{
    Osoba osoba = new Osoba();
    String wyksztalcenie;
    String stanowisko;

    void inicjuj1() {
        osoba.inicjuj();
        System.out.println("Podaj wyksztalcenie: ");
        this.wyksztalcenie = myObj.nextLine();

        System.out.println("Podaj stanowisko: ");
        this.stanowisko = myObj.nextLine();
    }
    void drukuj1() {
        osoba.drukuj();
        System.out.println("Wyksztalcenie: " + this.wyksztalcenie);
        System.out.println("Stanowisko: " + this.stanowisko);
    }

        }
public class Main {

    public static void main(String[] args) {
	// write your code here
        Kadra kadra = new Kadra();
        kadra.inicjuj1();
        kadra.drukuj1();
    }
}
