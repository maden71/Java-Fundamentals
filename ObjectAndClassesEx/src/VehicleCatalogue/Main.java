package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();
        double sumCar = 0;
        int carCount = 0;
        double sumTruck = 0;
        int truckCount = 0;

        String[] input = scanner.nextLine().split(" ");
        while(!input[0].equals("End")) {
            String type = input[0];
            String model = input[1];
            String color = input[2];
            int horsePower = Integer.parseInt(input[3]);
            Vehicle vehicle = new Vehicle();
            vehicle.setType(type);
            vehicle.setModel(model);
            vehicle.setColor(color);
            vehicle.setHorsePower(horsePower);
            if(type.equals("car")) {
                sumCar += horsePower;
                carCount++;
            }else if(type.equals("truck")) {
                sumTruck += horsePower;
                truckCount++;
            }
            vehicles.add(vehicle);
            input = scanner.nextLine().split(" ");
        }
        String types = scanner.nextLine();
        while(!types.equals("Close the Catalogue")) {
            String model = types;
            vehicles.stream().filter(vehicle -> vehicle.getModel()
                    .equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            types = scanner.nextLine();
        }
        if(truckCount == 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", sumCar / carCount);
            System.out.printf("Trucks have average horsepower of: %.2f.", 0.00);
        }else if (carCount == 0) {
            System.out.printf("Cars have average horsepower of: %.2f%n", 0.00);
            System.out.printf("Trucks have average horsepower of: %.2f.", sumTruck / truckCount);
        }else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", sumCar / carCount);
            System.out.printf("Trucks have average horsepower of: %.2f.", sumTruck / truckCount);
        }
    }
}
