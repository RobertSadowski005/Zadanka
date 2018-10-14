package pl.sda;

import java.util.Scanner;

public class TranscriptionalEncryptionAlgorithm {
    public static void main(String[] args) {
        String plainText = getInputText();
    }

    private static String getInputText() {
        System.out.println("Podaj tekst do zaszyfrowania: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
