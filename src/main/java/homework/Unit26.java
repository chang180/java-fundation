package homework;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Unit26 {
    public static void main(String[] args) {
        String fileName = "animal.json";
        try {
            String json = new String(Files.readAllBytes(Paths.get(fileName)));
            ObjectMapper objectMapper = new ObjectMapper();

            Animal[] animals = objectMapper.readValue(json, Animal[].class);
            String[] cat = animals[0].toArray();
            System.out.println(Arrays.toString(cat));

            Map<String, String> dogMap = animals[1].toMap();
            System.out.println(dogMap);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Animal {
    private String animal_id;
    private String animal_kind;
    private String animal_sex;
    private String shelter_name;

    public Animal(){
    }

    public String getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(String animal_id) {
        this.animal_id = animal_id;
    }

    public String getAnimal_kind() {
        return animal_kind;
    }

    public void setAnimal_kind(String animal_kind) {
        this.animal_kind = animal_kind;
    }

    public String getAnimal_sex() {
        return animal_sex;
    }

    public void setAnimal_sex(String animal_sex) {
        this.animal_sex = animal_sex;
    }

    public String getShelter_name() {
        return shelter_name;
    }

    public void setShelter_name(String shelter_name) {
        this.shelter_name = shelter_name;
    }

    public String[] toArray() {
        return new String[]{animal_id, animal_kind, animal_sex, shelter_name};
    }

    public Map<String, String> toMap() {
        Map<String, String> animalMap = new HashMap<>();
        animalMap.put("animal_id", animal_id);
        animalMap.put("animal_kind", animal_kind);
        animalMap.put("animal_sex", animal_sex);
        animalMap.put("shelter_name", shelter_name);
        return animalMap;
    }
}

