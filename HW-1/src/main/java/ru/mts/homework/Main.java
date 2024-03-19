package ru.mts.homework;

import ru.mts.homework.Services.CreateAnimalService;
import ru.mts.homework.Services.CreateAnimalServiceImpl;

public class Main {
    public static void main(String[] args) {

        CreateAnimalService createAnimalService = new CreateAnimalService(){};
        createAnimalService.createAnimal(); // Default

        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
        createAnimalServiceImpl.createAnimal(5); // Overloading
        createAnimalServiceImpl.createAnimal(); // Override

    }
}