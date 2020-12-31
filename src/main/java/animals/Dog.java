package animals;

public class Dog implements IAnimal {
    private static final int DEFAULT_DOG_SPEED = 45;
    public String name;
    /**
     * Speed in km/hr
     */
    private int speed;

    public Dog(String name) {
        this.speed = DEFAULT_DOG_SPEED;
        this.name = name;
        System.out.println("Dog " + name + " is added");
    }

    public Dog(int speed, String name) {
        this.speed = speed;
        this.name = name;
        System.out.println("Dog " + name + " is added");
    }

    @Override
    public void move() {
        System.out.println("Dog " + name + "  is Moving");
    }

    @Override
    public void sleepTime() {
        System.out.println("Dog Sleeps for 3 hours");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }

    @Override
    public void boostSpeed(int boost) {
        this.speed += boost;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
