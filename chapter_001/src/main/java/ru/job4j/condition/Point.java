package ru.job4j.condition;

public class Point {

    public static double distance (int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return result;
    }

    public static void main (String[] args) {
        double result = distance(0,0,0,2);
        System.out.println(" result (0,0) to (0,2) " + result);

        result = distance(5,0,3,0);
        System.out.println(" result (5,0) to (3,0) " + result);

        result = distance(8,3,6,5);
        System.out.println(" result (8,3) to (6,5) " + result);
    }
}
