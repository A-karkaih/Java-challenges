public class Elephant extends  Animal{

    Elephant(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Trumpet!");    }
}
