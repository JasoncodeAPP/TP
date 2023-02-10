SOMME 

package fr.isep.TP1;

import java.util.Scanner;

public class Ex2 {

public static void somme() {

Scanner scanner = new Scanner (System.in);

System.out.println("Veuillez saisir le premier entier");

int premierEntier = scanner.nextInt();

System.out.println("Veuillez saisir le deuxième entier");

int deuxiemeEntier = scanner.nextInt();

int some = premierEntier + deuxiemeEntier;

System.out.println("la somme de" + premierEntier + "avec" + deuxiemeEntier + )"est égale a" + somme);

}

public static void main(String[]args) {

somme();

}

}



division

package fr.isep.TP1;

import java.util.Scanner;

public class Ex_div {

public static void division() {

Scanner scanner = new Scanner (System.in);

System.out.println("Veuillez saisir le premier entier");

float premierEntier = scanner.nextInt();

System.out.println("Veuillez saisir le deuxième entier");

float deuxiemeEntier = scanner.nextInt();

double division = premierEntier / deuxiemeEntier;

System.out.println("la division de" + premierEntier + "avec" + deuxiemeEntier + )

"est égale a" + division);

}

public static void main(String[]args) {

division();

}



MAIN


package fr.isep.TP1;

public class Main {

public void main(String[]args) {

Scanner scanner = new Scanner(System.in);

int unEntier = scanner.nextInt();

float unReel = scanner.nextFloat();

System.out.println("J'ai recupéré un entier" + unEntier);

System.out.println("J'ai aussi recupéré un réel" + unReel);

}

}