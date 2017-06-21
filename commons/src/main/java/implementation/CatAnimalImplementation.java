package implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * Created by dheeraj.khatri on 01/06/17.
 */
@Getter
@Setter
public class CatAnimalImplementation implements AnimalInterface {
    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private Integer age;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "name = " + this.name + " age = " + this.age;
    }
}
