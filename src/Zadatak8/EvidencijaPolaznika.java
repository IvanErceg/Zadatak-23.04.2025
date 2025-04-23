package Zadatak8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class EvidencijaPolaznika {
    private static HashMap<String, Polaznik> polaznici = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dobrodošli u Evidenciju Polaznika Tečaja s Provjerom Duplikata!");


        while (true) {
            System.out.print("Unesite ime polaznika: ");
            String ime = scanner.nextLine();

            System.out.print("Unesite prezime polaznika: ");
            String prezime = scanner.nextLine();

            System.out.print("Unesite e-mail adresu polaznika: ");
            String email = scanner.nextLine();

            Polaznik noviPolaznik = new Polaznik(ime, prezime, email);


            if (polaznici.containsKey(email)) {
                System.out.println("Polaznik " + ime + " " + prezime + " već je prisutan na tečaju!\n");
            } else {
                polaznici.put(email, noviPolaznik);
                System.out.println("Polaznik " + ime + " " + prezime + " uspješno dodan na tečaj!\n");
            }


            System.out.print("Želite li unijeti još polaznika? (da/ne): ");
            String odgovor = scanner.nextLine();

            if (!odgovor.equalsIgnoreCase("da")) {
                break;
            }
        }


        ArrayList<Polaznik> listaPolaznika = new ArrayList<>(polaznici.values());


        Collections.shuffle(listaPolaznika);


        System.out.println("\nPopis polaznika na tečaju (nasumično sortirano):");
        for (Polaznik polaznik : listaPolaznika) {
            System.out.println(polaznik);
        }
    }
}