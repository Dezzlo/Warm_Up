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
         * Первая множитель, используется для записи числа,
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
     *
     * Проверка множителей, если они имеют значение строго меньше нуля.
     *
     * Проверка множителей, если множитель a неизвестен , а множитель b имеет значение
     * строго больше нуля.
     *
     * @param a
     * @param b
     * @return c
     */
    public static int multiplication(int a , int b){
        int c = 0;

        if (a == 0 || b == 0){
            return 0;
        }
        while((a < 0 && b < 0) || (b < 0)){
            b++;
            c -= a;
        }
        while((a > 0 || a < 0 ) && b > 0){
            b--;
            c += a;
        }


        return c;
    }
}
