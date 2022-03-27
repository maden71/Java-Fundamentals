import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SplittableRandom;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> cars = new LinkedHashMap<>();
        for (int i = 0; i < n ; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String command = data[0];
            String name = data[1];
            if (command.equals("register") && !cars.containsKey(name)) {
                String plateNumber = data[2];
                cars.put(name,plateNumber);
                System.out.printf("%s registered %s successfully%n",name,plateNumber);
            }else if (command.equals("unregister") && cars.containsKey(name)){
                cars.remove(name);
                System.out.printf("%s unregistered successfully%n",name);
            }else if (cars.containsKey(name)){
                String plateNumber2 = data[2];
                System.out.printf("ERROR: already registered with plate number %s%n",plateNumber2);
            }else {
                System.out.printf("ERROR: user %s not found%n",name);
            }
        }
        cars.forEach((key,value) -> System.out.printf("%s => %s%n",key,value));
    }
}
