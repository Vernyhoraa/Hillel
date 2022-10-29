package homeWork;

public class HomeWork2 {
    public static void main(String[] args) {
        //вывести на консоль количество символов
        String myString = "Elena Vernyhora";
        System.out.println(myString.length());

        //вывести на консоль чтоб только первая буква была заглавной.
        String name = "elena";
        String firstChar = String.valueOf(name.charAt(0));
        String capitalName = name.replaceFirst(firstChar, firstChar.toUpperCase());
        System.out.println(capitalName);

    }

}
