package ru.geekbrains.java2.homework1;

public class MainApp {
    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(20);
        Wall wall = new Wall(8);

         Run[] runs = {
                 new Cat("Барсик", 15, 12),
                 new Human("Филипп", 70, 5),
                 new Robot("t1000",500, 80)

        };
         for (Run r : runs){
             treadmill.run(r);
         }
         Jump [] jumps = {
                 new Cat("Барсик", 15, 12),
                 new Human("Филипп", 70, 5),
                 new Robot("t1000", 500, 80)
         };
        for (Jump j : jumps){
            wall.jump(j);
        }




    }
}
