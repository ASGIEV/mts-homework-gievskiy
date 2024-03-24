package lesson_3.homework;

import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService{
    public void createAnimals(int N){
        Random random = new Random();
        for(int i = 0; i < N; i++){
            if (i % 2 == 0){
                Pet animal = new Pet("Pet_breed_" + (random.nextInt(100 * N) +1),
                        "Pet_name_" + (random.nextInt(100 * N) +1),
                        random.nextDouble() * 1000, "Pet_character_" + (random.nextInt(100 * N) +1)
                );
                System.out.println("Created animal_: " + animal.getBreed() + "; " + animal.getName() + "; " + animal.getCost()  + "; " + animal.getCharacter());
            } else {
                Predator animal = new Predator("Predator_breed_" + (random.nextInt(100 * N) +1),
                        "Predator_name_" + (random.nextInt(100 * N) +1),
                        random.nextDouble() * 1000, "Predator_character_" + (random.nextInt(100 * N) +1)
                );
                System.out.println("Created animal: " + animal.getBreed() + "; " + animal.getName() + "; " + animal.getCost()  + "; " + animal.getCharacter());
            }
        }
    }
    @Override
    public void createAnimals(){
        Random random = new Random();
        int count = 0;
        do {
            if (count % 2 == 0){
                Pet animal = new Pet("Pet_breed_" + (random.nextInt(100) +1),
                        "Pet_name_" + (random.nextInt(100) +1),
                        random.nextDouble() * 1000, "Pet_character_" + (random.nextInt(100) +1)
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
        } while (count < 10);
    }
}