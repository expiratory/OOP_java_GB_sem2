public class Fish extends Animal implements Swimmable{
    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void swim() {
        System.out.println("Рыбка плавает");
    }

    @Override
    public String toString() {
        return "Рыбка " + super.getName();
    }
}
