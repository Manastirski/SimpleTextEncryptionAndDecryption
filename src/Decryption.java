import java.util.ArrayList;
import java.util.List;
public class Decryption {

    public StringBuilder decryptionOfText(String input) {

        if (input.isEmpty()) {
            System.out.println("Invalid input");
            throw new RuntimeException("Empty text!");
        }

        List<String> binaryChunks = new ArrayList<>();
        for (int i = 0; i < input.length(); i += 8) {
            if (i + 8 <= input.length()) {
                binaryChunks.add(input.substring(i, i + 8));
            }
        }

        StringBuilder originalText = new StringBuilder();

        for (String binaryChunk : binaryChunks) {
            if (binaryChunk.length() >= 2) {
                char temp = binaryChunk.charAt(0);
                binaryChunk = binaryChunk.charAt(1) + "" + temp + binaryChunk.substring(2);
            }
            int charCode = Integer.parseInt(binaryChunk, 2);
            originalText.append((char) charCode);
        }

        System.out.println("Decrypted Message:");
        System.out.println(originalText.toString());

        return originalText;

    }
}

