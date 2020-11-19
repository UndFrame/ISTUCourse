package ru.undframe.istucourse;

import ru.undframe.istucourse.model.Kotik;

import java.util.Random;

public class Application {

    public static void main(String[] args) {

        Random random = new Random();

        Kotik tom = new Kotik(random.nextInt(10) + 5, random.nextInt(20) + 5, "Том", "мяуууууууууууууу");
        Kotik basya = new Kotik();
        basya.setKotik(random.nextInt(10) + 5, random.nextInt(20) + 5, "Бася", "мяяяяяяяяяяяяу");

        tom.liveAnotherDay();
        System.out.println("Name: "+tom.getName()+" Возраст: "+tom.getWeight());
        System.out.println(tom.getMeow().equals(basya.getMeow()));
    }

}
