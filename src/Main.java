import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Тайгер", 1, "Оранжевый в черную полосочку", 10);
        Cat cat = new Cat("Борис", 1, "Дворовый");
        Fish fish = new Fish("Язь", 1, "Серебристый");
        ArrayList<Animal> arrayZoo = new ArrayList<Animal>();
        Zoo zoo = new Zoo(arrayZoo);
        zoo.addToZoo(arrayZoo, tiger);
        zoo.addToZoo(arrayZoo, cat);
        zoo.addToZoo(arrayZoo, fish);
        System.out.println("В зоопарке живут: " + arrayZoo);

        tiger.voice();
        cat.voice();
        fish.swim();
        cat.eat();
        tiger.eat();
    }
}
