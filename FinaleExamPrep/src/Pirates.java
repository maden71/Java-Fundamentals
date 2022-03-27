import java.util.*;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\|\\|");
        Map<String, List<Integer>> cities = new LinkedHashMap<>();
        while (!data[0].equals("Sail")) {
            String city = data[0];
            int people = Integer.parseInt(data[1]);
            int gold = Integer.parseInt(data[2]);
            if (!cities.containsKey(data[0])) {
                cities.put(city, new ArrayList<>());
                cities.get(city).add(people);
                cities.get(city).add(gold);

            } else {
                cities.get(city).set(0, cities.get(city).get(0) + people);
                cities.get(city).set(1, cities.get(city).get(1) + gold);
            }

            data = scanner.nextLine().split("\\|\\|");
        }
        data = scanner.nextLine().split("=>");
        while (!data[0].equals("End")) {
            switch (data[0]) {
                case "Plunder": {
                    String town = data[1];
                    int people = Integer.parseInt(data[2]);
                    int gold = Integer.parseInt(data[3]);
                    cities.get(town).set(0, cities.get(town).get(0) - people);
                    cities.get(town).set(1, cities.get(town).get(1) - gold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                    if (cities.get(town).get(0) <= 0 || cities.get(town).get(1) <= 0) {
                        System.out.printf("%s has been wiped off the map!%n", town);
                        cities.remove(town);
                    }
                    break;
                }
                case "Prosper": {
                    String town = data[1];
                    int gold = Integer.parseInt(data[2]);

                    if (gold < 0) {
                        System.out.printf("Gold added cannot be a negative number!%n");
                    } else {
                        cities.get(town).set(1, cities.get(town).get(1) + gold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, cities.get(town).get(1));
                    }
                    break;
                }
            }
            data = scanner.nextLine().split("=>");
        }
        if (!cities.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());
            cities.forEach((key, value) -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", key, value.get(0), value.get(1)));
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
