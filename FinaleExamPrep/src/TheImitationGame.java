import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder sb = null;

        String[] data = scanner.nextLine().split("\\|");
        while(!data[0].equals("Decode")) {
            switch (data[0]) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(data[1]);
                    sb = new StringBuilder(word);
                    sb.insert(word.length(),sb.substring(0,numberOfLetters));
                    sb.delete(0,numberOfLetters);
                    word = sb.toString();

                    break;
                case "Insert":
                    sb = new StringBuilder(word);
                    sb.insert(Integer.parseInt(data[1]),data[2]);
                    word = sb.toString();
                    break;
                case "ChangeAll":
                   word = word.replace(data[1],data[2]);
                    break;
            }

            data = scanner.nextLine().split("\\|");
        }
        System.out.printf("The decrypted message is: %s",word);
    }
}
