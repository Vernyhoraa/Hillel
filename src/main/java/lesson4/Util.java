package lesson4;

//Создать класс Util и 2 статических метода в нем которые принимать массив типа int
public class Util {
    //    вывести в консоль сумму всех чисел больше 5 и меньше 45 (для подсчета использовать цикл)
    public static int sum(int[] mass) {
        int result = 0;
        for (int j : mass) {
            if (j > 5 && j < 45) {
                result = result + j;
            }
        }
        return result;
    }

    //    вывести в консоль все четные положительные числа.
    public static void positivePrint(int[] array) {
        for (int j : array) {
            if (j % 2 == 0 && j > 0) {
                System.out.println("четное положительное: " + j);
            }
        }
    }

}











