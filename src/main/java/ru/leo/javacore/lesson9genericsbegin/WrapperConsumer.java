package ru.leo.javacore.lesson9genericsbegin;


import java.util.function.Consumer;

class Person {
    int id =5;
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class WrapperConsumer {
    class Box<T> {
        T value;

        public Box(T value) {
            this.value = value;
        }

        Boolean isEquals(Box<?> otherBox) {
            return value == otherBox.value;
        }
    }


}



