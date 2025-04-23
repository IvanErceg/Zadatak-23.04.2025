package Zadatak7;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class EvidencijaPolaznika {
    private static HashMap<String, Polaznik> polaznici = new HashMap<>();
    private static TreeMap<String, Polaznik> sortiranoUzlazno = new TreeMap<>();
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

        sortiranoUzlazno.putAll(polaznici);

        System.out.println("\nPopis polaznika na tečaju (sortirano):");
        for (Polaznik polaznik : sortiranoUzlazno.values()) {
            System.out.println(polaznik);
        }
    }
}