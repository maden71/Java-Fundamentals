import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards",0);
        items.put("fragments",0);
        items.put("motes",0);
        String winner = "";
        boolean hasWinner = false;
        while(!hasWinner) {
            String[] materials = scanner.nextLine().split("\\s+");
            for (int i = 0; i < materials.length - 1; i += 2) {
                int quanity = Integer.parseInt(materials[i]);
                String mat = materials[i + 1].toLowerCase();
                //if its not in the map put the items with value of 0 and then put input value to the item.Another solution is normal if-else
                items.putIfAbsent(mat, 0);
                items.put(mat, items.get(mat) + quanity);
                if(mat.equals("shards") || mat.equals("fragments") || mat.equals("motes")) {
                    if(items.get(mat) >= 250) {
                        items.put(mat, items.get(mat) - 250);
                        winner = mat;
                        hasWinner = true;
                        break;
                    }
                }

            }
        }
        switch(winner) {
            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }
        items.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));


    }
}