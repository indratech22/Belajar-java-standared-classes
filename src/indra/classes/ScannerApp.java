package indra.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("nama : ");
        String name = scanner.nextLine();

        System.out.print("umur : ");
        Integer umur = scanner.nextInt();

        System.out.println("Hello "+name);
        System.out.println("umur anda: " + umur);
    }
}
