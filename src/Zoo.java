import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> zoo;

    public Zoo(ArrayList<Animal> zoo) {
        this.zoo = zoo;
    }

    public void addToZoo(ArrayList<Animal> zoo, Animal animal) {
        zoo.add(animal);
    }
}
