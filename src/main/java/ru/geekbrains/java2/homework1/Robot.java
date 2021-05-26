package ru.geekbrains.java2.homework1;

public class Robot implements Run, Jump{
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }
    @Override
    public void run(int maxLength){
        if (maxRunDistance >= maxLength) {
            System.out.println(name + " Пробежал!");
        }else {
            System.out.println(name + " Не смог пробежать!");
        }

    }
    @Override
    public void jump(int maxHeight){
        if (maxJumpHeight >= maxHeight) {
            System.out.println(name + " Перепрыгнул препятствие!");
        }else {
            System.out.println(name + " Не смог перепрягнуть препятствие!");
        }

    }
}
