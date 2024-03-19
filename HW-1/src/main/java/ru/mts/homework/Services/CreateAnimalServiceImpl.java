package ru.mts.homework.Services;

import ru.mts.homework.Interfaces.Animal;
import ru.mts.homework.Animals.Cat;
import ru.mts.homework.Animals.Dog;
import ru.mts.homework.Animals.Shark;
import ru.mts.homework.Animals.Wolf;

import java.util.Random;
public class CreateAnimalServiceImpl implements CreateAnimalService {
    public void createAnimal(int n) {

        Animal[] animal = new Animal[n];
        Random  rand = new Random();

        System.out.println("CreateAnimalServiceImpl -> Overloading Void -> Cycle 'For' ->");
        for (int i = 0; i < n; i++) {
            int animalClass = rand.nextInt(3);
            switch (animalClass) {
                case 0:
                    animal[i] = new Cat();
                    break;
                case 1:
                    animal[i] = new Dog();
                    break;
                case 2:
                    animal[i] = new Shark();
                    break;
                default:
                    animal[i] = new Wolf();
            }
            System.out.println(animal[i].getName());
        }
    }
    @Override
    public void createAnimal() {

        Animal[] animal = new Animal[10];
        Random  rand = new Random();

        System.out.println("CreateAnimalService -> Override Void -> Cycle 'Do While' ->");
        int i = 0;
        do {
            int animalClass = rand.nextInt(3);
            switch (animalClass) {
                case 0:
                    animal[i] = new Cat();
                    break;
                case 1:
                    animal[i] = new Dog();
                    break;
                case 2:
                    animal[i] = new Shark();
                    break;
                default:
                    animal[i] = new Wolf();
            }
            System.out.println(animal[i].getName());
            i++;
        } while (i < animal.length);
    }
}