package lesson_3.homework;

import java.util.Random;

public interface CreateAnimalService{
    default void createAnimals(){
        int count = 0;
        Random random = new Random();
        while (count < 10){
            if (count % 2 == 0){
                Pet animal = new Pet("Pet_breed_" + (random.nextInt(100) +1),
                        "Pet_name_" + (random.nextInt(100) +1),
                        random.nextDouble() * 1000,
                        "Pet_character_" + (random.nextInt(100) +1)
                );
                //System.out.println("Created animal: " + animal.getBreed() + "; " + animal.getName() + "; " + animal.getCost()  + "; " + animal.getCharacter());
                System.out.println(animal);
            } else {
                Predator animal = new Predator("Predator_breed_" + (random.nextInt(100) +1),
                        "Predator_name_" + (random.nextInt(100) +1),
                        random.nextDouble() * 1000, "Predator_character_" + (random.nextInt(100) +1)
                );
                //System.out.println("Created animal: " + animal.getBreed() + "; " + animal.getName() + "; " + animal.getCost()  + "; " + animal.getCharacter());
                System.out.println(animal);
            }
            count = count + 1;
        }
    }

}
