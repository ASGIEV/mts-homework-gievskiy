package lesson_3.homework;

import java.util.Random;

public class HW1 {

    public static class Pet extends AbstractAnimal{
        public Pet(String breed, String name, Double cost, String character){
            this.breed = breed;
            this.name = name;
            this.cost = cost;
            this.character = character;
        }
    }

    public static class Predator extends AbstractAnimal{
        public Predator(String breed, String name, Double cost, String character){
            this.breed = breed;
            this.name = name;
            this.cost = cost;
            this.character = character;
        }
    }
    public interface CreateAnimalService{
        default void createAnimals(){
            int count = 0;
            Random random = new Random();
            while (count < 10){
                if (count % 2 == 0){
                    Pet animal = new Pet("Pet_breed" + (random.nextInt(100) +1),
                                "Pet_name" + (random.nextInt(100) +1),
                            random.nextDouble() * 1000, "Pet_character" + (random.nextInt(100) +1)
                    );
                    System.out.println("Created animal1: " + animal.getBreed() + "; " + animal.getName() + "; " + animal.getCost()  + "; " + animal.getCharacter());
                } else {
                    Predator animal = new Predator("Predator_breed" + (random.nextInt(100) +1),
                            "Predator_name" + (random.nextInt(100) +1),
                            random.nextDouble() * 1000, "Predator_character" + (random.nextInt(100) +1)
                    );
                    System.out.println("Created animal1: " + animal.getBreed() + "; " + animal.getName() + "; " + animal.getCost()  + "; " + animal.getCharacter());
                }
                count = count + 1;
            }
        }

    }

    public static class CreateAnimalServiceImpl implements CreateAnimalService{
        public void createAnimals(int N){
            Random random = new Random();
            for(int i = 0; i < N; i++){
                if (i % 2 == 0){
                    Pet animal = new Pet("Pet_breed" + (random.nextInt(100 * N) +1),
                            "Pet_name" + (random.nextInt(100 * N) +1),
                            random.nextDouble() * 1000, "Pet_character" + (random.nextInt(100 * N) +1)
                    );
                    System.out.println("Created animal2: " + animal.getBreed() + "; " + animal.getName() + "; " + animal.getCost()  + "; " + animal.getCharacter());
                } else {
                    Predator animal = new Predator("Predator_breed" + (random.nextInt(100 * N) +1),
                            "Predator_name" + (random.nextInt(100 * N) +1),
                            random.nextDouble() * 1000, "Predator_character" + (random.nextInt(100 * N) +1)
                    );
                    System.out.println("Created animal2: " + animal.getBreed() + "; " + animal.getName() + "; " + animal.getCost()  + "; " + animal.getCharacter());
                }
            }
        }
        @Override
        public void createAnimals(){
            Random random = new Random();
            int count = 0;
            do {
                if (count % 2 == 0){
                    Pet animal = new Pet("Pet_breed" + (random.nextInt(100) +1),
                            "Pet_name" + (random.nextInt(100) +1),
                            random.nextDouble() * 1000, "Pet_character" + (random.nextInt(100) +1)
                    );
                    System.out.println("Created animal3: " + animal.getBreed() + "; " + animal.getName() + "; " + animal.getCost()  + "; " + animal.getCharacter());
                } else {
                    Predator animal = new Predator("Predator_breed" + (random.nextInt(100) +1),
                            "Predator_name" + (random.nextInt(100) +1),
                            random.nextDouble() * 1000, "Predator_character" + (random.nextInt(100) +1)
                    );
                    System.out.println("Created animal3: " + animal.getBreed() + "; " + animal.getName() + "; " + animal.getCost()  + "; " + animal.getCharacter());
                }
                count = count + 1;
            } while (count < 10);
        }
    }
    public static void main(String[] args) {
        //System.out.println("ЬШК");
            //AbstractAnimal am = new AbstractAnimal();
        //Pet pet1 = new Pet("bbbbred", "bob", 123.34, "Puh");
        //System.out.println(pet1.breed + "; " + pet1.name + "; " + pet1.cost + "; " + pet1.character);
        //System.out.println(pet1.getBreed() + "; " + pet1.getName() + "; " + pet1.getCost() + "; " + pet1.getCharacter());
        CreateAnimalService animalService = new CreateAnimalServiceImpl();
        animalService.createAnimals();
        ((CreateAnimalServiceImpl) animalService).createAnimals(5);
        ((CreateAnimalServiceImpl) animalService).createAnimals();

    }
}
