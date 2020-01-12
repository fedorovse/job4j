package ru.job4j.array;

/**
 * Class MatrixCheck - работа с массивами char[][]
 * @author Sergey Fedorov (ingor-ru@mail.ru)
 * @since 12.01.2020
 * @version 1
 */
public class MatrixCheck {

    /**
     * Method monoHorizontal - проверяет заполнена ли данная строка полностью символом 'X'
     * @param board char[][] - входной массив
     * @param row int - индекс строки в массиве, которую проверяем
     * @return boolean - true если строка заполнена 'X', false - если нет
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Method monoVertical - проверяет заполнен ли данный столбец полностью символом 'X'
     * @param board char[][] - входной массив
     * @param column int - индекс столба в массиве, которую проверяем
     * @return boolean - true если столбец заполнен 'X', false - если нет
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Method extractDiagonal - возвращает одномерный массив заполненный символами из диагонали входного
     * @param board char[][] - входной массив
     * @return char[] - массив с символами из диагонали входного массива
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            result[index] = board[index][index];
        }
        return result;
    }

    /**
     * Method isWin - проверяет есть ли выигрышная комбинация в игре сокобан
     * @param board char[][] - входной массив
     * @return boolean - true если есть выигрышная комбанация, false - если нет
     */
    public static boolean isWin (char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (monoHorizontal(board, index) || monoVertical(board, index)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
