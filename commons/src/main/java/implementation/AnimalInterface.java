package implementation;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

/**
 * Created by dheeraj.khatri on 01/06/17.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CatAnimalImplementation.class, name = "CatAnimalImplementation"),
        @JsonSubTypes.Type(value = DogAnimalImplementation.class, name = "DogAnimalImplementation") })
public interface AnimalInterface extends Serializable{
}
