import implementation.AnimalInterface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by dheeraj.khatri on 01/06/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalDTO implements Serializable{
    private String temp;
    private AnimalInterface animal;

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setAnimal(AnimalInterface animal) {
        this.animal = animal;
    }

    public String toString() {
        return "temp = " + this.temp + " animal = " + animal.toString();
    }
}
