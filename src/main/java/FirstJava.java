import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class FirstJava {


    public static void main(String[] args) {
        int i = 10;
        int x = ++i;

        InheritAbstract mem = new InheritAbstract();
        String[] rights = mem.getRights();
//        System.out.println(rights[0]);
        Zoo zoo = new Zoo();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            System.out.println("================");
            System.out.println("Pick your choice:");
            System.out.print("1. Add a dog\n2. Boost speeds\n3.exit\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    handleAddChoice(sc, zoo);
                    break;
                case 2:
                    zoo.boostSpeedAll();
                    break;
                default:
                    break;
            }
        }
    }

    private static void handleAddChoice(@NotNull Scanner sc, @NotNull Zoo zoo) {
        System.out.println("Enter the name of Dog");
        String name = sc.nextLine();
        System.out.println("Enter the speed of " + name);
        int speed = sc.nextInt();
        zoo.addDog(name, speed);
    }
}
