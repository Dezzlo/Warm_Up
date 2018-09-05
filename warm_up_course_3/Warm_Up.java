package warm_up_course_3;

import java.util.Scanner;

/**
  * Задача : Написать программу умножения без знака "*"
  *          Выполнить любым доступным способом.
  *
  * Выполнил : @author Nikita Gorshkov 16IT18k
  */
public class Warm_Up {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String args[]){

        int a , b ;

        /**
         * Первый множитель, используется для записи числа,
         * которое будет умножаться.
         */
        System.out.print("Введите число которое вы хотите умножить : ");
        a = scanner.nextInt();

        /**
         * Второй множитель, используется как умножитель на первый множитель.
         */
        System.out.print("Введите число на которое вы хотите умножить : ");
        b = scanner.nextInt();

        /**
         * Вывод метода умножения
         */
        System.out.println("Ответ = " + multiplication(a,b));
    }

    /**
     * Метод который выполняет функцию произведения двух множителей
     *
     * Проверка на ноль, возвращается ноль.
     * Проверка множителей, если они имеют значение больше нуля.
     * Проверка множителей, если они имеют значение меньше нуля.
     * Проверка множителя a, если он имеет значение меньше нуля.
     * Проверка множителя b, если он имеет значение меньше нуля.
     *
     * @param a
     * @param b
     * @return c
     */
    public static int multiplication(int a , int b){
        int c = 0;
        int number_of_operation = 0;

        if (a == 0 || b == 0){
            return 0;
        }
        else if (a > 0 && b > 0 ){
            number_of_operation = b;
            while(number_of_operation > 0) {
                number_of_operation--;
                c += a;
            }
        }
        else if(a < 0 && b < 0)
        {
            number_of_operation = b;
            while(number_of_operation < 0){
                number_of_operation++;
                c -= a;
            }
        }
        else if (a < 0) {
            number_of_operation = b;
            while(number_of_operation > 0){
                number_of_operation--;
                c += a;
            }
        }
        else if( b < 0 )
            number_of_operation = b;
            while(number_of_operation < 0){
                number_of_operation++;
                c -= a;
            }

        return c;
    }
}
