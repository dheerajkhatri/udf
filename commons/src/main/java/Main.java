/*
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import implementation.AnimalInterface;
import implementation.CatAnimalImplementation;
import implementation.DogAnimalImplementation;

import java.io.IOException;

*/
/**
 * Created by dheeraj.khatri on 01/06/17.
 *//*

public class Main {

    public void temp() throws IOException {
        CatAnimalImplementation cat = new CatAnimalImplementation();
        cat.setAge(3);
        cat.setName("cat");

        Gson gson = new GsonBuilder().registerTypeAdapter(AnimalInterface.class,
                new InterfaceAdapter<AnimalInterface>()).create();


        System.out.println(gson.toJson(cat));
        String jsonData = "{\"name\":\"cat\",\"age\":3}";
        String jsonData2 = "{\"name\":\"dog\"}";
        AnimalInterface animalInterface = gson.fromJson(jsonData,CatAnimalImplementation.class);
        AnimalInterface animalInterface2 = gson.fromJson(jsonData2, DogAnimalImplementation.class);
        System.out.println("animalInterface1 " + animalInterface.toString());
        System.out.println("animalInterface2 " + animalInterface2.toString());


        ObjectMapper objectMapper = new ObjectMapper();
*/
/*        AnimalInterface animalInterface1 = objectMapper.readValue(jsonData,AnimalInterface.class);
        System.out.println(animalInterface1);
*//*


        ExternalDTO externalDTO = new ExternalDTO();
        externalDTO.setTemp("temp");
        externalDTO.setAnimal(animalInterface2);
        System.out.println(externalDTO.toString());


        String data = "{\"temp\":\"temp\",\"animal\":\"{\"name\":\"dog\"}\"}";
        ExternalDTO externalDTO1 = objectMapper.readValue(data,ExternalDTO.class);
        System.out.println(externalDTO1.toString());


        //AnimalInterface animalInterface2 = objectMapper.readValue(jsonData2,AnimalInterface.class);
        //System.out.println(animalInterface2);
    }
}
*/
