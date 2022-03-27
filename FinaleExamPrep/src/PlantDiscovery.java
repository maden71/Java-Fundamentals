import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantRarity = new LinkedHashMap<>();
        Map<String,List<Double>> plantRating = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String[] data = scanner.nextLine().split("<->");
            plantRarity.put(data[0],Integer.parseInt(data[1]));
            plantRating.put(data[0],new ArrayList<>());
        }
        String[] data = scanner.nextLine().split("[: -]+");
        while(!data[0].equals("Exhibition")) {
            if(!plantRarity.containsKey(data[1])) {
                System.out.println("error");
            }else {
                switch (data[0]) {
                    case "Rate":
                        plantRating.get(data[1]).add(Double.parseDouble(data[2]));
                        break;
                    case "Update":
                        plantRarity.put(data[1], Integer.parseInt(data[2]));
                        break;
                    case "Reset":
                        plantRating.get(data[1]).clear();
                        break;

                }
            }
            data = scanner.nextLine().split("[: -]+");
        }


        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String,Integer> plant : plantRarity.entrySet()) {
            double averageRating = plantRating.get(plant.getKey()).stream().mapToDouble(Double::doubleValue).average().orElse(0.00);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",plant.getKey(), plant.getValue(),averageRating);
        }

    }
}
