package work1.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Flower rose1 = new Rose(100);
        Flower rose2 = new Rose(100);
        Flower tulip1 = new Tulip(60);

        Flower[] bouquet = {rose1, rose2, tulip1};

        int[] array=new int[3];
        System.out.println(Arrays.toString(array));
        double totalCost = 0;

        System.out.println("Состав букета:");

        for (Flower currentFlower : bouquet) {
            System.out.println(currentFlower.getName() + " - " + currentFlower.getPrice());

        totalCost+= currentFlower.getPrice();
        }

        System.out.println("-----------------");
        System.out.println("Общая стоимость: " + totalCost);
    }
}