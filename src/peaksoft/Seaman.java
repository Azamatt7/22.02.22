package peaksoft;

public class Seaman extends Person implements Swimmable{
    String equipmentOfSeaman;

    public Seaman() {
    }

    @Override
    void eat() {
        System.out.println("Seaman eats seafoods ");
    }

    public Seaman(String name, int age, String equipmentOfSeaman) {
        super(name, age);
        this.equipmentOfSeaman = equipmentOfSeaman;
    }

    @Override
    public void swim() {
        System.out.println("Seaman is a best swimmer ");
    }
}
