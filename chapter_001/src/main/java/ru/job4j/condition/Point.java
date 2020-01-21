package ru.job4j.condition;

/**
 * class Point вычисления в декартовой системе координат
 * @author Sergey Fedorov (ingor-ru@mail.ru)
 * @version 2
 */
public class Point {

    /**
     * x - проекция точки на ось Х в декартовой системе координат
     */
    private int x;
    /**
     * у - проекция точки на ось У в декартовой системе координат
     */
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * method distance - вычисляет расстояние между точками в декартовой системе координат. Первая точка - текущий
     * объект Point
     * @param that Point - объект содержащий коорднаты второй точки.
     * @return double - расстояние между точками.
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow((that.x - this.x), 2) + Math.pow((that.y - this.y), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        System.out.println(" result (0,0) to (0,2) " + result);
        Point c = new Point(5, 0);
        Point d = new Point(3, 0);
        result = c.distance(d);
        System.out.println(" result (5,0) to (3,0) " + result);
        Point e = new Point(8, 3);
        Point f = new Point(6, 5);
        result = e.distance(f);
        System.out.println(" result (8,3) to (6,5) " + result);
    }
}
