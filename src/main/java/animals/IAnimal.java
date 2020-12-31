package animals;

public interface IAnimal {

    void move();

    void sleepTime();

    void makeSound();

    void boostSpeed(int boost);

    static void main(String[] args) {
        System.out.println("I am an Animal");
    }

    int getSpeed();

    String getName();
}
