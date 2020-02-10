package ru.job4j.stragery;

/**
 * @author Sergey Fedorov (ingor-ru@mail.ru)
 * @version 1
 * @since 09.02.2020
 */
public class Paint {

    /**
     * Выводит в консоль фигуру
     * @param shape геометрическая фигура в виде строки
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new Square());
        paint.draw(new Triangle());
    }
}
