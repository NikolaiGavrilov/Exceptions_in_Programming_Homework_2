// Напишите программу, которая вычисляет значение выражения 
// intArray[8] / d, гдеintArray- массив целых чисел, а d - делитель.
// Программа проверяет, имеется ли в массиве intArray элемент с 
// индексом 8, и если нет, выводит сообщение о невозможности выполнения операции.
// Также программа проверяет, равен ли делитель d нулю, 
// и если да, выводит соответствующее сообщение.

// На входе:
// '1 2 3 4 5 6 7 8 9'
// '1'
// На выходе:
// intArray[8] / d = 9 / 1 = 9.0
// 9.0

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Expr.expr(array1, 1));
        System.out.println();

        int[] array2 = {1, 2, 3, 4};
        System.out.println(Expr.expr(array2, 2));
        System.out.println();
        
        System.out.println(Expr.expr(array1, 0));
    }
}

class Expr {
    public static double expr(int[] intArray, int d) {
        try {
            double result = intArray[8]/d;
            System.out.printf("intArray[8] / d = %d / %d = %.1f\n", intArray[8], d, result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Double.NaN;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Double.NaN;
        } catch (Exception e) {
            System.out.println("Exception");
            return Double.NaN;
        }
    }
}
