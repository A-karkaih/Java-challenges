import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(ArrayList<Animal> animals) {
        this.animals = animals;

    }

    void showAllAnimals() {
        animals.forEach((animal) -> {

            System.out.println("Animal name is: " + animal.getName() + " its age is: " + animal.getAge());
            animal.makeSound();
            animal.eat();
            animal.sleep();

        });
    }
}
