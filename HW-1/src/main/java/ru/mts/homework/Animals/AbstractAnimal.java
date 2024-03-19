package ru.mts.homework.Animals;

import ru.mts.homework.Interfaces.Animal;
public abstract class AbstractAnimal implements Animal {
    protected String breed; // порода
    protected String name; // имя
    protected Double cost; // цена в магазине
    protected String character; // характер
    public String getBreed() { return breed; }
    public String getName() { return name; }
    public Double getCost() { return cost; }
    public String getCharacter() { return character; }
}