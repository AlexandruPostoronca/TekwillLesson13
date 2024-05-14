public class Vehicle {

    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    //Override the toString() method

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate=" + licensePlate +
                '}';
    }
}

