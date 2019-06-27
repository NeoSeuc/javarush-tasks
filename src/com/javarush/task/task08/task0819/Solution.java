package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Cat cat = (Cat)cats.toArray()[0];
        cats.remove(cat);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat("John"));
        cats.add(new Cat("Evan"));
        cats.add(new Cat("Asha"));
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat :
                cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        String name;

        Cat() {

        }

        Cat(String name) {
            this.name = name;
        }

    }
}