package peaksoft;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("Adylbek",32,5000);
        Programmer programmer1 = new Programmer("Aktan",22,7000);
        Driver driver = new Driver("Mirbek",40,"Bus");
        Driver driver1 = new Driver("Jumabek",45,"Trolley bus");
        Sportsman sportsman = new Sportsman("Ariet", 20,"Boxing");
        Sportsman sportsman1 = new Sportsman("Kairat",24,"Football");
        Seaman seaman = new Seaman("Bekjan",23,"Oxygen");
        Seaman seaman1 = new Seaman("Bakyt",23,"Goggles");

        Swimmable[] people = {programmer,programmer1,sportsman,sportsman1,seaman,seaman1};
        Pool pool = new Pool();
        pool.setPeople(people);

        System.out.println(pool);






    }
}
