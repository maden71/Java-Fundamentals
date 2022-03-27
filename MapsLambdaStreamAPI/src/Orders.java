import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> products = new LinkedHashMap<>();

        String[] data = scanner.nextLine().split("\\s+");
        while(!data[0].equals("buy")) {
            String product = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);
            if(products.containsKey(product)) {
                products.get(product).set(0,price);
                products.get(product).set(1,products.get(product).get(1) + quantity);
            }else {
                products.put(product,new ArrayList<>());
                products.get(product).add(price);
                products.get(product).add(quantity);
            }


            data = scanner.nextLine().split("\\s+");

        }
        products.forEach((key,value) -> System.out.printf("%s -> %.2f%n",key,value.get(0) * value.get(1)));
    }
}
