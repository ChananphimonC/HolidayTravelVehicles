public class Main {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle("V12345", "Sedan", "Model S", 2023, "Tesla", 50000);
        System.out.println("Vehicle Details:");
        vehicle.displayInfo();
    }
}
