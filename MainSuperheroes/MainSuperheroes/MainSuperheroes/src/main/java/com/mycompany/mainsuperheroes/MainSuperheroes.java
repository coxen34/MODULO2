package com.mycompany.mainsuperheroes;

import java.util.Scanner;

public class MainSuperheroes {

    public static void main(String[] args) {
        int points = (int) Math.ceil(Math.random() * 100), points2 = (int) Math.ceil(Math.random() * 100), punts=0, punts2=0;
        String sh1, sh2, super1="", super2="", pais, pais2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe un número del 1 al 5");
        sh1 = scan.next();
        Superheroes ch1 = new Superheroes("Dante", "Italia", "dominando toda clase de armas", points);
        Superheroes ch2 = new Superheroes("Sparda", "Grecia", "dominando la telequinesis", points);
        Superheroes ch3 = new Superheroes("Trunks", "Japón", "de volar", points);
        Superheroes ch4 = new Superheroes("Goku", "Planeta Vegeta", "de teletransportarse", points);
        Superheroes ch5 = new Superheroes("Trish", "Canadá", "de transformarse", points);

        switch (sh1) {
            case "1":
                super1 = ch1.getName();
                pais = ch1.getCountry();
                ch1.setPoints(points);
                punts = ch1.getPoints();
                System.out.println(ch1);
                break;
            case "2":
                super1 = ch2.getName();
                pais = ch2.getCountry();
                ch2.setPoints(points);
                punts = ch2.getPoints();
                System.out.println(ch2);
                break;
            case "3":
                super1 = ch3.getName();
                pais = ch3.getCountry();

                ch3.setPoints(points);
                punts = ch3.getPoints();
                System.out.println(ch3);
                break;
            case "4":
                super1 = ch4.getName();
                pais = ch4.getCountry();
                
                ch4.setPoints(points);
                punts = ch4.getPoints();
                System.out.println(ch4);
                break;
            case "5":
                super1 = ch5.getName();
                pais = ch5.getCountry();
                
                ch5.setPoints(points);
                punts = ch5.getPoints();
                System.out.println(ch5);
                break;
            default:
                System.out.println("Debes introducir un número del 1 al 5");
                break;
        }
        System.out.println("Escribe un número del 1 al 5");
        sh2 = scan.next();
//2ºif Para 2º scanner
        switch (sh2) {
            case "1":
                super2 = ch1.getName();
                pais2 = ch1.getCountry();
                
                System.out.println(ch1);
                ch1.setPoints(points2);
                punts2 = ch1.getPoints();
                break;
            case "2":
                super2 = ch2.getName();
                pais2 = ch2.getCountry();
                
                System.out.println(ch2);
                ch2.setPoints(points2);
                punts2 = ch2.getPoints();
                break;
            case "3":
                super2 = ch3.getName();
                pais2 = ch3.getCountry();
                
                System.out.println(ch3);
                ch3.setPoints(points2);
                punts2 = ch3.getPoints();
                break;
            case "4":
                super2 = ch4.getName();
                pais2 = ch4.getCountry();
                
                System.out.println(ch4);
                ch4.setPoints(points2);
                punts2 = ch4.getPoints();
                break;
            case "5":
                super2 = ch5.getName();
                pais2 = ch5.getCountry();
                
                System.out.println(ch5);
                ch5.setPoints(points2);
                punts2 = ch5.getPoints();
                break;
            default:
                System.out.println("Debes introducir un número del 1 al 5");
                break;
        }
        System.out.println("");

         
        //COMPARACION > O <
         if (punts > punts2) {
            System.out.println(super1 + " gana a " + super2 + " con una diferencia de " + (points - points2) + " puntos");
        } else if (points < points2) {
            System.out.println( super2+ " gana a " + super1 + " con una diferencia de " + (points2 - points) + " puntos");
        } else {
            System.out.println(super1 + " y " + super2 + " Quedan empate");
        }
    }
}
