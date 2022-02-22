package peaksoft;

public class Sportsman extends Person implements Swimmable,CanDrive{
    String typeOfSport;

    public Sportsman() {
    }



    public Sportsman(String name, int age, String typeOfSport) {
        super(name, age);
        this.typeOfSport = typeOfSport;
    }

    @Override
    void eat() {
        System.out.println("Sportsman doesn't eat junk foods ");
    }



    @Override
    public void drive() {
        System.out.println("Sportsman has driving licence and he is a good driver ");
    }

    @Override
    public String toString() {
        return "Sportsman: " +
                "typeOfSport: " + typeOfSport + super.toString();
    }

    @Override
    public void swim() {
        System.out.println("Sportsman can swim well ");


    }
}
