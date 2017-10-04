package by.it.sc04_evening_tue_thu.pogrebenko.lesson03;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Ввод:
34 26

Вывод:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OKT:42+32=74
*/
import java.util.Scanner;

class TaskC2 {
    public static void main(String[] args) {

        System.out.println("Ввод: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Вывод: ");
        for (int k = 0; k < 10; k++) {
            {
                if (i > 2) i = i % 2;
                else i = 1;
                System.out.println(i);
            }
        }
    }
}

