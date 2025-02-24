import java.util.*;

public class Encryption {

    public List<String> encryptionOfText(String input) {

        if (input.isEmpty()) {
            System.out.println("Invalid text");
            throw new RuntimeException("Empty text!");
        }

        List<String> binaryList = new ArrayList<>();

        for (char c : input.toCharArray()) {

            String binaryChar = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');

            if (binaryChar.length() >= 2) {
                // Swap the first two digits
                char temp = binaryChar.charAt(0);
                binaryChar = binaryChar.charAt(1) + "" + temp + binaryChar.substring(2);
            }

            binaryList.add(binaryChar);
        }

        String finalBinaryString = String.join("", binaryList);

        System.out.println("Encrypted Message: ");
        System.out.println(finalBinaryString);

        return binaryList;
    }
}
