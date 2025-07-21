import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Second Part");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Scanner scanner = new Scanner(System.in);
        String type;
        String name;
        char resp;
        boolean exiting = true;
        int age;
        ArrayList<Animal> animals = new ArrayList<Animal>();
        while (exiting) {
            System.out.print("Enter animal type (lion/elephant): ");
            type = scanner.nextLine();
            if (type.equalsIgnoreCase("Lion") || type.equalsIgnoreCase("Elephant")) {
                 System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    age = scanner.nextInt();
                if (type.equalsIgnoreCase("Lion")) {
                    Animal lion = new Lion(name, age);
                    animals.add(lion);
                } else if (type.equalsIgnoreCase("Elephant")) {
                    Animal elephant = new Elephant(name, age);
                    animals.add(elephant);
                }
                System.out.println("Animal added!");
                    scanner.nextLine();
            } else {
                System.out.println("Invalid animal type. Try again.");
                continue;
            }
            System.out.println("You want to exit? (y/n)");
            resp = scanner.nextLine().charAt(0);
            if (resp == 'y') {
                System.out.println("See you again!");
                exiting = false;
            }
        }
        Zoo zoo = new Zoo(animals);
        zoo.showAllAnimals();

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

    }
}
