// main class car
 class Car {
    private String licensePlate;
    private boolean isRented;

    // Constructor to set the license plate when a car is created
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isRented = false; // Initially, the car is available
    }

    // Method to rent the car, only if it is available
    public boolean rentCar() {
        if (!isRented) {
            isRented = true;
            return true; // Car successfully rented
        }
        return false; // Car is already rented
    }

    // Method to return the car and mark it as available
    public void returnCar() {
        isRented = false;
    }

    // Getter method to check if the car is rented
    public boolean isRented() {
        return isRented;
    }

    // Getter method for the license plate (if needed)
    public String getLicensePlate() {
        return licensePlate;
    }

    public static void main(String[] args) {
        // Example usage
        Car car1 = new Car("KDK 234K");
        System.out.println("Car rented: " + car1.rentCar()); // Should print true
        System.out.println("Car rented: " + car1.rentCar()); // Should print false
        car1.returnCar();
        System.out.println("Car rented: " + car1.rentCar()); // Should print true
    }
}
