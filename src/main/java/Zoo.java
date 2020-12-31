import animals.Dog;
import animals.IAnimal;
import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Dog> dogs = new ArrayList<>();

    Connection con = MySqlConnection.connect();

    public void insertIntoDB(Connection con, Dog dog) {
        try {
            String sql = "INSERT INTO dogs (name, speed) VALUES (?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, dog.getName());
            statement.setInt(2, dog.getSpeed());
            int rows = statement.executeUpdate();
            if (rows > 0) {
                System.out.println("Added in Database");
            }
        } catch (Exception e) {

        }
    }

    public void addDog(String name, int speed) {
        Dog tempDog = new Dog(speed, name);
        dogs.add(tempDog);
        insertIntoDB(con, tempDog);
    }

    public void boostSpeed(@NotNull IAnimal animal, int boost) {
        System.out.println(animal.getName() + " got a speed boost!");
        animal.boostSpeed(boost);
    }

    public void printSpeed(@NotNull IAnimal animal) {
        System.out.println(animal.getName() + " runs at " + animal.getSpeed() + "Km/hr");
    }

    public void printSpeedAll() {
        for (Dog dog : dogs) {
            System.out.println(dog.getName() + " runs at " + dog.getSpeed() + "Km/hr");
        }
    }

    public void boostSpeedAll() {
        for (Dog dog : dogs) {
            boostSpeed(dog, 15);
        }
    }
}
