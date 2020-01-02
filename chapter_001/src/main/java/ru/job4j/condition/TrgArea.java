package ru.job4j.condition;

public class TrgArea {

    public static double area (double a, double b, double c) {
        double halfP = (a + b + c) / 2;
        double result = Math.sqrt(halfP * ( halfP - a) * (halfP - b) * ( halfP - c));
        return result;
    }

    public  static  void main (String[] args) {
        double result = TrgArea.area(2,2,2);
        System.out.println(" area(2,2,2) =  " + result);
    }
}
