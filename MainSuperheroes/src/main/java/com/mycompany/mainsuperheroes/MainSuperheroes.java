package com.mycompany.mainsuperheroes;

import java.util.Scanner;

public class MainSuperheroes {

    public static void main(String[] args) {
        int sh1, sh2, points = (int) Math.ceil(Math.random() * 100), points2 = (int) Math.ceil(Math.random() * 100), punts1, punts2;
        String heroe1 = "", heroe2 = "", country1 = "", country2 = "", power1 = "", power2 = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe un número del 1 al 5");
        sh1 = scan.nextInt();
        Superheroes ch1 = new Superheroes("Dante", "Italia", " dominando toda clase de armas", points);
        Superheroes ch2 = new Superheroes("Sparda", "Grecia", " dominando la telequinesis", points);
        Superheroes ch3 = new Superheroes("Trunks", "Japón", "  con su habilidad volando", points);
        Superheroes ch4 = new Superheroes("Goku", "Planeta Vegeta", " con su habilidad teletransportándose", points);
        Superheroes ch5 = new Superheroes("Trish", "Canadá", " con su habilidad transformándose", points);
        if (sh1 == 1) {//
            heroe1 = ch1.name;
            country1 = ch1.country;
            power1 = ch1.power;

        } else if (sh1 == 2) {
            heroe1 = ch2.name;
            country1 = ch2.country;
            power1 = ch2.power;

        } else if (sh1 == 3) {
            heroe1 = ch3.name;
            country1 = ch3.country;
            power1 = ch3.power;

        } else if (sh1 == 4) {
            heroe1 = ch4.name;
            country1 = ch4.country;
            power1 = ch4.power;

        } else if (sh1 == 5) {
            heroe1 = ch5.name;
            country1 = ch5.country;
            power1 = ch5.power;

        } else {
            System.out.println("Debes introducir un número del 1 al 5");
        }
        System.out.println("Escribe un número del 1 al 5");
        sh2 = scan.nextInt();
//2ºif Para 2º scanner
        if (sh2 == 1) {
            heroe2 = ch1.name;
            country2 = ch1.country;
            power2 = ch1.power;

        } else if (sh2 == 2) {
            heroe2 = ch2.name;
            country2 = ch2.country;
            power2 = ch2.power;

        } else if (sh2 == 3) {
            heroe2 = ch3.name;
            country2 = ch3.country;
            power2 = ch3.power;

        } else if (sh2 == 4) {
            heroe2 = ch4.name;
            country2 = ch4.country;
            power2 = ch4.power;

        } else if (sh2 == 5) {
            heroe2 = ch5.name;
            country2 = ch5.country;
            power2 = ch5.power;

        } else {
            System.out.println("Debes introducir un número del 1 al 5");
        }
        System.out.println("");
//COMPARACION > O <
        if (points > points2) {
            System.out.println(heroe1 + " desde " + country1 + power1+"(con " + points + " puntos) gana a: " + heroe2 + "(con " + points2 + " puntos) que viene desde " + country2 + power2+ " con una diferencia de " + (points - points2) + " puntos");
        } else if (points < points2) {
            System.out.println(heroe2 + " desde " + country2 +power2+ "(con " + points2 + " puntos) gana a: " + heroe1 + "(con " + points + " puntos) que viene desde " + country1 +power1+ " con una diferencia de " + (points2 - points) + " puntos");
        } else {
            System.out.println(heroe1 + " y " + heroe2 + " Quedan empate");
        }

    }
}
