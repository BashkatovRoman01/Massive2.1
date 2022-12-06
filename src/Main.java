import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] array = arrayRandom(30);
        // Найти сумму расходов
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println(" Сумма расходов в месяц составила " + sum);
        // Найти максимальный и минимальный расход
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(" Минимальное значение = " + min + "; Максимальное зщанчение = " + max);
        // Найти средний расход
        System.out.println("Средний расход за месяц составил " + sum / array.length);
        // Вывести "Иван Иванович Иванов" в обратном порядке
        String string = "Иван Иванович Иванов";
        char [] stringToChar = string.toCharArray();
        System.out.println(Arrays.toString(stringToChar));
        for (int i = stringToChar.length-1; i >=0 ; i--) {
            System.out.println(stringToChar[i]);
        }
    }

            public static int[] arrayRandom(int length){
            Random random = new Random();
            int[] array = new int[length];
            for (int i = 0; i < length; i++) {
                array[i] = random.nextInt(100_000) + 100_000;
            }
            return array;
        }
    }


