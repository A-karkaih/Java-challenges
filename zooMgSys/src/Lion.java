public class Lion extends  Animal{


    Lion(String name, int age) {
        super(name, age);
    }



    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Roar!");    }
}
