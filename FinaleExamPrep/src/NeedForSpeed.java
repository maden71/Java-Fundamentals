import java.util.*;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> cars = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\|");
            int mileage = Integer.parseInt(data[1]);
            int fuel = Integer.parseInt(data[2]);
            cars.put(data[0], new ArrayList<>());
            cars.get(data[0]).add(mileage);
            cars.get(data[0]).add(fuel);
        }

        String[] data = scanner.nextLine().split(" : ");
        while (!data[0].equals("Stop")) {
            switch (data[0]) {
                case "Drive": {
                    String car = data[1];
                    int distance = Integer.parseInt(data[2]);
                    int fuel = Integer.parseInt(data[3]);
                    //TODO: check if > or >=
                    if (fuel > cars.get(car).get(1)) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        cars.get(car).set(0, cars.get(car).get(0) + distance);
                        cars.get(car).set(1, cars.get(car).get(1) - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    }
                    if (cars.get(car).get(0) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", car);
                        cars.remove(car);
                    }
                    break;
                }
                case "Refuel": {
                    String car = data[1];
                    int fuel = Integer.parseInt(data[2]);
                    if ((cars.get(car).get(1) + fuel) > 75) {
                        System.out.printf("%s refueled with %d liters%n", car, 75 - cars.get(car).get(1));
                        cars.get(car).set(1, 75);
                    }else {
                        System.out.printf("%s refueled with %d liters%n", car, fuel);
                        cars.get(car).set(1, cars.get(car).get(1) + fuel);
                    }
                    break;
                }
                case "Revert": {
                    String car = data[1];
                    int kilometers = Integer.parseInt(data[2]);
                    cars.get(car).set(0, cars.get(car).get(0) - kilometers);
                    if (cars.get(car).get(0) < 10000) {
                        cars.get(car).set(0, 10000);
                    }else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                    }
                    break;
                }
            }
            data = scanner.nextLine().split(" : ");
        }
        cars.forEach((key, value) -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", key, value.get(0), value.get(1)));
    }
}
