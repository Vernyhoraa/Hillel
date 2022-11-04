package homeWork;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        //    создать массив типа int из 20 елементов.
        int[] myArray = new int[20];
        //    вывести в консоль сумму всех чисел больше 5 и меньше 45 (для подсчета использовать цикл)
        int[] mass = new int[]{1, -10, 16, 181, 45, 7, 89, 5, 13, -80, 76, 14, 18, 19, 15};
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
//            System.out.println("My mass: " + mass[i]);
            if (mass[i] > 5 && mass[i] < 45) {
                System.out.println("больше 5 и меньше 45: " + mass[i]);
                result = result + mass[i];
//              result += mass[i];
            }
        }
        System.out.println(result);
        //    вывести в консоль все четные положительные числа
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0 && mass[i] > 0) {
                System.out.println("четное положительное: " + mass[i]);
            }
        }
    }
}


