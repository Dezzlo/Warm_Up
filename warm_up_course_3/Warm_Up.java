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

        double a , b ;

        /**
         * Первая переменная, используется для записи числа,
         * которое будет умножаться.
         */
        a = scanner.nextDouble();

        /**
         * Вторая переменная, используется как умножитель(Счетчик умножений(кол-ва))
         */
        b = scanner.nextDouble();

        /**
         * Вывод метода умножения
         */
        System.out.println(multiplication(a,b));
    }

    /**
     * Метод который выполняет функцию умножения с помощью цикла for
     *
     * @param a
     * @param b
     * @return c
     */
    public static double multiplication(double a , double b){
        double c = 0;

        for ( int i = 1 ; i <= b ; i++ ) {
            c += a;
        }

        return c;
    }
}
