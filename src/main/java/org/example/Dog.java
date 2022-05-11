package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Dog implements Animal {
    @Value("${dog.name}")
    private String name;
    @Value("${dog.age}")
    private String age;
    @Value("${dog.color}")
    private String color;
    @Value("${dog.species}")
    private String species;

    public Dog() {
    }

    public Dog(String name, String age, String color, String species) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void animalPlus() {
        System.out.println("dog plus");
    }

    @Override
    public void animalMinus() {
        System.out.println("dog minus");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
