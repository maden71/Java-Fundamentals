package Exersice;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] data = line.substring(line.lastIndexOf("\\")+1).split("\\.");

        System.out.printf("File name: %s%nFile extension: %s",data[0],data[1]);
    }
}
