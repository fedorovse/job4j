package ru.job4j.condition;

/**
 *
 */
public class Triangle {

    /**
     * поля first, second, third - это объекты Point с координатами в декартовой системе координат
     */
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Расчитывает площадь треугольника если это возможно
     * @return double - площадь треугольника, если невозможно рассчитать, то -1
     */
    public double area() {
        double result = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        if (this.exist(a, b, c)) {
            double halfP = this.period(a, b, c);
            result = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
        }
        return  result;
    }

    /**
     * method period - вычисляет полупериметр треугольнико образованного сторонами a, b, c.
     * @param a - расстояние между точками ab
     * @param b - расстояние между точками ac
     * @param c - расстояние между точками bc
     * @return
     */
    public double period(double a, double b, double c) {
        if (exist(a, b, c)) {
            return (a + b + c) / 2;
        } else {
            return  -1;
        }
    }

    /**
     * method exist - проверяет возможно ли построить треугольник с такими сторонами
     * @param a - расстояние между точками ab
     * @param b - расстояние между точками ac
     * @param c - расстояние между точками bc
     * @return true - если треугольник построить возможно и false - если нет.
     */
    private boolean exist(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
