/*
*   основной класс для запуска всего
*/


import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        int numberType = 0;
        System.out.println((char) 27 + "[34m Калькулятор выполняет 4 арифметических действия с \n"+
                                            "       рациональными и комплексными числами \n" + 
                                            "(с округлением результата до 4 знака после запятой)" + (char)27 + "[0m");

// формируем каскадное циклическое меню
        while (flag2) {

            // меню выбора типа числа (рациональное / комплексное)        
            while (flag){
                System.out.println(menu());
                int whatDo = input.nextInt();
                switch(whatDo) {
                    case 1: 
                        numberType = 1;
                        flag = false;
                        flag1 = true;
                        break;
                    case 2:
                        numberType = 2;
                        flag = false;
                        flag1 = true;
                        break;
                    case 3:         // конец программы по операциям с числами
                        flag = false;
                        flag1 = false;
                        flag2 = false; 
                        break;
                    default:
                        System.out.println((char) 27 + "[31mНет такого пункта меню!"+ (char)27 + "[0m");
                }
            }        

            // меню выбора действия с числами
            while (flag1){
                System.out.println(menuOperation());
                int whatDoOperation = input.nextInt();
                switch(whatDoOperation) {
                    case 1,2,3,4: 
                        // выполняем выбранное действие 1 - рациональные, 2 - комплексные
                        if (numberType == 1) new Operation( whatDoOperation, new Rational(), new Rational());
                        if (numberType == 2) new Operation( whatDoOperation, new Complex(1), new Complex(1));
                        flag = true;    // после выполнения действия возвращаемся в меню выбора типа чисел (рациональные / комплексные)
                        flag1 = false;
                        break;
                    case 5: 
                        flag = true;    // решил поменять тип чисел или закончить - возвращаемся в меню выбора типа чисел (рациональные / комплексные)
                        flag1 = false;
                        break;
                    default:
                        System.out.println((char) 27 + "[31mНет такого пункта меню!"+ (char)27 + "[0m");
                }
            }
        }   
    }                  

    // текст меню выбора типа числа (рациональное / комплексное)        
    private static String menu() {
        String menuStr = new StringBuilder()
        .append((char) 27 + "[34m\nВведите с какими числами работаем: \n"+ (char)27 + "[0m")
        .append("1 - рациональные \n")
        .append("2 - комплексные \n")
        .append("3 - Выход ")
        .toString();

        return menuStr;
    }

    // текст меню выбора действия с числами
    private static String menuOperation() {
        String menuStr = new StringBuilder()
        .append((char) 27 + "[34m\nВыберите действие: \n"+ (char)27 + "[0m")
        .append("1 - сложение \n")
        .append("2 - вычитание \n")
        .append("3 - умножение \n")
        .append("4 - деление \n")
        .append("5 - Выход ")
        .toString();

        return menuStr;
    }
}
