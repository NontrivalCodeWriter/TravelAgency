package ru.leo.javacore.testnewfeature;

public class Dog {
    String name;
    int id;

    public Dog(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void sit(){}

}
