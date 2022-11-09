package lesson4;

//Создать класс Util и 2 статических метода в нем которые принимать массив типа int
public class Util {
    //    вывести в консоль сумму всех чисел больше 5 и меньше 45 (для подсчета использовать цикл)
    public static int mathUtils1(int[] mass) {
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 5 && mass[i] < 45) {
                result = result + mass[i];
            }
        }
        return result;
    }

    //    вывести в консоль все четные положительные числа.
    public static void mathUtils2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > 0) {
                System.out.println("четное положительное: " + array[i]);
            }
        }
    }
}











