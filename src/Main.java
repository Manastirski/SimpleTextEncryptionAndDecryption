import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Encryption encryption = new Encryption();
        Decryption decryption = new Decryption();

        System.out.println("Input Message:");
        String input = scanner.nextLine().trim();
        encryption.encryptionOfText(input);

        System.out.println("Input encrypted binary text:");
        String inputToDecrypt = scanner.nextLine().trim();
        decryption.decryptionOfText(inputToDecrypt);

    }
}