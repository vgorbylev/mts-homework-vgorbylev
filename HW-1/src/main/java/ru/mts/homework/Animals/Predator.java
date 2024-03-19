package ru.mts.homework.Animals;
public class Predator extends AbstractAnimal {
    public Predator() { this.name = "Хищные"; }
    public String getBreed() { return breed; }
    public String getName() {
        return name;
    }
    public Double getCost() {
        return cost;
    }
    public String getCharacter() {
        return character;
    }
}