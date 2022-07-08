package com.mycompany.mainsuperheroes;

import java.util.Scanner;

public class MainSuperheroes {

    public static void main(String[] args) {
        int sh1, sh2, points = (int) Math.ceil(Math.random() * 100), points2 = (int) Math.ceil(Math.random() * 100);

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe un número del 1 al 5");
        sh1 = scan.nextInt();
        Superheroes ch1 = new Superheroes("Dante", "Italia", "dominando toda clase de armas", points);
        Superheroes ch2 = new Superheroes("Sparda", "Grecia", "dominando la telequinesis", points);
        Superheroes ch3 = new Superheroes("Trunks", "Japón", "de volar", points);
        Superheroes ch4 = new Superheroes("Goku", "Planeta Vegeta", "de teletransportarse", points);
        Superheroes ch5 = new Superheroes("Trish", "Canadá", "de transformarse", points);
        if (sh1 == 1) {//|| sh2 == 1

            System.out.println(ch1);
        } else if (sh1 == 2) {
            System.out.println(ch2);
        } else if (sh1 == 3) {
            System.out.println(ch3);
        } else if (sh1 == 4) {
            System.out.println(ch4);
        } else if (sh1 == 5) {
            System.out.println(ch5);
        } else {
            System.out.println("Debes introducir un número del 1 al 5");
        }
        System.out.println("Escribe un número del 1 al 5");
        sh2 = scan.nextInt();
//2ºif Para 2º scanner
        if (sh2 == 1) {
            System.out.println(ch1);
        } else if (sh2 == 2) {
            System.out.println(ch2);
        } else if (sh2 == 3) {
            System.out.println(ch3);
        } else if (sh2 == 4) {
            System.out.println(ch4);
        } else if (sh2 == 5) {
            System.out.println(ch5);
        } else {
            System.out.println("Debes introducir un número del 1 al 5");
        }
        System.out.println("");
//COMPARACION > O <
        if (points > points2) {
            System.out.println(sh1 + " gana a " + sh2 + " con una diferencia de " + (points - points2) + " puntos");
        } else if (points < points2) {
            System.out.println(sh2 + " gana a " + sh1 + " con una diferencia de " + (points2 - points) + " puntos");
        } else {
            System.out.println(sh1 + " y " + sh2 + " Quedan empate");
        }

    }
}
