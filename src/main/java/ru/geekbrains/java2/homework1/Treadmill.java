package ru.geekbrains.java2.homework1;

public class Treadmill {
    private int maxLength;

    public Treadmill(int maxLength) {
        this.maxLength = maxLength;
    }

    public void run(Run run){
        run.run(maxLength);
    }
}
