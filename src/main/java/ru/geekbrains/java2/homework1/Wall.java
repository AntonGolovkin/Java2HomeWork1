package ru.geekbrains.java2.homework1;

public class Wall  {
    private int maxHeight;

    public Wall(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public void jump(Jump jump){
        jump.jump(maxHeight);

    }
}
