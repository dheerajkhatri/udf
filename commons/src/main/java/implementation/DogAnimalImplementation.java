package implementation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by dheeraj.khatri on 01/06/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DogAnimalImplementation implements AnimalInterface {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "dog = " + this.name;
    }
}
