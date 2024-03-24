package lesson_3.homework;

import java.util.Random;

public class HW1 {


    public static void main(String[] args) {
        CreateAnimalServiceImpl animalService = new CreateAnimalServiceImpl();
        System.out.println("Переопределенный метод createAnimals()");
        animalService.createAnimals();
        System.out.println("Перегруженный метод createAnimals():");
        animalService.createAnimals(5);
        System.out.println("Default метод createAnimals():");
        (new CreateAnimalService() {}).createAnimals();

    }
}
