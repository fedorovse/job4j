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
    /**
     * z - проекция точки на ось z в декартовой системе координат
     */
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    /**
     * method distance3d - возвращает расстояние между точками в трехмерной декартовой системе координат
     * @param that Point - объект содержащий координаты второй точки
     * @return double - расстояние между точками
     */
    public double distance3d(Point that) {
        return Math.sqrt(Math.pow((that.x - this.x), 2)
                + Math.pow((that.y - this.y), 2)
                + Math.pow((that.z - this.z), 2)
        );
    }

    /**
     * Выводит в консоль координаты точки на плоскости
     */
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    /**
     * Выводит в консоль координаты точки в трехмерной системе координат
     */
    public void info3d() {
        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        System.out.println(" result (0,0) to (0,2) " + result);
        Point c = new Point(5, 0);
        Point d = new Point(3, 0);
        c.info();
        d.info();
        result = c.distance(d);
        System.out.println(" result (5,0) to (3,0) " + result);
        Point e = new Point(8, 3, 5);
        Point f = new Point(6, 5, 4);
        e.info3d();
        f.info3d();
        result = e.distance3d(f);
        System.out.println(" result (8,3,5) to (6,5,4) " + result);
    }
}
