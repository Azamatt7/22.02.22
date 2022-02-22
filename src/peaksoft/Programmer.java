package peaksoft;

public class Programmer extends Person implements Swimmable,CanDrive{
    int salary;

    public Programmer() {
    }

    public Programmer(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    void eat() {
        System.out.println(" Programmer is having lunch");
    }



    @Override
    public void drive() {
        System.out.println("Programmer can drive a car ");
    }

    @Override
    public String toString() {
        return "Programmer: " +
                "salary: " + salary + super.toString();
    }

    @Override
    public void swim() {
        System.out.println("Programmer can swim also  ");


    }
}
