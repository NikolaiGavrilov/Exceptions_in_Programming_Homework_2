// Напишите программу, которая принимает символ a в
// качестве аргумента и выполняет следующую проверку:
// если символ a равен пробелу '', программа должна
// выбрасывать исключение с сообщением
// "Пустая строка введена.".
// В противном случае программа должна возвращать сообщение
// "Ваш ввод - [символ]", где [символ] заменяется 
// на введенный символ a.

// На входе:
// '0'
// На выходе:
// Result: Your input was - 0

import javax.management.RuntimeErrorException;

public class Task4 {
    public static void main(String[] args) {
        try {
            System.out.println(CharProcessing.processChar('A'));
            System.out.println();
            System.out.println(CharProcessing.processChar('B'));
            System.out.println();
            System.out.println(CharProcessing.processChar('1'));
            System.out.println();
            System.out.println(CharProcessing.processChar('+'));
            System.out.println();
            System.out.println(CharProcessing.processChar(' '));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}

class CharProcessing {
    public static String processChar(char a) throws Exception {
        String result;
        try {
            result = "Your input was - " + a;
            if (a == ' '){
                throw new Exception("Empty string has been input.");
            }
            return result;
        } catch (Exception e) {
            throw new RuntimeException("Empty string has been input.");
        }
        
    }
}