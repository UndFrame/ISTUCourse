package ru.undframe.istucourse.model;

import java.util.Objects;
import java.util.Random;

public class Kotik {

    private static int kotikCount = 0;

    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private int foodLvl;


    public Kotik() {
        kotikCount++;
    }

    public Kotik(int prettiness, int weight, String name, String meow) {
        setKotik(prettiness, weight, name, meow);
        kotikCount++;
    }


    public void setKotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }

    public static int getKotikCount(){
        return kotikCount;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getMeow() {
        return meow;
    }

    public boolean play(){
        if(isHungry()){
            askFood();
            return false;
        }

        System.out.println("Playing... ");
        foodLvl-=10;
        return true;
    }

    public boolean sleep(){
        if(isHungry()){
            askFood();
            return false;
        }

        System.out.println("Сплю...");
        foodLvl-=1;
        return true;
    }

    public boolean chaseMouse(){
        if(isHungry()){
            askFood();
            return false;
        }

        System.out.println("поймал Джерри");
        foodLvl-=3;
        eat(30,"Джерри");
        return true;
    }

    public void eat(int foodLvl) {
        this.foodLvl+=foodLvl;
        System.out.println("=поел("+foodLvl+")=");
    }
    public void eat(int foodLvl,String foodName) {
        this.foodLvl+=foodLvl;
        System.out.println("=поел("+foodLvl+"/"+foodName+")=");
    }

    public void eat(){
        this.eat(10,"Whiskas");
    }

    public void liveAnotherDay(){
        for (int i = 0; i < 24; i++) {
            Random random = new Random();

            int command = random.nextInt(3);

            switch (command){
                case 0:
                    if(!play())
                        eat();
                    break;
                case 1:
                    if(!sleep())
                        eat();
                    break;
                case 2:
                    if(!chaseMouse())
                        eat();
                    break;
            }


        }
    }

    private boolean isHungry(){
        return foodLvl<=0;
    }

    private void askFood(){
        System.out.println("==Я ХОЧУ КУШАТЬ!!!!==");
    }

    @Override
    public String toString() {
        return "Kotik{" +
                "prettiness=" + prettiness +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", meow='" + meow + '\'' +
                ", foodLvl=" + foodLvl +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kotik kotik = (Kotik) o;
        return Objects.equals(meow, kotik.meow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meow);
    }
}
