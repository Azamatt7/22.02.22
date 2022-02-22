package peaksoft;

public class Driver extends Person implements CanDrive{
    String modelOfCar;

    public Driver() {
    }



    public Driver(String name, int age, String modelOfCar) {
        super(name, age);
        this.modelOfCar = modelOfCar;
    }

    @Override
    void eat() {
        System.out.println(" Driver is eating ");
    }



    @Override
    public void drive() {
        System.out.println("Driver drives the public bus ");
    }
}
