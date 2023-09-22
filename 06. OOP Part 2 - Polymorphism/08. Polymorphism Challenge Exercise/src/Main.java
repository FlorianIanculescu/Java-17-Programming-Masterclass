public class Main {

    public static void main(String[] args) {

        System.out.println("----------------------CAR----------------------");
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        System.out.println("-----------------------------------------------");
        System.out.println();

        System.out.println("----------------GAS POWERED CAR----------------");
        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);
        System.out.println("-----------------------------------------------");
        System.out.println();

        System.out.println("------------------ELECTRIC CAR-----------------");
        Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);
        System.out.println("-----------------------------------------------");
        System.out.println();

        System.out.println("-------------------HYBRID CAR-------------------");
        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 16, 8, 8);
        runRace(ferrariHybrid);
        System.out.println("------------------------------------------------");
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}