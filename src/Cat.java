public class Cat extends Animal implements Eatable{

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }
    @Override
    public String toString() {
        return "Котик " + super.getName();
    }

    @Override
    public void voice() {
        System.out.println("Котик мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Котик ест");
    }
}
