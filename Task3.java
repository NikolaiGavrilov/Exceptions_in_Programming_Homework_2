// Напишите программу для выполнения арифметической операции 
// деления двух целых чисел a и b.
// При этом программа должна проверить, что делитель b не 
// равен нулю, и выполнить деление только в этом случае.
// Если b равен нулю, программа должна вывести сообщение о 
// невозможности выполнения операции и вернуть результат равный нулю.
// После выполнения операции деления, программа также должна 
// вывести сумму чисел a и b с помощью метода printSum.
// Если аргументы не переданы через командную строку, 
// используйте значения по умолчанию.

// На входе:
// '12'
// '5'
// На выходе:
// 17
// 2.4

public class Task3 {
    public static void main(String[] args) {
        System.out.println(Calculations.calculateSum(12,5));
        System.out.println(Calculations.calculateDiv(12,5));
        System.out.println();
        System.out.println(Calculations.calculateSum(7, 0));
        System.out.println(Calculations.calculateDiv(7, 0));
        System.out.println();
    }
}

class Calculations {

    public static double calculateDiv(int a, int b) {
        try {
            double result = (double) a/b;
            if (result == Double.POSITIVE_INFINITY) throw new ArithmeticException();
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not supported");
            return 0;
        }

}

    public static int calculateSum(int a, int b) {
        try {
            return a+b;
        } catch (NullPointerException e) {
            System.out.println("Both arguments mustn't be null");
            return 0;
        }
    }
}