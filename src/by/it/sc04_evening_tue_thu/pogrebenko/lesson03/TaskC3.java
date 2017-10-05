package by.it.sc04_evening_tue_thu.pogrebenko.lesson03;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3,86
Земля   9,81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)
Требования:
1. Метод getWeight(int) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
import java.util.Scanner;

class TaskC3 {
    public static void main(String[] args) {

        System.out.println("Ввод: ");
        Scanner sc=new Scanner(System.in);
        int getWeight =sc.nextInt();
        double Mars=3.86;
        double Earth=9.81;
        double result=(getWeight*Mars)/Earth;
        result=result*100;
        int z = (int) Math.round(result);
        result= (double)z/100;
        System.out.println("Вывод:  \n"  + result);
    }

}
