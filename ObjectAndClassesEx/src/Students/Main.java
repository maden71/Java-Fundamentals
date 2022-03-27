package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Students> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);
            Students students1 = new Students();
            students1.setFirstName(firstName);
            students1.setLastName(lastName);
            students1.setGrade(grade);
            students.add(students1);
        }
        students.sort(Comparator.comparing(Students::getGrade).reversed());
        for (Students st: students) {
            System.out.printf("%s %s: %.2f%n",st.getFirstName(), st.getLastName(), st.getGrade());
        }
    }
}
