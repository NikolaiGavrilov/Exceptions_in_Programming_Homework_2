// Напишите программу, которая проверяет, является ли введенная 
// текстовая строка числом с плавающей точкой (float).
// Программа пытается преобразовать введенную строку в число 
// float, и если это успешно, она выводит полученное число.
// Если преобразование не удалось, программа выдаёт сообщение 
// об ошибке и возвращает специальное значение Float.NaN, 
// чтобы обозначить ошибку.

public class Task1 {
    public static void main(String[] args) {
        String string1 = "3.14";
        System.out.println(IsFloat.isFloat(string1));
        System.out.println();
        String string2 = "text";
        System.out.println(IsFloat.isFloat(string2));
        System.out.println();
        String string3 = "7";
        System.out.println(IsFloat.isFloat(string3));
        System.out.println();
        String string4 = "5.125444646";
        System.out.println(IsFloat.isFloat(string4));
    }
}

class IsFloat {
    public static float isFloat(String input) {
        try {
            float inputFloat = Float.parseFloat(input);
            return inputFloat;
        } catch (Exception e) {
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
        }
  
    }
}